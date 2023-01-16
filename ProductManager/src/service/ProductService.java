package service;

import model.Product;
import repository.file.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(){
        productRepository = new ProductRepository();
    }
    public List<Product> getAllProduct(){
        return productRepository.getAll();
    }
    public List<Product> searchProductByName(String name){
        return productRepository.searchByName(name);
    }
    public void deleteProductById(long id){
        productRepository.deleteById(id);
    }
    public Product findProductById(long id){
        return productRepository.findById(id);
    }
    public Product findProductByName(String name){
        return productRepository.findByName(name);
    }
    public void addProduct(Product newProduct) {
        productRepository.add(newProduct);
    }
}
