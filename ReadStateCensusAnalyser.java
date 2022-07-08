package com.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadStateCensusAnalyser {
    public static void main(String[] args) {

        try {
            String path = "srC/com/assignment/file.csv";
            String line = " ";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            while((line = bufferedReader.readLine()) != null){
                String[] censusValues = line.split(",");
                System.out.println("State"+censusValues[0]+",Population"+censusValues[1]+",AreaSqKm"+censusValues[1]);
            }
        } catch(IOException message){
            System.out.println(message);
        }
    }
}
