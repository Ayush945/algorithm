import java.util.HashMap;
import java.util.HashSet;

public class JavaHash {
    int[] nums={1,2};
    private final HashSet<Integer> hashSet;

    JavaHash(){
        this.hashSet=new HashSet<>();

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
