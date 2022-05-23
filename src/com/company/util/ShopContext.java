package com.company.util;

import com.company.domain.Address;

import com.company.domain.Basket;
import com.company.repository.AddressRepository;
import com.company.repository.BasketRepository;
import com.company.repository.ProductsRepository;
import com.company.repository.UserRepository;

import java.sql.SQLException;

public class ShopContext {
    DatabaseUtil databaseUtil = new DatabaseUtil();
    private UserRepository userRepository = null;
    private  AddressRepository addressRepository = null;
    private  ProductsRepository productsRepository = null;
    private BasketRepository basketRepository = null;

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
    public ProductsRepository getProductsRepository() {
        if (productsRepository == null) {
            this.productsRepository = new ProductsRepository(databaseUtil.getConnection());
        }
        return productsRepository;
    }
    public BasketRepository getBasketRepository() {
        if (basketRepository == null) {
            this.basketRepository = new BasketRepository(databaseUtil.getConnection());
        }
        return basketRepository;
    }
    }
