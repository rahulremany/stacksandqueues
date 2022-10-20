package com.ibcompsci;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        getPrimes(20);
    }

    public static Queue<Integer> getPrimes(int num) {
        Queue<Integer> numbers = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        for (int i = 2; i <= num; i++) {
            numbers.add(i);
        }

        int n = 0;

        do {
            if (checkForPrime(numbers.peek())) {
                n = numbers.remove();
                result.add(n);
            }

            ArrayList<Integer> temp = new ArrayList<>(numbers);

            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i) % n == 0) {
                    temp.remove(i);
                }
            }

            numbers = new LinkedList<>(temp);

        } while (n < Math.sqrt(num));

        while (!numbers.isEmpty()) {
            result.add(numbers.remove());
        }

        System.out.println(result);

        return result;
    }

    public static boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if (inputNumber <= 1) {
            isItPrime = false;

            return isItPrime;
        } else {
            for (int i = 2; i<= inputNumber/2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }
    }
}

