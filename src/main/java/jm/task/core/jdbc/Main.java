package jm.task.core.jdbc;

import jm.task.core.jdbc.HibernateUtil.HibernateUtil;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Создание таблицы пользователей
        userService.createUsersTable();
        System.out.println("Таблица пользователей создана.");

        // Добавление пользователей в таблицу
        userService.saveUser("Sam", "Weatwicky", (byte) 18);
        System.out.println("User с именем Sam добавлен в базу данных.");
        userService.saveUser("Ann", "Smith", (byte) 55);
        System.out.println("User с именем Ann добавлен в базу данных.");
        userService.saveUser("Joel", "Johnson", (byte) 35);
        System.out.println("User с именем Bobby добавлен в базу данных.");
        userService.saveUser("Emily", "Blunt", (byte) 28);
        System.out.println("User с именем Emily добавлен в базу данных.");

        // Получение всех пользователей из БД
        List<User> userList = userService.getAllUsers();
        System.out.println("Список всех пользователей:");
        for (User user : userList) {
            System.out.println(user);
        }

        // Очистка таблицы
        userService.cleanUsersTable();
        System.out.println("Таблица пользователей очищена.");

        // Удаление таблицы
        userService.dropUsersTable();
        System.out.println("Таблица пользователей удалена.");

        HibernateUtil.sessionClose();
    }
}
