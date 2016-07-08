//package vk.core.api;

import java.io.*;

public class TestFail {
    //Aufgabe aus Katalog wird eingelesen
    private static String readExercise(String a) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(a));
        String momPlace = null;
        StringBuilder sb = new StringBuilder();
        String sep = System.getProperty("line.separator");

        while ((momPlace = br.readLine()) != null) {
            sb.append(momPlace);
            sb.append(sep);
        }
        return sb.toString();
    }


    //Main zum Testen...
    public static void main (String[] args) throws IOException {
        String test = readExercise("test.txt");
        System.out.print(test);
    }


}
