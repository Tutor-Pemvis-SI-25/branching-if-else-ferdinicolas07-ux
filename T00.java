import java.util.*;
import java.lang.Math;

import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;

        System.out.println("Masukkan bilangan pertama:");
        a = input.nextInt();
        System.out.println("Masukkan bilangan kedua:");
        b = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Bilangan pertama genap");
        } else {
            System.out.println("Bilangan pertama : ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("Bilangan kedua : genap");
        } else {
            System.out.println("Bilangan kedua : ganjil");
        }
        if (a > b) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (b > a) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Keduanya sama besar");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Keduanya genap, hasil penjumlahan = " + a + b);
        } else {
            if (a % 2 != 0 && b % 2 != 0) {
                System.out.println("Keduanya ganjil, hasil perkalian = " + a * b);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}

