package com.company.util;

import com.company.repository.UserRepository;

import java.sql.SQLException;

public class ShopContext {
    DatabaseUtil databaseUtil = new DatabaseUtil();
    private UserRepository userRepository = null;

    public ShopContext() throws SQLException, ClassNotFoundException {
    }

    public UserRepository getUserRepository() {
        if (userRepository == null) {
            this.userRepository = new UserRepository(databaseUtil.getConnection());
        }
        return userRepository;
    }
}
