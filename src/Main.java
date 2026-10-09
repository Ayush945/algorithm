import leetcode.Anagram;
import leetcode.GroupAnagram;
import leetcode.TwoSum;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr= {"tops","hats","cats","nats","spot"};
        System.out.println(arr.length);
        Arrays.sort(arr);
        //Reverse string inside array
        Arrays.sort(arr,(a,b)->b.compareTo(a));
        System.out.println(Arrays.toString(arr));
    }
}
