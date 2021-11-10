package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Ques5{

public static void main(String[] args){

        List<String> stringList = new ArrayList<>();
        stringList.add("Anuj");
        stringList.add("Shivansh");
        stringList.add("Rashul");
        stringList.add("Parth");
        stringList.add("Kamran");

        StringBuilder sb = new StringBuilder();

        Consumer<Character> createString = s->
        {   
        	sb.append(s);
            System.out.println(sb);
        };
        for (String st: stringList) {
            createString.accept(st.charAt(0));
        }
 


}


}