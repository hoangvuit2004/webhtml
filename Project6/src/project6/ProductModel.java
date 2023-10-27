package project6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductModel {
ArrayList<Product> listProduct;
public ProductModel() {
	listProduct = new ArrayList<>();
	creListProduct();
}
public void addProduct(Product pro) {
	listProduct.add(pro);
}
public void creListProduct() {
	Product product1 = new Product("1000","Ferari", 12000000.0, 2);
	Product product2 = new Product("1001","Lamboghini", 14000000.0, 4);
	Product product3 = new Product("1002", "BMW", 1200000.0, 15);
	Product product4 = new Product("1003","Honda", 4000000.0, 2);
	Product product5 = new Product("1004","Yamaha", 6000000.0, 4);
	Product product6 = new Product("1005", "Suzuki", 700000.0, 15);
	addProduct(product1);
	addProduct(product2);
	addProduct(product3);
	addProduct(product4);
	addProduct(product5);
	addProduct(product6);
	
}
public ArrayList<Product> getProduct(){
	return listProduct;
}
public void sortProduct() {
	Collections.sort(listProduct, new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			if(o1.getTotalValue() > o2.getTotalValue()) {
				return -1;
			}else if(o1.getTotalValue() == o2.getTotalValue()) {
				return 0;
			}else {
				return 1;
			}
		}
		
	});
	
}
public void removeProduct(String id) {
	Product removeProduct = null;
	for (Product product : listProduct) {
		if(product.getId().equals(id)) {
			removeProduct = product;
		}
	}
	if(removeProduct != null) {
		listProduct.remove(removeProduct);
	}
}
public static void main(String[] args) {
	
	
	
}
}
