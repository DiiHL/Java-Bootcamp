public class Main {
    public static void main(String[] args) {
        ServiceProduct product = new ServiceProduct();

        product.toAddProduct("Arroz", 25.0);
        product.toAddProduct("Notebook", 3000);
        product.toAddProduct("Caneta", 2.5);

        product.listProduct();
        System.out.println("-----------------------------");
        product.shortByAscendingPrice();
        System.out.println("-----------------------------");
        product.shortByDescendingPrice();
        System.out.println("-----------------------------");
        product.total();
    }
}