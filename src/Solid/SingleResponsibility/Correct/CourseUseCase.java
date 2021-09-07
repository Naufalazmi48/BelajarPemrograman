package Solid.SingleResponsibility.Correct;

import Solid.SingleResponsibility.Correct.Model.Course;
import Solid.SingleResponsibility.Correct.Model.User;
import Solid.SingleResponsibility.Correct.Repository.CourseRepositorySql;
import Solid.SingleResponsibility.Correct.Repository.UserRepositorySql;

public class CourseUseCase {

    private final CourseRepositorySql courseRepository;
    private final UserRepositorySql userRepository;

    public CourseUseCase(CourseRepositorySql courseRepository, UserRepositorySql userRepository) {
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }
    
    void insertUserToCourse(User user, Course course) {
        User isValidUser = userRepository.searchUser(user);
        
        if (isValidUser != null) {
            courseRepository.insertUserToCourse(user, course);
        } else {
            System.out.println("Invalid user!");
        }
    }
}
