package ru.GeekBrains.HomeWork1;

public class Product {
    //1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
       String name;
       Double price;
       Double rating;

    public Product(String name, Double price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    /**
     *  просто добавила все остальное,чтобы повторить эти команды и запомнить
     *  что и для чего нужно
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
