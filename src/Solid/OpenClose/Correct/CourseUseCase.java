package Solid.OpenClose.Correct;
public class CourseUseCase {
    public int orderCourse(String name, Course course) {
        return course.getPrice();
    }
}