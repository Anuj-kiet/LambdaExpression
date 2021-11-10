package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class Ques6{

public static void main(String[] args){

        List<String> stringList = new ArrayList<>();
        stringList.add("anuj");
        stringList.add("bhati");
        stringList.add("shivansh");
        stringList.add("parth");
       stringList.add("amandeep");

        UnaryOperator<String> uppercase = s -> s.toUpperCase();
        for (String str : stringList) {
            System.out.println(uppercase.apply(str));
        }
}
}
