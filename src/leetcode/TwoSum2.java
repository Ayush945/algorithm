package leetcode;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        //Rotating and fixed pointer.
        int arrayLength=numbers.length;
        int[] result =new int[2];
        int start=0;
        int end=arrayLength-1;

        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }

            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return result;
    }


}
