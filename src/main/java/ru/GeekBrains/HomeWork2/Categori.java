package ru.GeekBrains.HomeWork2;
import ru.GeekBrains.HomeWork1.Product;



    public class Categori {
        ////2)Создать класс Категория, имеющий переменные имя и массив товаров.
        //// Создать несколько объектов класса Категория.
        private String name;
        private Product[] products;


        public Categori(String name, Product[] products) {
            this.name = name;
            this.products = products;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Product[] getProducts() {
            return products;
        }

        public void setProducts(Product[] products) {
            this.products = products;
        }

        @Override
        public String toString() {
            return "Category " + name + ", Products: " + Arrays.toString(products);
        }
    }




}
