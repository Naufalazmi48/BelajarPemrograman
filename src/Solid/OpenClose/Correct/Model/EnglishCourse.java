package Solid.OpenClose.Correct.Model;
import Solid.OpenClose.Correct.Course;

public class EnglishCourse extends Course{
    private final int discount;
    
    public EnglishCourse(int price) {
        this.price = price;
        this.discount = price * 30 / 100;
    }

    @Override
    public int getPrice() {
        return price - discount;
    }
}
