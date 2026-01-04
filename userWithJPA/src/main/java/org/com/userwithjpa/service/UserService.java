package org.com.userwithjpa.service;

import org.com.userwithjpa.exception.UserAlreadyPresent;
import org.com.userwithjpa.model.Profile;
import org.com.userwithjpa.model.User;
import org.com.userwithjpa.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*public User createUser(String email, String password, String username) {
        Optional<User> user = userRepository.findByEmail(email);
        if(user.isPresent()) {
            throw new UserAlreadyPresent("user is already exist");
        }
        User newUser = new User();
        newUser.setUserName(username);
        newUser.setPassword(password);
        newUser.setEmail(email);
        newUser.setCreateAt(new Date());
        newUser.setUpdateAt(new Date());

        Profile p = new Profile();
        p.setAddress("Delhi");

        p.setUser(newUser);
        p.setCreateAt(new Date());
        p.setUpdateAt(new Date());
        newUser.setProfile(p);

        userRepository.save(newUser);
        return newUser;

    }*/


}
