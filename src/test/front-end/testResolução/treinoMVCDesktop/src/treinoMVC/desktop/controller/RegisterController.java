package treinoMVC.desktop.controller;

import treinoMVC.desktop.view.RootView;

import treinoMVC.desktop.model.User;

public class RegisterController {

    private long idActual;

    private UserController userController;
    private RootView rootView;

    public RegisterController(UserController userController) {

        this.userController = userController;

    }

    // Boa implementação de resposta back para front
    public String[] applyRegister(String[] post) {

        //System.out.println("Aqui ficara o post");
        this.rootView.labelInfo.setText("Enviado o post!");

        User user = this.userController.create(new User(post[0],
                    post[1],
                    post[2]));
        this.rootView.labelInfo.setText("Criado com sucesso!");

        idActual = user.getId();

        // mostra as infos para o front-end
        return this.viewInfos();

    }

    public String[] viewInfos() {

        User local = userController.readUser(idActual);

        String[] get = {local.getName(),
            local.getEmail(),
            local.getPassword()};

        return get;

    }

    public RootView getWindow() {

        return rootView;

    }

    public void setWindow(RootView rootView) {

        this.rootView = rootView;

    }

}
