package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
@FunctionalInterface
interface Sayable
{
	String say(String message);
}
class Product
{
	int id;
	float price;
	String name;
	public Product(int id, float price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
}
public class Que2 {

	public static void main(String[] args) {
		List <Product> list=new ArrayList<>();
		list.add(new Product(1,10000f,"HP"));
		list.add(new Product(2,20000f,"Lenovo"));
		list.add(new Product(3,25000f,"Dell"));
		list.add(new Product(4,30000f,"Asus"));
		
		Stream<Product> filter_data=list.stream().filter(p->p.price>10000);
		
		filter_data.forEach(
				product->System.out.println(product.id + " " + product.name + " " + product.price)
				);
		Sayable s=(message)->{
			String str="Order status is : Accepted";
			return str;
		};
		System.out.println(s.say(""));

	}

}
