package com.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    static int userCount = 0;
    static {
        users.add(new User(++userCount, "Mukul Singh", LocalDate.now().minusYears(24)));
        users.add(new User(++userCount, "Shyam Singh", LocalDate.now().minusYears(23)));
        users.add(new User(++userCount, "Prashant Singh", LocalDate.now().minusYears(22)));
    }

    public List<User> findAllUsers() {
        return users;
    }

    public User findById(int id) {
        for (User i : users) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public void saveUser(User user ){
        user.setId(++userCount);
        users.add(user);
    }
}
