package _25.spring.aop.afterReturning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductRepository {

	private List<Product> products = new ArrayList<>();

	public void saveProduct(Product product) {
		System.out.println("Urun eklendi");
		this.products.add(product);
	}

	public void removeProduct(Product product) {
		System.out.println("Urun silindi");
		this.products.remove(product);
	}

	public Product findProduct(int index) {
		return this.products.get(index);
	}

	public void getProducts() {
		this.products.forEach(System.out::println);
	}

}
