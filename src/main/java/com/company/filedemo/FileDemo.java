/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.filedemo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kamau
 */
public class FileDemo {

    public static void main(String[] args) {

        //        File file = new File("message.txt");
//        
//
//        if(file.exists()){
//            System.out.println("the file exists");
//            System.out.println(file.getPath());
//            System.out.println(file.getAbsolutePath());
//            System.out.println(file.isFile());
//            System.out.println(file.canExecute());
//           file.delete();
//            
//        }else{
//            System.out.println("the file does not exist");
//        }
        //create a new file and write on it
        try {
            String data = "This is created from java the program";
            OutputStream output = new FileOutputStream("C:\\Users\\kamau\\Documents\\output");
            byte[] array = data.getBytes();
            output.write(array);

            output.close();

        } catch (Exception ex) {
            System.out.println("error: " + ex.getMessage());
        }

        try {
            
                       //read from the file

            BufferedInputStream bs = new BufferedInputStream(new FileInputStream("C:\\Users\\kamau\\Documents\\output"));
            int i = bs.read();

            //  System.out.println("the first character is "+ (char) i);
            // to read the whole text we use a loop
            while (i != -1) {
                System.out.print((char) i);
                 i = bs.read();
            }

        } catch (Exception ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}
