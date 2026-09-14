package com.signallab.receiver;

import com.signallab.encoding.HammingCode;
import com.signallab.exceptions.TransmissionException;

public class Receiver {
    private final HammingCode hammingCode = new HammingCode();

    /**
     * Processes the received noisy stream, processes it block-by-block (7 bits),
     * corrects single-bit errors, and extracts the original 4-bit data stream.
     */
    public int[] processIncomingStream(int[] noisyStream) throws TransmissionException {
        if (noisyStream.length % 7 != 0) {
            throw new TransmissionException("Data corruption critical: Received stream length is not a multiple of 7 bits.");
        }

        int totalBlocks = noisyStream.length / 7;
        int[] reconstructedBits = new int[totalBlocks * 4];

        for (int b = 0; b < totalBlocks; b++) {
            int[] receivedBlock = new int[7];
            System.arraycopy(noisyStream, b * 7, receivedBlock, 0, 7);

            // Decode and automatically patch single-bit errors via Hamming syndrome rules
            int[] correctedData = hammingCode.decodeAndCorrectBlock(receivedBlock);
            System.arraycopy(correctedData, 0, reconstructedBits, b * 4, 4);
        }
        return reconstructedBits;
    }
}
