package com.jiker.keju;

import com.jiker.keju.bean.Taxi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppRunner {

    static Taxi taxi = new Taxi();

    public static void main(String[] args) {
        String receipt = readFile(args[0]);
        String[] testData = receipt.split("\n");
        for (int i = 0; i < testData.length; i++) {
            int mileage = Integer.parseInt(testData[i].split(",")[0].replace("公里", ""));
            int waitingTime = Integer.parseInt(testData[i].split(",")[1].replace("等待", "").replace("分钟", ""));
            int total = taxi.valuation(mileage, waitingTime);
            System.out.println("收费" + total + "\n");
        }
    }

    public static String readEnd(BufferedReader b) throws IOException {
        String str = null;
        String string = "";
        while ((str = b.readLine()) != null) {
            string += str + "\n";
        }
        return string;
    }



    public static String readFile(String fileName) {
        try {
            BufferedReader b = new BufferedReader(new FileReader(fileName));
            return readEnd(b);
        } catch (Exception ex) {
            System.out.println("file not found");
        }
        return null;
    }
}
