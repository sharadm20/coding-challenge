package strings;

import java.util.*;

// two pointer, dynamic programming
public class Substring {
    public static void main(String[] args) {
      String s1 = "abc", t1 = "ahbgdc",s = "axc", t = "ahbgdc";
      System.out.println(isSubsequence(s, t) + " ," + isSubsequence(s1, t1));

    }
   
    public static boolean isSubsequence(String s, String t) {
        LinkedList<Character> stack = new LinkedList<>();
        int i=0,j=0;
        for(i=0;i<s.length();i++){
            stack.add(i,s.charAt(i));
        }
        
        for(j=0;j<t.length();j++){
            if(stack.contains(t.charAt(j))) stack.remove(stack.indexOf(t.charAt(j)));
        }
        
        if(stack.size()==0) return true;
        return false;
    }

}

