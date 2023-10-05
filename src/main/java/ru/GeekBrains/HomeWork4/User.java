package ru.GeekBrains.HomeWork4;

public class User {
    //4)Создать класс User, содержащий логин, пароль и объект класса Basket.
    // // Создать несколько объектов класса User.
    private String login;
    private String password;
    private Basket basket;

    // Constructor
    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "User login: " + login + ", basket: " + basket;
    }
}
