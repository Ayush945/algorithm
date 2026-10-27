package leetcode;

import java.util.HashMap;

public class DifferenceSum {

    public int difference(int m, int n){
        int divisibleByn=0;
        int notDivisibleByn=0;
        for(int i=1; i<=m;i++){
            if(i%n==0){
                divisibleByn=i+divisibleByn;
            }
            else{
                notDivisibleByn=i+notDivisibleByn;
            }
        }
        return Math.abs(divisibleByn-notDivisibleByn);
    }

    public String moveHyphens(String s){
        if(s==null){
            return null;
        }
        StringBuilder stringBuilderHyphens=new StringBuilder();
        StringBuilder stringBuilderOthers=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                stringBuilderHyphens.append('-');
            }
            else{
                stringBuilderOthers.append(s.charAt(i));
            }
        }

        return stringBuilderHyphens.append(stringBuilderOthers).toString();
    }

    public String encryptString(String s){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isUpperCase(s.charAt(i))) {
                char upperToLower = Character.toLowerCase(s.charAt(i));
                stringBuilder.append(upperToLower);
            }
            else if(Character.isLowerCase(s.charAt(i))){
                char lowerToUpper=Character.toUpperCase((s.charAt(i)));
                stringBuilder.append(lowerToUpper);
            }
            else{
                stringBuilder.append(s.charAt(i));
            }
         }

        return stringBuilder.toString();
    }

    public int sumPrimeAtEvenIndices(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i=i+2){
            if(isPrime(arr[i])){
                sum=arr[i]+sum;
            }
        }
        return sum;
    }

    public boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

