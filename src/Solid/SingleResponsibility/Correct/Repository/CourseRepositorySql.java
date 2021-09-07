package Solid.SingleResponsibility.Correct.Repository;

import Solid.SingleResponsibility.Correct.DatabaseSql;
import Solid.SingleResponsibility.Correct.Model.Course;
import Solid.SingleResponsibility.Correct.Model.User;

public class CourseRepositorySql {

    private final DatabaseSql db;

    public CourseRepositorySql(DatabaseSql db) {
        this.db = db;
    }

    public void createCourse(Course course) {
    }

    public void insertUserToCourse(User user, Course course) {
    }

    public void deleteUserFromCourse(User user, Course course) {
    }

    public void updateCourse(Course course) {
    }

    public void deleteCourse(Course course) {
    }
}
