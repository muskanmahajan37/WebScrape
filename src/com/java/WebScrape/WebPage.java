package com.java.WebScrape;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class WebPage {
   public static void main(String[] args) throws Exception {
      URL url = new URL("https://www.youtube.com/watch?v=KQ433E2R3U0");
      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
      String line;
      while ((line = reader.readLine()) != null) {
         System.out.println(line);
         writer.write(line);
         writer.newLine();
      }
      reader.close();
      writer.close();
   }
}