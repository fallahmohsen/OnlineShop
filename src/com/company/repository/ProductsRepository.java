package com.company.repository;

import com.company.domain.Products;
import com.company.domain.User;

import java.sql.*;

public class ProductsRepository {
    private Connection connection;

    public ProductsRepository(){
    }
    public ProductsRepository(Connection connection){
     this.connection = connection;
    }
    public Products getAllProducts() throws SQLException {
        String s1 =  "";
        String query = "select category,name_products,inventory,price from products";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            s1 = "category=\t"+resultSet.getString(1)+"\t"+"name product=\t "+resultSet.getString(2)+"\t"+"inventory=\t"+
                    resultSet.getInt(3)+"\t"+"price=\t"+resultSet.getInt(4);
            System.out.println(s1);

        }



     return null;

    }



    
}
