package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Pick a whole number");
        int num1 = kb.nextInt();
        System.out.println("Pick another whole number");
        int num2 = kb.nextInt();

        int secNum1 = num1;
        int secNum2 = num2;
        int x = 1;
        ArrayList<Integer> num1Divisors = new ArrayList<Integer>();
        while(x <= secNum1){
            if (secNum1 % x == 0){
                num1Divisors.add(x);
            }
            x++;

        }
        int y = 1;
        ArrayList<Integer> num2Divisors = new ArrayList<Integer>();
        while (y <= secNum2){
            if (secNum2 % y == 0){
            num2Divisors.add(y);
            }
            y++;
        }

        int gcf = 0;
        for(int i = num1Divisors.size() - 1; i >= 0; i--){
            for(int j = num2Divisors.size() - 1; j >= 0; j--){
                if(num1Divisors.get(i) == num2Divisors.get(j)){
                    gcf = num1Divisors.get(i);
                    break;
                }
            }
        }
        System.out.println(gcf);

    }
}
