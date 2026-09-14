package com.signallab.signal;

import com.signallab.exceptions.InvalidSignalException;

public class SignalGenerator {
    
    // Generates analog values and validates Nyquist criterion: Fs >= 2 * Freq
    public double[] generateAnalogSignal(Waveform type, double frequency, double samplingRate, int durationSec) 
            throws InvalidSignalException {
        
        if (frequency <= 0 || samplingRate <= 0 || durationSec <= 0) {
            throw new InvalidSignalException("Frequency, sampling rate, and duration must be positive values.");
        }
        if (samplingRate < 2 * frequency) {
            throw new InvalidSignalException("Nyquist Shannon violation! Sampling rate (" + samplingRate 
                + " Hz) must be at least twice the signal frequency (" + frequency + " Hz).");
        }

        int totalSamples = (int) (samplingRate * durationSec);
        double[] signal = new double[totalSamples];

        for (int i = 0; i < totalSamples; i++) {
            double t = i / samplingRate;
            switch (type) {
                case SINE:
                    signal[i] = Math.sin(2 * Math.PI * frequency * t);
                    break;
                case SQUARE:
                    signal[i] = (Math.sin(2 * Math.PI * frequency * t) >= 0) ? 1.0 : -1.0;
                    break;
                case SAWTOOTH:
                    signal[i] = 2 * (t * frequency - Math.floor(0.5 + t * frequency));
                    break;
            }
        }
        return signal;
    }

    // Simplistic Quantizer: Converts double array to a normalized binary stream (bitstream)
    public int[] toBitstream(double[] analogSignal) {
        int[] bitstream = new int[analogSignal.length];
        for (int i = 0; i < analogSignal.length; i++) {
            // Threshold at 0.0 to generate binary 1s and 0s
            bitstream[i] = (analogSignal[i] >= 0.0) ? 1 : 0;
        }
        return bitstream;
    }
}
