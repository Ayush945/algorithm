import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        JavaArray javaArray=new JavaArray();
//        javaArray.addValue(1);
//        javaArray.addValue(2);
//        javaArray.addValue(3);
//        javaArray.addValue(4);
//        javaArray.addValue(5);
//        System.out.println("\nThe values are:");
//        javaArray.displayArray();

        JavaHash jh = new JavaHash();
        jh.addValue(5);
        jh.addValue(3);
        jh.addValue(5); // duplicate, ignored
        jh.addValue(10);
        jh.displayHashSet();
    }
}
