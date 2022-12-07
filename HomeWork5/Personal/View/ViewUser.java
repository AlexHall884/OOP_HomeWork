package HomeWork5.Personal.View;

import java.util.List;
import java.util.Scanner;

import HomeWork5.Personal.Controllers.UserController;
import HomeWork5.Personal.Model.User;

public class ViewUser {
    
    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    private String prompt(String message) {
        Scanner comand = new Scanner(System.in);
        System.out.print(message);
        return comand.nextLine();
    }

    private User setUser(boolean forUpdate) {
        String idString = "";
        if (forUpdate) {
            idString = prompt("Id: ");

        }

        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        if (forUpdate) {
            return new User(idString, firstName, lastName, phone);
        }
        return new User(firstName, lastName, phone);
    }

    public void run() {
        System.out.println("Здравствуйте, что вы хотите сделать?");
        System.out.println("NONE\nREAD\nCREATE\nUPDATE\nLIST\nDELETE\nEXIT");
        Commands comand = Commands.NONE;
        while (true) {
            String command = prompt("Введите команду: ");
            try {
                comand = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
            }
            if (comand == Commands.EXIT)
                return;
            try {
                switch (comand) {
                    case CREATE:
                        User user = setUser(false);
                        userController.saveUser(user);
                        break;
                    case READ:
                        String id = prompt("Идентификатор пользователя: ");
                        User readedUser = userController.readUser(id);
                        System.out.println(readedUser);
                        break;
                    case LIST:
                        List<User> userList = userController.readUserList();
                        for (User u : userList) {
                            System.out.println(u);
                            System.out.println();
                        }
                        break;
                    case UPDATE:
                        User updateUser = setUser(true);
                        userController.updateUser(updateUser);
                        break;
                    case DELETE:
                           String userId = prompt("Идентификатор пользователя: ");
                           User needTodeleteUser = userController.readUser(userId);
                           userController.deleteUser(needTodeleteUser);
                           break;  
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}