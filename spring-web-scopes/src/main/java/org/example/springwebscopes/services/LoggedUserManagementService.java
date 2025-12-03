package org.example.springwebscopes.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

// session scoped bean
@Service
@SessionScope
public class LoggedUserManagementService {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
