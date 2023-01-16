package repository.file;

import model.Product;

public class ProductRepository extends FileContext<Product> {
    public ProductRepository() {
        filePath = "./data/product.txt";
        tClass = Product.class;
    }
}
