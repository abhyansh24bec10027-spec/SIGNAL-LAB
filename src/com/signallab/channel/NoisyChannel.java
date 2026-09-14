package com.signallab.channel;

import java.util.Random;

public class NoisyChannel {
    private final Random random = new Random();

    /**
     * Simulates real-world transmission noise by randomly flipping bits 
     * based on a user-defined Bit Error Probability (0.0 to 1.0).
     */
    public int[] introduceNoise(int[] encodedStream, double errorProbability) {
        int[] noisyStream = new int[encodedStream.length];
        System.arraycopy(encodedStream, 0, noisyStream, 0, encodedStream.length);

        for (int i = 0; i < noisyStream.length; i++) {
            if (random.nextDouble() < errorProbability) {
                // Flip the bit: 1 becomes 0, 0 becomes 1
                noisyStream[i] = (noisyStream[i] == 1) ? 0 : 1;
            }
        }
        return noisyStream;
    }
}
