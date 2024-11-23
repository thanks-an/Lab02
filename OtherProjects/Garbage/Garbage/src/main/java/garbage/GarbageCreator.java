/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author ASUS
 */
public class GarbageCreator {
    
    String filename = "test.exe"; // test.exe is the name or path to an executable file 
    byte[] inputBytes = { 0 };
    long startTime, endTime;
    
    public void createGarbage() throws Exception {
        inputBytes = Files.readAllBytes (Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char)b;
        }
        /*
        StringBuilder outputStringBuilder = new StringBuilder(); 
        for (byte b : inputBytes) {
            outputStringBuilder.append((char)b);
        }
        */
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
