package Solid.OpenClose.Correct.Model;

import Solid.OpenClose.Correct.Course;

public class ChemicalCourse extends Course{
    private final int discount;

    ;
    
    public ChemicalCourse(int price) {
        this.price = price;
        this.discount = price * 10 / 100;
    }

    @Override
    public int getPrice() {
        return price - discount;
    }
}
