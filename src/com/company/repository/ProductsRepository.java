package com.company.repository;

import com.company.domain.Product;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductsRepository {
    private Connection connection;

    public ProductsRepository(){
    }
    public ProductsRepository(Connection connection){
     this.connection = connection;
    }
    public ArrayList<Product> getAllProducts() throws SQLException ,ClassNotFoundException{
        PreparedStatement preparedStatement = connection.prepareStatement("select * from products");
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Product> products = new ArrayList<>();
       Product  product = new Product();
        while (resultSet.next()){
            product.setId(resultSet.getInt(1));
            product.setCategory(resultSet.getString(2));
            product.setNameProducts(resultSet.getString(3));
            product.setInventory(resultSet.getInt(4));
            product.setPrice(resultSet.getInt(5));
            products.add(product);
           int i = 0;
            System.out.println(products.get(i));
           i++;
           /* s1 = "id=\t"+resultSet.getInt(1)+"\t"+"category=\t"+resultSet.getString(2)+"\t"+"name product=\t "+resultSet.getString(3)+"\t"+"inventory=\t"+
                    resultSet.getInt(4)+"\t"+"price=\t"+resultSet.getInt(5);
            System.out.println(s1);
           */
        }
     return products;
    }




}
