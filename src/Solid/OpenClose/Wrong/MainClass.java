package Solid.OpenClose.Wrong;

import Solid.OpenClose.Wrong.Model.EnglishCourse;

public class MainClass {
    
    public static void main(String[] args) {
        Course englishCourse = new EnglishCourse(100000);
        CourseUseCase usecase = new CourseUseCase();
        
        System.out.println("Total biaya mengikuti kursus bahasa inggris: Rp." + usecase.orderCourse("Naufal", englishCourse));
    }
}
