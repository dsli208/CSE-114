/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureNotes9to13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*; //* means basically ANYTHING in java
/**
 *
 * @author dsli
 */
public class FileEx {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            File f = new File("src/LectureNotes9to13/lec9to13ex1");
            Scanner s = new Scanner(f);
            PrintWriter out = new PrintWriter(f);
            PrintWriter p2 = new PrintWriter(System.out);
            while (s.hasNext()) {
                String line = s.next();
                p2.println(line);
            }
            
            out.print("100 20 40");
            out.close();
        }
        catch (FileNotFoundException e1) {
            System.out.println("Error");
        }
        catch (IOException e) {
            System.out.println("No file found");
        }
    }
}
