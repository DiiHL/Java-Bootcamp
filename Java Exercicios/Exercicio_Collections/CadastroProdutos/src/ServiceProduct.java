import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ServiceProduct {
    List<Product> listProduct = new ArrayList<>();


    public void toAddProduct(String name, double price) {
        listProduct.add(new Product(name, price));
    }

    public void listProduct() {
        for (Product produto : listProduct) {
            System.out.println(produto);
        }
    }

    public void shortByAscendingPrice() {
        listProduct.sort(Comparator.comparingDouble(Product::getPrice));
        for (Product produto : listProduct) {
            System.out.println(produto);
        }
    }

    public void shortByDescendingPrice() {
        listProduct.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        for (Product produto : listProduct) {
            System.out.println(produto);
        }
    }

    public void productOver50() {
        for (Product product : listProduct) {
            if (product.getPrice() > 50) {
                System.out.println(product);
            }
        }
    }

    public void total() {
        double valorTotal = 0;
        for (Product product : listProduct) {
            valorTotal += product.getPrice();
        }

        listProduct();
        System.out.println("Valor total dos produtos: R$ " + valorTotal);
    }
}
