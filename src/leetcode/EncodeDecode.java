package leetcode;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {

    public String encode(List<String> strs) {
        StringBuilder strBuilder= new StringBuilder();
        int size=strs.size();
        for(int i=0;i<size;i++){
            int newSize=strs.get(i).length();
            strBuilder.append(newSize);
            strBuilder.append('#');
            strBuilder.append(strs.get(i));
        }
        return strBuilder.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String>string =new ArrayList<>();
        while(i<str.length()){
            int hash=str.indexOf('#',i);
            int length=Integer.parseInt(str.substring(i,hash));
            string.add(str.substring(hash+1,hash+1+length));
            i=hash+1+length;

        }
        return string;
    }
}
