package Solid.SingleResponsibility.Correct.Repository;

import Solid.SingleResponsibility.Correct.DatabaseSql;
import Solid.SingleResponsibility.Correct.Model.User;

public class UserRepositorySql {

    private final DatabaseSql db;

    public UserRepositorySql(DatabaseSql db) {
        this.db = db;
    }

    public void createUser(User user) {
    }

    public void getUsers() {
    }

    public void updateUser(User user) {
    }

    public void deleteUser(User user) {
    }
    
    public User searchUser(User user) {
       throw new UnsupportedOperationException("Only Example");
    }
    
}
