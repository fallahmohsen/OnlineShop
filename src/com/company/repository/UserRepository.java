package com.company.repository;

import com.company.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    private Connection connection;

    public UserRepository(Connection connection) {
        this.connection = connection;
    }

    public UserRepository() {

    }

    public User getByUsernameAndPassword(String username, String password) throws SQLException {
        String query = "select * from user where username = ? and password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return new User(
                    resultSet.getString(1),
                    resultSet.getString(2)
            );
        }

        return null;
    }

    public User insert(User user) throws SQLException {
        String insertQuery = "insert into user(" +
                "username,password,name,family,mobile_number,email" +
                ") values (?,?,?,?,?,?)";

        PreparedStatement preparedStatement =
                connection.prepareStatement(insertQuery);
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getName());
        preparedStatement.setString(4, user.getFamily());
        preparedStatement.setInt(5, user.getMobileNumber());
        preparedStatement.setString(6, user.getEmail());
        preparedStatement.executeUpdate();
        return user;
    }

}