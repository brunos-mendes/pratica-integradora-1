package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        String[] cidades = new String[10];
        int temperaturas[][] = new int[10][2];
        int tempMin = 0;
        int tempMax = 0;
        int indexMin = 0;
        int indexMax = 0;

        cidades[0] = "Londres";
        cidades[1] = "Madrid";
        cidades[2] = "Nueva York";
        cidades[3] = "Buenos Aires";
        cidades[4] = "Assunción";
        cidades[5] = "São Paulo";
        cidades[6] = "Lima";
        cidades[7] = "Santiago de Chile";
        cidades[8] = "Lisboa";
        cidades[9] = "Tokio";

        temperaturas[0][0] = -1;
        temperaturas[1][0] = -3;
        temperaturas[2][0] = -8;
        temperaturas[3][0] = 4;
        temperaturas[4][0] = 6;
        temperaturas[5][0] = 5;
        temperaturas[6][0] = 0;
        temperaturas[7][0] = -7;
        temperaturas[8][0] = -1;
        temperaturas[9][0] = -10;
        temperaturas[0][1] = 33;
        temperaturas[1][1] = 32;
        temperaturas[2][1] = 27;
        temperaturas[3][1] = 37;
        temperaturas[4][1] = 42;
        temperaturas[5][1] = 43;
        temperaturas[6][1] = 39;
        temperaturas[7][1] = 26;
        temperaturas[8][1] = 31;
        temperaturas[9][1] = 35;

        for (int i = 0; i < cidades.length; i++) {
            if (temperaturas[i][0] < tempMin) {
                tempMin = temperaturas[i][0];
                indexMin = i;
            }
            if (temperaturas[i][1] > tempMax) {
                tempMax = temperaturas[i][1];
                indexMax = i;
            }
        }

        System.out.println("A menor temperatura foi em " + cidades[indexMin] + " , com " + tempMin + "ºC");
        System.out.println("A Maior temperatura foi em " + cidades[indexMax] + " , com " + tempMax + "ºC");
    }
}
