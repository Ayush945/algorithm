package leetcode;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] finalResult = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (hashMap.containsKey(value)) {
                finalResult[0] = hashMap.get(value);
                finalResult[1] = i;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return finalResult;
    }
}
