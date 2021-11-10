package LambdaExpression;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Ques7{

public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(1," Hello, ");
        map.put(2," Anuj, ");
        map.put(3," How ");
        map.put(4," are ");
        map.put(5," you ?");

        StringBuilder stringBuilder = new StringBuilder();

        for(Map.Entry<Integer,String> e : map.entrySet()){
            stringBuilder.append(e.getKey().toString()).append(e.getValue());
        }
        System.out.println(stringBuilder);

 


}


}