package Solid.OpenClose.Correct.Model;

import Solid.OpenClose.Correct.Course;

public class MathCourse extends Course{
    private final int discount;
    
    public MathCourse(int price) {
        this.price = price;
        this.discount =  price * 20 / 100;
    }

    @Override
    public int getPrice() {
        return price - discount;
    }
}
