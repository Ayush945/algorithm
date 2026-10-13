package leetcode;

public class StringManipulation {

    //String are immutable, so every modification creates new object. The root fo
    //most performance questions.
    public void immutableString(){
        // Using Normal String
        int n=10;
        String s= "";
        for (int i=0;i<n;i++) s+="a";
        System.out.println(s);

        // Using String Builder
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<n;i++)sb.append('a');
        System.out.println(sb.toString());
    }

    public void stringMethod(){
        String fullName="Ayush Thapa";
        System.out.println("Length of full name: ");
        System.out.println(fullName.length());
        System.out.println("First letter of Surname");
        System.out.println(fullName.charAt(6));
        System.out.println(fullName.indexOf('s'));
        System.out.println(fullName.lastIndexOf('y'));

    }

}
