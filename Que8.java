package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

class Que8{

public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Thread t = new Thread(() -> numbers.forEach(System.out::println));
        t.start();

}
}

