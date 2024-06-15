package org.example.storage;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserStorage {

    public String hello() {
        log.info("say hello in storage :з");
        return "hello";
    }
}
