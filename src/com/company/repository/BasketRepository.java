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
    public ArrayList<Basket> getCart() throws SQLException {
        String query = "select products.id, basket.number_purchases,products.name_products,products.price from basket join products on products.id = basket.id";
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
            //int i = 0;
          //  System.out.println(basket.get(i));
           // i++;
        }
        return basket;
    }
    public Basket deleteBasket(Basket basket) throws SQLException {
        String deleteQuery = "delete from basket where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
        preparedStatement.setInt(1,basket.getId());
        preparedStatement.executeUpdate();
        return basket;
    }
    public int calculatePrice() throws SQLException {
        String query = "select products.price,basket.number_purchases from basket join products on products.id = basket.id";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        Basket basket1 = new Basket();
       // ArrayList<Basket> basket = new ArrayList<>();
        int data = 0;
        while (resultSet.next()){
            basket1.setPrice(resultSet.getInt(1));
          //  basket.add(basket1);
            data += resultSet.getInt(1)* resultSet.getInt(2);
        }
    //    for(int i =0;i<basket.size();i++){

            
      //  }
        return data;
    }
    public Basket clearAllBasket(Basket basket) throws SQLException {
        String query = "delete from basket";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeUpdate();
        return basket;
    }
    public void reduceInventory(Basket basket) throws SQLException {
        String query = "update products set inventory = ?  where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,basket.getNumberPurchases());
        preparedStatement.setInt(2,basket.getId());
        preparedStatement.executeUpdate();



    }
}
