package dev.rmuhamedgaliev.yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Braces {

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
            );
        )
        {
            int countOfBraces = Integer.parseInt(br.readLine());

            ArrayDeque<Character> queue = new ArrayDeque<>();

            for (int i = 0; i < countOfBraces; i++) {

                if (queue.size() == 0) {
                    queue.addFirst('(');
                    continue;
                }

                if (queue.peekFirst() == '(') {
                    queue.addFirst(')');
                } else {
                    queue.addFirst('(');
                }
            }

            queue.forEach(System.out::print);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
