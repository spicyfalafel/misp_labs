package com.company;

import com.company.invoker.Invoker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class Main {

    public static ResourceBundle bundleDefault = ResourceBundle.getBundle("messages");

    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print(">>> ");
            String userCommand = br.readLine();

            if (!invoker.invoke(userCommand)) {
                System.out.println(bundleDefault.getString("doityourself"));
            }
        }
    }
}
