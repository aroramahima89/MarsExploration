import java.io.*;
import java.math.*;
import java.util.*;

class Result {
    public static int marsExploration(String s) {
        int x=s.length();
        int count=0;
        for(int i=0;i<x;i+=3){
            int j=i;
            if(s.charAt(j)!='S'){
                count+=1;
            }
            if(s.charAt(j+1)!='O'){
                count+=1;
            }
            if(s.charAt(j+2)!='S'){
                count+=1;
            }
        }
        return count;
    }

}

public class MarsExploration {
    public static void main(String[] args) throws IOException {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     int x=Result.marsExploration(s);
     System.out.println(x);
    }
}
