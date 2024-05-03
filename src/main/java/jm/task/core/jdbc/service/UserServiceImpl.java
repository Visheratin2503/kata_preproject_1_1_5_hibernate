package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public void createUsersTable() {
        new UserDaoJDBCImpl().createUsersTable();
    }
    @Override
    public void dropUsersTable() {
        new UserDaoJDBCImpl().dropUsersTable();
    }
    @Override
    public void saveUser(String name, String lastName, byte age) {
        new UserDaoJDBCImpl().saveUser(name, lastName, age);
    }
    @Override
    public void removeUserById(long id) {
        new UserDaoJDBCImpl().removeUserById(id);
    }
    @Override
    public List<User> getAllUsers() {
        return new UserDaoJDBCImpl().getAllUsers();
    }
    @Override
    public void cleanUsersTable() {
        new UserDaoJDBCImpl().cleanUsersTable();
    }
}
