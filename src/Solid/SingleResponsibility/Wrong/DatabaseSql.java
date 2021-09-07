package Solid.SingleResponsibility.Wrong;

import Solid.SingleResponsibility.Wrong.Model.Course;
import Solid.SingleResponsibility.Wrong.Model.User;

public class DatabaseSql {
    void connect() {}
    void disconnect() {}
    void createUser(User user) {}
    void getUsers() {}
    void updateUser(User user) {}
    void deleteUser(User user) {}
    void searchUser(User user) {}
    void createCourse(Course course) {}
    void insertUserToCourse(User user, Course course) {}
    void deleteUserFromCourse(User user, Course course) {}
    void updateCourse(Course course) {}
    void deleteCourse(Course course) {}
}
