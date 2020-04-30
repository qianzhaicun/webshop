package com.wego.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wego.webstore.domain.Product;
import com.wego.webstore.domain.repository.ProductRepository;
import com.wego.webstore.service.ProductService;

@Service
public class ProductSerivceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		List<Product> allproduct = productRepository.getAllProducts();
		return allproduct;
	}

	public Product getProductById(String productID) {
		return productRepository.getProductById(productID);
	}

	public List<Product> getProductsByCategory(String category) {
		List<Product> productByCategory = productRepository.getProductsByCategory(category);
		return productByCategory;
	};

	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByFilter(filterParams);
	}
	public List<Product> getProductsall(String productId,String category,String manufacturer)
	{
		return productRepository.getProductsall(productId, category, manufacturer);
	}
	public List<Product> getProducts(String productId)
	{
		return productRepository.getProducts(productId);
	}	
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	};

}
