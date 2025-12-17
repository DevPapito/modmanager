package treinoMVC.desktop.service;

import treinoMVC.desktop.repository.UserRepository;

import treinoMVC.desktop.model.User;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;

    }

    public User save(User user) {

        return userRepository.create(user);

    }

    public User read(long id) {

        return userRepository.read(id);

    }

    public List<User> readAll() {

        return userRepository.readAll();

    }

    // Operações RN resumidas SOMENTE POR CONTA DO TESTE

    public boolean isValidElement(String element) {

        return (element.isEmpty()) ? false : true;

    }

}
