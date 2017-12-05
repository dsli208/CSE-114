/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author dsli
 */
public class Replace {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/Lab19/SampleJavaFile");
        File h = new File("src/Lab19/NewHTMLFile");
        Scanner reader = new Scanner(f);
        String s = "";
        while (reader.hasNext()) {
            s += reader.nextLine() + "\n";
        }
        reader.close();
        PrintWriter p = new PrintWriter(f);
        String r = s.replaceAll("Java", "HTML");
        p.print(r);
        p.close();
    }
}
