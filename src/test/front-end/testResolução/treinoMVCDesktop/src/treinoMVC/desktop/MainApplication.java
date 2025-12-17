package treinoMVC.desktop;

import javax.swing.SwingUtilities;

import treinoMVC.desktop.controller.UserController;
import treinoMVC.desktop.controller.RegisterController;

import treinoMVC.desktop.service.UserService;

import treinoMVC.desktop.repository.UserRepository;

import treinoMVC.desktop.view.RootView;

class MainApplication {

    public static UserRepository db;

    public static UserService userService;

    public static RegisterController registerController;
    public static UserController userController;

    public static RootView window;

    public static void main(String[] args) {

        db = new UserRepository();

        userService = new UserService(db);

        userController = new UserController(userService);

        registerController = new RegisterController(userController);

        // janela
        window = new RootView();
        window.setRegisterController(registerController);
        registerController.setWindow(window);

        // testing old
        //registerController.applyRegister(new String[10]);

        SwingUtilities.invokeLater(() -> {

            // Formato post
            window.setVisible(true);

        });

    }

}
