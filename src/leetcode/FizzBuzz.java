package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int num){
        List<String> list=new ArrayList<>();
        for(int i=1;i<num+1;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }
            else if (i%3==0) {
                list.add("Fizz");
            }
            else if (i%5==0) {
                list.add("Buzz");
            }
            else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public void displayList(List<String> list){
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
