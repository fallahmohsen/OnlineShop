package com.company;

import com.company.domain.Address;
import com.company.domain.Products;
import com.company.domain.User;
import com.company.repository.ProductsRepository;
import com.company.repository.UserRepository;
import com.company.util.DatabaseUtil;
import com.company.util.Menu;
import com.company.util.ShopContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    static Menu menu = new Menu();
    static Scanner scanner = new Scanner(System.in);
    static ResultSet resultSet;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DatabaseUtil databaseUtil = new DatabaseUtil();


        databaseUtil.getConnection();

        menu.showFirstMenu();
        int selectedNumber = scanner.nextInt();
        if (selectedNumber == 1) {
         login();
         showAllProducts();
        }
        if(selectedNumber == 2){
            signUp();
        }
    }

    private static void showAllProducts() throws SQLException, ClassNotFoundException {
        menu.showAllProduct();
        Products products = new Products();
        ShopContext context = new ShopContext();
        ProductsRepository productsRepository = new ProductsRepository();
         context.getProductsRepository().getAllProducts();



            }

    private static void signUp() throws SQLException, ClassNotFoundException {
        User user = new User();
        Address address = new Address();
        ShopContext context = new ShopContext();
        UserRepository userRepository = new UserRepository();
        menu.showInformationLoginUsername();
        user.setUsername(scanner.next());
        menu.showInformationLoginPassword();
        user.setPassword(scanner.next());
        menu.getName();
        user.setName(scanner.next());
        menu.getFamily();
        user.setFamily(scanner.next());
        menu.getMobileNumber();
        user.setMobileNumber(scanner.nextInt());
        menu.getEmail();
        user.setEmail(scanner.next());
        menu.getHomeAddress();
        address.setHomeAddress(scanner.next());
        menu.getState();
        address.setState(scanner.next());
        menu.getCity();
        address.setCity(scanner.next());
        menu.getStreetName();
        address.setStreetName(scanner.next());
        menu.getPostalCode();
        address.setPostalCode(scanner.nextInt());


        user = context.getUserRepository().insert(user);
        address = context.getAddressRepository().insertAddress(address);
        System.out.println(user);
        System.out.println(address);
        login();




    }


    private static void login() throws SQLException, ClassNotFoundException {
        boolean loop = true;
        while (loop) {
            ShopContext context = new ShopContext();
            menu.showInformationLoginUsername();
            String username = scanner.next();
            menu.showInformationLoginPassword();
            String password = scanner.next();
            User user = context.getUserRepository()
                    .getByUsernameAndPassword(username, password);
            if (user != null) {
                menu.showSuccessfulLogin();
                loop = false;
            } else {
                menu.showLoginFail();
            }

        }
    }
}


