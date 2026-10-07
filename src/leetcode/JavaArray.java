package leetcode;

import java.util.ArrayList;


public class JavaArray {

    /*Getting re familiarize with Array in Java*/
    private final ArrayList<Integer> array;

    public JavaArray(){
        this.array=new ArrayList<>();
    }

    public void addValue(int number){
        this.array.add(number);
    }

    public void displayArray(){
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }
    }
}
