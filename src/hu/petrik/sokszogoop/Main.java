package hu.petrik.sokszogoop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Haromszog h = new Haromszog();

            System.out.println(h);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10 + 5;
            double b = Math.random() * 10 + 5;

            System.out.println(new Teglalap(a, b));
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10.0 + 5.0;
            double b = Math.random() * 10.0 + 5.0;
            double alfa = Math.random() * 178.0 + 1.0;
            System.out.println(new Paralelogramma(a, b, alfa));
        }
    }
}