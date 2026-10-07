import leetcode.Anagram;
import leetcode.TwoSum;

public class Main {
    public static void main(String[] args) {
        int []nums = {4,5,6};
        int target = 10;
        TwoSum tS=new TwoSum();
        int[] result=tS.twoSum(nums,target);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
