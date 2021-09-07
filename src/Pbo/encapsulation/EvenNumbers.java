/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

    private final List<Integer> numbers = new ArrayList();

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List numbers) {
        this.numbers.clear();
        this.numbers.addAll(filter(numbers));
    }

    private List<Integer> filter(List<Integer> numbers) {
        List<Integer> evenCollection = new ArrayList();
        for (Integer number : numbers) {
            if (isEven(number)) { evenCollection.add(number); }
        }
        return evenCollection;
    }
    
    private boolean isEven(int number) {
        return (number % 2) == 0;
    }

}
