import leetcode.Anagram;
import leetcode.GroupAnagram;
import leetcode.TwoSum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GroupAnagram groupAnagram=new GroupAnagram();
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> value=groupAnagram.groupAnagrams(strs);
        System.out.println(value);
    }
}
