package leetcode;
import java.util.*;
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }


    public void anotherMethod(){
        String[] strs = {"act", "pots", "tops","cat","stop","hat"};
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] alphabets = new int[26];
            for(int j=0;j<strs[i].length();j++){
                char temp=strs[i].charAt(j);
                int value=temp-'a';
                alphabets[value]++;
            }
            String key=Arrays.toString(alphabets);
            if(!hashMap.containsKey(key)){
                hashMap.put(key,new ArrayList<>());
            }
            hashMap.get(key).add(strs[i]);
        }
        ArrayList<List<String>> array= new ArrayList<>(hashMap.values());
        System.out.println(array.toString());
    }

}
