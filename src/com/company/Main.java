package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 10;
        int y = 100;
        int z = 77;

        System.out.printf("Константы : x=%d y=%d z=%d \n", x, y, z);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int t = in.nextInt();

        if (t==x|t==y|t==z) System.out.print("Данное значение имеется в константах.");
        else System.out.print("Такой константы нет!");
    }
}
