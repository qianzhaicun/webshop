package com.wego.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.wego.webstore.domain.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	Product getProductById(String productID);
	public List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String, List<String>>
	filterParams);
	public List<Product> getProductsall(String productId,String category,String manufacturer);
	public List<Product> getProducts(String productId);
	void addProduct(Product product);
}
