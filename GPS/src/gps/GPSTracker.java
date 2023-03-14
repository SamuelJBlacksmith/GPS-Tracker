package gps;

import java.util.Scanner;

public class GPSTracker {
    public static void main(String[] args) {
        // Initialize GPS object
        GPS gps = new GPS();
        
        // Set up loop to track GPS location
        while (true) {
            // Retrieve current latitude and longitude
            double latitude = gps.getLatitude();
            double longitude = gps.getLongitude();
            
            // Print latitude and longitude to console
            System.out.println("Latitude: " + latitude + ", Longitude: " + longitude);
            
            // Sleep for 1 second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class GPS {
    public double getLatitude() {
        // Replace this with code to retrieve latitude from GPS module or device
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter latitude: ");
        double latitude = scanner.nextDouble();
        return latitude;
    }
    
    public double getLongitude() {
        // Replace this with code to retrieve longitude from GPS module or device
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter longitude: ");
        double longitude = scanner.nextDouble();
        return longitude;
    }
}
