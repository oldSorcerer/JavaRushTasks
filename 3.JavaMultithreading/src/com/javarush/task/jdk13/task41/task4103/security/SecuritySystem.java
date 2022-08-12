package com.javarush.task.jdk13.task41.task4103.security;

import com.javarush.task.jdk13.task41.task4103.User;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

public class SecuritySystem {

    private boolean isAuthorized;

    private static final Map<String, Account> authorizedUsers = new HashMap<>() {{
        put("admin", new Account(1, "Admin", "Admin", new Object(), "admin", "123"));
        put("locked", new Account(7, "Sherlock", "Holmes", new Object(), "locked", "sher"));
        put("Dexter_39476", new Account(13, "Dexter", "Morgan", new Object(), "Dexter_39476", "Harry"));
    }};

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void authorize(String login, String password) {
        Account account = authorizedUsers.get(login);
        if (nonNull(account)) {
            isAuthorized = account.password.equals(Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8)));
        }
    }

    private static class Account {
        private final User user;
        private final String login;
        private final String password;

        public Account(int id, String firstName, String lastName, Object photo, String login, String password) {
            this.user = new User(id, firstName, lastName, photo);
            this.login = login;
            this.password = Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));
        }
    }
}
