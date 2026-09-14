package com.signallab.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileHandler {

    /**
     * Saves simulation performance summaries and metrics to a text file 
     * inside a dedicated data directory.
     */
    public void saveSimulationReport(String reportContent) {
        try {
            // Create a data folder outside the src folder to store report outputs cleanly
            File directory = new File("C:\\SignalLab\\data");
            if (!directory.exists()) {
                directory.mkdirs();
            }

            // Timestamp the log file so consecutive test sessions do not overwrite each other
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            File file = new File(directory, "Simulation_Report_" + timestamp + ".txt");

            try (FileWriter writer = new FileWriter(file)) {
                writer.write(reportContent);
                System.out.println("\n[SYSTEM LOG] Complete simulation matrix written successfully to: " + file.getAbsolutePath());
            }

        } catch (IOException e) {
            System.err.println("[CRITICAL ERROR] Failed to save runtime tracking log to disk: " + e.getMessage());
        }
    }
}
