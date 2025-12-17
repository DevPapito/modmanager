package treinoMVC.desktop.repository;

import treinoMVC.desktop.model.User;

import java.util.List;
import java.util.ArrayList;

public class UserRepository {

    private List<User> db = new ArrayList<>();

    public User create(User user) {

        db.add(user);
        return user;

    }

    public User read(long id) {

        return searchById(id);

    }

    public List<User> readAll() {

        return db;

    }

    private User searchById(long id) {

        for (User i : db) {

            if (id == i.getId()) return i;

        }

        return null;

    }


}
