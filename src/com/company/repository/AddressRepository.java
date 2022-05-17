package com.company.repository;

import com.company.domain.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressRepository {
    public AddressRepository(Connection connection) {
        this.connection = connection;
    }
    private  Connection connection;
    public AddressRepository() {

    }
    public Address insertAddress(Address address) throws SQLException {
        String insertQuery = "insert into address(" +
                "home_address,state,city,street_name,postal_code" +
                ") values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1,address.getHomeAddress());
        preparedStatement.setString(2,address.getState());
        preparedStatement.setString(3,address.getCity());
        preparedStatement.setString(4,address.getStreetName());
        preparedStatement.setInt(5,address.getPostalCode());
        preparedStatement.executeUpdate();
        return address;

    }
}
