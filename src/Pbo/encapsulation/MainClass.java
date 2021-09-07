/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        // range 0 - 99
        List<Integer> randomValue = getRandomListNumbers(100);

        System.out.print("List awal : ");
        printAllItemInCollection(randomValue);

        // Give new line
        System.out.println("");

        // Declare instance class
        EvenNumbers evenNumbers = new EvenNumbers();
        evenNumbers.setNumbers(randomValue);

        System.out.print("List genap : ");
        printAllItemInCollection(evenNumbers.getNumbers());
    }

    private static List<Integer> getRandomListNumbers(int range) {
        List<Integer> collection = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            collection.add(random.nextInt(range));
        }
        return collection;
    }

    private static void printAllItemInCollection(List<Integer> collection) {
        for (Integer value : collection) {
            System.out.print(value + " ");
        }
    }
}
