package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que3 {
	
	static String product="Android";               //Supplier Functional Interface

	
	static void addList(List<Integer> list) 	      //Consumer Functional Interface
	{
		int result=list.stream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Sum of values:" +result);
	}
	
	
	
	public static void main(String[] args) {
		
		//Supplier Main class
		
		System.out.println("Supplier Functional Interface:\n");
		
		Supplier<Boolean> boolSupplier=()->product.length()==7;
		Supplier<Integer> intSupplier=()->product.length();
		Supplier<String> supplier=()->product.toUpperCase();
		Supplier<String> lowSup=()->product.toLowerCase();
		System.out.println(supplier.get());
		System.out.println(lowSup.get());
		System.out.println(boolSupplier.get());
		System.out.println(intSupplier.get());
		
		//Consumer Main class
		
		System.out.println("\n");
		System.out.println("Consumer Functional Interface:\n");
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);

		Consumer <List<Integer>> consumer=Que3::addList;
		consumer.accept(list);
		
		System.out.println("\n");
		
		System.out.println("Predicate Functional Interface:\n");  // Predicate Functional Interface
		Predicate<Integer>pr=a->(a>18);
		System.out.println(pr.test(20));
		
	}

}
