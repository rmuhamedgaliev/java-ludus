package dev.rmuhamedgaliev.yandex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Scanner;


public class DuplicateItems {

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
            );
        )
        {
            int countOfElements = Integer.parseInt(br.readLine());
            int[] arr = new int[countOfElements];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(br.readLine());
                if (i == 0 || arr[i] != arr[i - 1]) {
                    System.out.println(
                        "" + arr[i]
                    );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
