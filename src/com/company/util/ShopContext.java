package com.company.util;

import com.company.domain.Address;
import com.company.repository.AddressRepository;
import com.company.repository.UserRepository;

import java.sql.SQLException;

public class ShopContext {
    DatabaseUtil databaseUtil = new DatabaseUtil();
    private UserRepository userRepository = null;
    private  AddressRepository addressRepository = null;

    public ShopContext() throws SQLException, ClassNotFoundException {
    }

    public UserRepository getUserRepository() {
        if (userRepository == null) {
            this.userRepository = new UserRepository(databaseUtil.getConnection());
        }
        return userRepository;
    }
    public AddressRepository getAddressRepository() {
        if (addressRepository == null) {
            this.addressRepository = new AddressRepository(databaseUtil.getConnection());
        }
        return addressRepository;
    }
}
