package Solid.OpenClose.Wrong;

import Solid.OpenClose.Wrong.Model.EnglishCourse;
import Solid.OpenClose.Wrong.Model.MathCourse;
import Solid.OpenClose.Wrong.Model.ChemicalCourse;

public class CourseUseCase {
    public int orderCourse(String name, Course course) {
        if (course instanceof EnglishCourse) {
            int discount = ((EnglishCourse) course).price * 30 / 100;
            return ((EnglishCourse) course).price - discount;
        } else if (course instanceof MathCourse) {
            int discount = ((MathCourse) course).price * 20 / 100;
            return ((MathCourse) course).price - discount;
        } else if (course instanceof ChemicalCourse) {
            int discount = ((ChemicalCourse) course).price * 10 / 100;
            return ((ChemicalCourse) course).price - discount;
        } else {
            return 0;
        }
    }
}
