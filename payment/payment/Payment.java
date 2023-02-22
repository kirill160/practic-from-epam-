package epam.practic.payment.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2. Создать класс Payment с внутренним классом, с помощью объектов кото-
рого можно сформировать покупку из нескольких товаров.
 */

public class Payment {
    public static final int ESCAPE = 5;
    private Product product;

    public Payment() {
        this.product = new Product();

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void assortment() {
        product.assortment();
    }
    public void printListProduct(){
        product.printListProduct();
    }
    public void selectionProduct(){
        product.selectionProduct();
    }

    public class Product  {
        private String name;
        private int price;
        private int weight;
        private List<Product> productList = new ArrayList<>();
        private Scanner console = new Scanner(System.in);
        private int selectionProduct;

        private Product(String name, int price, int weight) {
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

        public Product() {

        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void selectionProduct() {

            while (true) {
                selectionProduct = console.nextInt();
                if (selectionProduct == ESCAPE) {
                    break;
                }
                switch (selectionProduct) {
                    case 1 -> addProduct(new Product("молоко", 500, 700));
                    case 2 -> addProduct(new Product("хлеб", 250, 300));
                    case 3 -> addProduct(new Product("чай", 125, 200));
                    case 4 -> addProduct(new Product("масло", 25, 27));
                    }
                }
            }


        private void assortment() {
            System.out.println("для покупки мяса выберите 1");
            System.out.println("для покупки хлеба выберите 2");
            System.out.println("для покупки чай выберите 3");
            System.out.println("для покупки масло выберите 4");
            System.out.println("для выхода выберите 5");
        }


        private void addProduct(Product product) {
            productList.add(product);

        }

        private void printListProduct() {
            System.out.println("ваши покупки: ");
            for (Product product : productList) {
                System.out.println(product);
            }
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price + "руб" +
                    ", weight=" + weight + "грамм" +
                    '}';
        }



    }


}
