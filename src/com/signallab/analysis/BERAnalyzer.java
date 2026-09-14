package com.signallab.analysis;

public class BERAnalyzer {

    /**
     * Calculates the Bit Error Rate (BER) by comparing the original bitstream
     * with the processed/transmitted bitstream.
     */
    public double calculateBER(int[] originalBits, int[] processedBits) {
        int minLength = Math.min(originalBits.length, processedBits.length);
        if (minLength == 0) {
            return 0.0;
        }

        int errorCount = 0;
        for (int i = 0; i < minLength; i++) {
            if (originalBits[i] != processedBits[i]) {
                errorCount++;
            }
        }

        // Return ratio of corrupted bits to total transmitted bits
        return (double) errorCount / minLength;
    }

    /**
     * Counts the total number of mismatched bits between two streams.
     */
    public int countErrors(int[] originalBits, int[] processedBits) {
        int minLength = Math.min(originalBits.length, processedBits.length);
        int errorCount = 0;
        for (int i = 0; i < minLength; i++) {
            if (originalBits[i] != processedBits[i]) {
                errorCount++;
            }
        }
        return errorCount;
    }
}
