package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

class Ques4{

public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Anuj");
        names.add("Shivansh");
        names.add("Parth");
        names.add("Amandeep");
        names.add("Utkarsh");
        names.add("Kushagra");

        names.removeIf(x -> x.length()%2!= 0);
        System.out.println(names);


 


}


}