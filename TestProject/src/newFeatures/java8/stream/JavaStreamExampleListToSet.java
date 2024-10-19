package newFeatures.java8.stream;

import java.util.*;  
import java.util.stream.Collectors;  
class Product7{  
    int id;  
    String name;  
    float price;  
    public Product7(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
  
public class JavaStreamExampleListToSet {  
    public static void main(String[] args) {  
        List<Product7> productsList = new ArrayList<Product7>();  
  
        //Adding Products  
        productsList.add(new Product7(1,"HP Laptop",25000f));  
        productsList.add(new Product7(2,"Dell Laptop",30000f));  
        productsList.add(new Product7(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product7(4,"Sony Laptop",28000f));  
        productsList.add(new Product7(5,"Apple Laptop",90000f));  
          
        // Converting product List into Set  
        Set<Float> productPriceList =   
            productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList);  
    }  
} 
	 
