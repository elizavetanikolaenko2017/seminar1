package ru.GeekBrains.HomeWork1;

import ru.GeekBrains.HomeWork2.Categori;

public class Main1 {
    public static void main(String[] args) {
        // 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        //  Создать класс Категория, имеющий переменные имя и массив товаров.
        // Создать несколько объектов класса Категория.
       // 3)Создать класс Basket, содержащий массив купленных товаров.
       // 4)Создать класс User, содержащий логин, пароль и объект класса Basket.
        // Создать несколько объектов класса User.
        Product product= new Product("Зубная паста",56.50,4.5);

         product.name="Зубная паста";
         product.price = 00.00;
         product.rating= 0.0;

        Product product1 = new Product("Product1", 890.99, 7.5);
        Product product2 = new Product("Гель для душа", 115.99, 3.5);
        Product product3 = new Product("Зубная паста", 89.79, 4.0);
        Product product4 = new Product("Туалетная бумага",50.78,6.9);
        Product product5 = new Product("Жидкое мыло",64.99,3.5);

        Categori purchasedProducts = new Categori("Проданные товары", new Product[]{product1, product2});
        Categori otherProducts = new Categori("Оставшиеся товары", new Product[]{product3, product4});

        Basket userBasket = new Basket(new Product[]{product1, product3});
        User leonid = new User1("Леонид", "Password", userBasket);
        User elizaveta = new User2("Елизавета", "Password", userBasket);


        System.out.println("Проданные товары " + purchasedProducts);
        System.out.println("Оставшиеся товары " + otherProducts);
        System.out.println(leonid);
        System.out.println(elizaveta);





    }
}
