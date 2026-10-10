package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for (int i=0;i<nums.length;i++){

            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],1);
            }
            else{
                hashMap.put(nums[i],hashMap.get(nums[i]) + 1);
            }
        }
        List<Integer> list=new ArrayList<>(hashMap.keySet());
        list.sort((a,b)->hashMap.get(b) - hashMap.get(a));
        int [] result= new int [k];
        for (int i=0;i<k;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
