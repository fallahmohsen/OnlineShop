package com.company.util;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.jar.JarOutputStream;

public class Menu {
    public void showFirstMenu(){
        System.out.println("welcome to online shop");
        System.out.println("enter your number");
        System.out.println("1.login");
        System.out.println("2.sign up");
        System.out.println("3.exit");

    }
    public  void showInformationLoginUsername(){
        System.out.println("enter your username:");
    }
    public  void  showInformationLoginPassword(){
        System.out.println("enter your password:");
    }
    public void showSuccessfulLogin(){
        System.out.println("Successful login");
    }
    public void showLoginFail() {
        System.out.println("username or password is incorrect");
    }
    public  void getName(){
        System.out.println("plz enter your name");
    }
    public  void getFamily(){
        System.out.println("plz enter your family");
    }
    public void getMobileNumber(){
        System.out.println("plz enter your mobile number");
    }
    public void getEmail(){
        System.out.println("plz enter your email");
    }
    public void getHomeAddress(){
        System.out.println("enter your address");
    }
    public  void getState(){
        System.out.println("plz write your state");
    }
    public void getCity(){
        System.out.println("plz write your city");
    }
    public void getStreetName(){
        System.out.println("plz write your street name");
    }
    public void getPostalCode(){
        System.out.println("enter your postal code ");
    }
    public  void showAllProduct() {
        System.out.println("all of products");
    }
    public  void choseProduct(){
        System.out.println("chose id product: ");
    }
    public  void numberOfProduct(){
        System.out.println("enter your number of product");
    }
    public  void tryAgainAddCart(){
        System.out.println("ٰwant to add to cart again");
        System.out.println("1.yes");
        System.out.println("2.no");
    }
    public void showMassageDelete(){
        System.out.println("Do you want to delete the product?");
        System.out.println("1.yes");
        System.out.println("2.no");
    }
    public  void choseMassageDelete(){
        System.out.println("chose your id product from delete");
    }
    public  void showMassageCalculatePrice(){
        System.out.println("The sum of the prices of the shopping cart is :");
    }
    public  void showMassageCartFull(){
        System.out.println("cart is full!!!");
    }

}
