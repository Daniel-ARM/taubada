package com.botech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "S";
        while (resposta.equals("S") || resposta.equals("s")) {
            System.out.print("Tabuada: ");
            int tabuada = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
            System.out.println("Continuar?");
            resposta = scanner.next();
        }
    }
}
