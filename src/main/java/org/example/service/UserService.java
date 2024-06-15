package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.storage.UserStorage;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {
    private final UserStorage userStorage;

    public UserService(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public String hello() {
        log.info("say hello in service :з");
        return userStorage.hello();
    }
}
