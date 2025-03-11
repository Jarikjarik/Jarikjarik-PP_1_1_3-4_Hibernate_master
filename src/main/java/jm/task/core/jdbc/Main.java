package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Zhanna" ,"Siraeva" , (byte) 18);
        userService.saveUser("Azat" ,"Ibragimov" , (byte) 30);
        userService.saveUser("Irina" ,"Efimova" , (byte) 23);
        userService.saveUser("Dmitriy" ,"Chehov" , (byte) 25);
        System.out.println(userService.getAllUsers());

    }
}