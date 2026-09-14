package com.signallab.encoding;

public class HammingCode {

    // Encodes a complete bitstream by dividing it into 4-bit blocks
    public int[] encodeStream(int[] rawBits) {
        // Pad array with zeros to ensure its length is a multiple of 4
        int paddedLength = (int) (Math.ceil(rawBits.length / 4.0) * 4);
        int[] data = new int[paddedLength];
        System.arraycopy(rawBits, 0, data, 0, rawBits.length);

        int totalBlocks = paddedLength / 4;
        int[] encodedStream = new int[totalBlocks * 7];

        for (int b = 0; b < totalBlocks; b++) {
            int[] d = new int[4];
            System.arraycopy(data, b * 4, d, 0, 4);
            int[] blockEncoded = encodeBlock(d);
            System.arraycopy(blockEncoded, 0, encodedStream, b * 7, 7);
        }
        return encodedStream;
    }

    // Standard systematic (7,4) Hamming code block builder
    // Data positions mapping: d1->idx2, d2->idx4, d3->idx5, d4->idx6
    // Parity positions mapping: p1->idx0, p2->idx1, p3->idx3
    private int[] encodeBlock(int[] d) {
        int[] c = new int[7];
        c[2] = d[0]; 
        c[4] = d[1]; 
        c[5] = d[2]; 
        c[6] = d[3];
        
        c[0] = c[2] ^ c[4] ^ c[6]; // P1 = d1 ^ d2 ^ d4
        c[1] = c[2] ^ c[5] ^ c[6]; // P2 = d1 ^ d3 ^ d4
        c[3] = c[4] ^ c[5] ^ c[6]; // P3 = d2 ^ d3 ^ d4
        return c;
    }

    // Computes error syndrome and fixes single-bit corruptions per block
    public int[] decodeAndCorrectBlock(int[] block) {
        int p1 = block[0] ^ block[2] ^ block[4] ^ block[6];
        int p2 = block[1] ^ block[2] ^ block[5] ^ block[6];
        int p3 = block[3] ^ block[4] ^ block[5] ^ block[6];
        
        int errorPos = p1 + (p2 * 2) + (p3 * 4); // Binary integer index mapping

        // Fix bit if syndrome is non-zero (indicating an error)
        if (errorPos != 0 && errorPos <= 7) {
            block[errorPos - 1] = (block[errorPos - 1] == 1) ? 0 : 1;
        }

        // Extract and return raw original 4 data bits
        return new int[] { block[2], block[4], block[5], block[6] };
    }
}
