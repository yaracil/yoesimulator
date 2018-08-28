/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yoesimulator;

/**
 *
 * @author IT
 */
import java.util.*;  // Need this for Random
import java.io.*;  // For BufferedWriter

public class GenerateUniform {

    public static void main(String[] args) {
        Random rng = new Random(); // Random Number Generator
        BufferedWriter output = null; // file for writing

        // Try to open the file
        try {
            // create a writer 
            output
                    = new BufferedWriter(new FileWriter("D:/cs1316/uniform.txt"));
        } catch (Exception ex) {
            System.out.println("Trouble opening the file.");
        }
        // Fill it with 500 numbers between 0.0 and 1.0, uniformly distributed
        for (int i = 0; i < 500; i++) {
            try {
                output.write("\t" + rng.nextFloat());
                output.newLine();
            } catch (Exception ex) {
                System.out.println("Couldn't write the data!");
                System.out.println(ex.getMessage());
            }
        }
        // Close the file
        try {
            output.close();
        } catch (Exception ex) {
            System.out.println("Something went wrong closing the file");
        }
    }
}
