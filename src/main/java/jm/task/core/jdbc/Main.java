package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        UserService userService = new UserServiceImpl();
        User user1 = new User("Name1", "LastName1", (byte) 51);
    //    private static final User user2 = new User("Name2", "LastName2", (byte) 12);
    //    private static final User user3 = new User("Name3", "LastName3", (byte) 22);
    //    private static final User user4 = new User("Name4", "LastName4", (byte) 33);
//        userService.createUsersTable();

        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());

//        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
//
//        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
//
//        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
//
//        userService.getAllUsers();
//
//        userService.cleanUsersTable();
//
//        userService.dropUsersTable();


       /* UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Name1", "LastName1", (byte) 20);
        userDao.saveUser("Name2", "LastName2", (byte) 25);
        userDao.saveUser("Name3", "LastName3", (byte) 31);
        userDao.saveUser("Name4", "LastName4", (byte) 38);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();*/
    }
}
