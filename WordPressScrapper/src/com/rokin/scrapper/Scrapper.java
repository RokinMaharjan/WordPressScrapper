/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.scrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rokin
 */
public class Scrapper {
    public String grabContent() throws IOException
    {
        List<String> urlList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        
        
        URL url = new URL("https://lilbitofanything.wordpress.com/");
        URLConnection urlConnection = url.openConnection();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line = "";
        StringBuilder builder = new StringBuilder();

        while ((line = reader.readLine()) != null)
        {
            builder.append(line + "\n");
        }
        reader.close();
        
        System.out.println(builder.toString());
        
        return null;
    }
}
