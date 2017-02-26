package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Pick a whole number");
        int num1 = kb.nextInt();
        System.out.println("Pick another whole number");
        int num2 = kb.nextInt();

        System.out.println("Would you like to find it (1) recursively or (2) iteratively?");
        int res = kb.nextInt();
        int gcf;
        if (res==1){
            gcf = recursion(num1, num2);
            if (gcf == 0){
                System.out.println("Sorry, there is no GCF between these two numbers.");
            }
            else {
                System.out.println(gcf);       
            }
        }else {
            gcf = iterative(num1, num2);
            if (gcf == 0){
                System.out.println("Sorry, there is no GCF between these two numbers.");
            }
            else {
                System.out.println(gcf);
            }
        }
    }

    public static int recursion(int x, int y){
        if(x == 0){
            return y;
        }
        else if(y == 0){
            return x;
        }
        else{
            if(x > y){
                int rem = x % y;
                return recursion(y, rem);
            }
            else{
                int rem = y % x;
                return recursion(x, rem);
            }
        }

    }
    public static int iterative(int num1, int num2){
        while(num1 != 0 && num2 != 0){
            int x = num1 / num2;
            int y = num2;
            num2 = num1 - (num2 * x);
            num1 = y;
        }
        if(num1 == 0){
            return num2;
        }
        if(num2 == 0){
            return num1;
        }else{
            return 0;
        }
    }
}
