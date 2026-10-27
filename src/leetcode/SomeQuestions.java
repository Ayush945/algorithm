package leetcode;

import java.util.Arrays;

public class SomeQuestions {
    public int ratCountProblem(int r, int unit, int[] arr, int n){
        int totalFood=r*unit;
        int count=0;
        int totalFoodInHouses=0;

        if(arr==null||arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            totalFoodInHouses=totalFoodInHouses+arr[i];
            if(totalFoodInHouses>=totalFood){
                count=i+1;
                return count;
            }
        }
        return 0;
    }

    public int largeSmallSum(int [] arr){
        if(arr.length<=3){
            return 0;
        }

        int largestEven = Integer.MIN_VALUE;
        int secondLargestEven = Integer.MIN_VALUE;

        int smallestOdd = Integer.MAX_VALUE;
        int secondSmallestOdd = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // Even index logic: find second largest
                int val = arr[i];
                if (val > largestEven) {
                    secondLargestEven = largestEven;
                    largestEven = val;
                } else if (val > secondLargestEven && val != largestEven) {
                    secondLargestEven = val;
                }
            } else {
                // Odd index logic: find second smallest
                int val = arr[i];
                if (val < smallestOdd) {
                    secondSmallestOdd = smallestOdd;
                    smallestOdd = val;
                } else if (val < secondSmallestOdd && val != smallestOdd) {
                    secondSmallestOdd = val;
                }
            }
        }
        return secondLargestEven + secondSmallestOdd;
    }

    public int productSmallestPair(int sum,int[]arr){
        if(arr.length<2){
            return -1;
        }
        Arrays.sort(arr);
        int pairSum = arr[0] + arr[1];
        if (pairSum <= sum) {
            return arr[0] * arr[1];
        }
        return 0;
    }

}
