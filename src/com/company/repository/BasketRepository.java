package com.company.repository;

import com.company.domain.Basket;
import com.company.domain.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BasketRepository {
    public BasketRepository(Connection connection) {
        this.connection = connection;
    }
    private  Connection connection;
    public BasketRepository(){

    }
    public Basket insertBasket(Basket basket) throws SQLException{
        String insertQuery = "insert into basket(" +"id,number_purchases" +
                ") values (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1,basket.getId());
        preparedStatement.setInt(2,basket.getNumberPurchases());
        preparedStatement.executeUpdate();
        return basket;
    }
    public List<Basket> getCart() throws SQLException {
        String query = "select  basket.number_purchases,products.id,products.name_products,products.price from basket join products on products.id = basket.id";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
       ResultSet resultSet =  preparedStatement.executeQuery();
        ArrayList<Basket> basket = new ArrayList<>();
        Basket basket1 = new Basket();
        while (resultSet.next()){
            basket1.setId(resultSet.getInt(1));
            basket1.setNumberPurchases(resultSet.getInt(2));
            basket1.setNameProduct(resultSet.getString(3));
            basket1.setPrice(resultSet.getInt(4));
            basket.add(basket1);
            int i = 0;
            System.out.println(basket.get(i));
            i++;
        }
        return basket;
    }
}
