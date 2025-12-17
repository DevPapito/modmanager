package treinoMVC.desktop.controller;

import treinoMVC.desktop.service.UserService;
import treinoMVC.desktop.model.User;

import java.util.List;

public class UserController {

    private UserService userService;

    private long id;

    public UserController(UserService userService) {

        this.userService = userService;

    }

    public User create(User user) {

        try {

            boolean validName = userService.isValidElement(user.getName());
            boolean validEmail = userService.isValidElement(user.getEmail());
            boolean validPassword = userService.isValidElement(user.getPassword());

            if (!validName || !validEmail || !validPassword) {

                throw new RuntimeException("Nomes vazios!");

            }

            User save = userService.save(new User(id++,user.getName(),
                        user.getEmail(),
                        user.getPassword()));

            System.out.println(save.getName() + " foi criado com sucesso!!");

            return save;

        }catch(NullPointerException e) {

            throw new RuntimeException("Sem objeto User");

        }

    }

    public User readUser(long id) {

        if (id < 0) throw new RuntimeException("Id invalido!");

        return userService.read(id);

    }

    public List<User> readAllUsers() {

        return userService.readAll();

    }

}
