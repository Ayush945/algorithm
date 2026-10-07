package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Anagram {
    int[] nums={1,2};
    private final HashSet<Integer> hashSet;

    public Anagram(){
        this.hashSet=new HashSet<>();

    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sHashMap=new HashMap<>();
        HashMap<Character,Integer> tHashMap=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(sHashMap.containsKey(s.charAt(i))){
                int value=sHashMap.get(s.charAt(i));
                sHashMap.put(s.charAt(i),value+1);
            }
            else{
                sHashMap.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(tHashMap.containsKey(t.charAt(i))){
                int value=tHashMap.get(t.charAt(i));
                tHashMap.put(t.charAt(i),value+1);
            }
            else{
                tHashMap.put(t.charAt(i),1);
            }
        }
        if(!sHashMap.equals(tHashMap)){
            return false;
        }
        return true;
    }

    public void addValue(int number){
        this.hashSet.add(number);
    }

    public void displayHashSet(){
        System.out.println(this.hashSet);
        System.out.println("\n");
        for(int value:this.hashSet){
            System.out.println(value);
        }

    }
}
