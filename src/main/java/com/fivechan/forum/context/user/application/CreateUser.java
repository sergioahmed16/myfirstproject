package com.fivechan.forum.context.user.application;

import com.fivechan.forum.context.user.domain.User;
import com.fivechan.forum.context.user.domain.UserRepository;

import java.util.UUID;

public class CreateUser {
    UserRepository userRepository;

    public CreateUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void run(UUID id, String name, String description, String avatar) {
        User user = new User(id, name, description, avatar);
        this.userRepository.save(user);
    }
}
