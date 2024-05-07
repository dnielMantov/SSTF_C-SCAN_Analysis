package src.cscan;

import src.utils.Utils;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class RunCSCAN {

    public static void main(String[] args) {
        CSCAN cscan = new CSCAN();
        DecimalFormat df = new DecimalFormat("#.##");


        // Generate X random requests within a specified range
        int base                = 0;        // initial number of the range
        int bounds              = 35;       // last number of the range
        int number              = 20;       // number of requests
        boolean printRequests   = true;     // Print the random requests


        ArrayList<Integer> requests = Utils.getRandomRequests(base, bounds, number);
        if (printRequests)
            System.out.println("Requests:\n" + requests);


        // Select parameters
        int sectorSize          = 512;      // size of a sector in KB
        int tracks              = 3;        // number of tracks in one disk
        int sectorsPerTrack     = 12;       // number of sectors in one track
        int transferRate        = 100;      // transfer rate in MB
        double seekTime         = 4;        // R/W head seek time in ms
        double rotationTime     = 2;        // disk rotation time in ms
        int initialSector       = 21;       // initial position of disk arm's head
        boolean printSectors    = true;     // Print the accessed sectors


        double totalTime = cscan.run(sectorSize, tracks, sectorsPerTrack, transferRate, seekTime, rotationTime, initialSector, requests, printSectors);
        System.out.println(df.format(totalTime) + " ms");
    }

}
