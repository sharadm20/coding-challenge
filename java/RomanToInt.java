public class RomanToInt {
    public static void main(String[] args) {
        String s1="III",s2="LVIII",s3="MCMXCIV";
        System.out.println(convert(s1));
        System.out.println(convert(s2));
        System.out.println(convert(s3));
    }
    public static int convert(String s){
        int res = 0, num =0;
        for(int i = s.length() - 1; i>=0; i--){
            if(s.charAt(i) == 'I') num = 1;
            if(s.charAt(i) == 'V') num = 5;
            if(s.charAt(i) == 'X') num = 10;
            if(s.charAt(i) == 'L') num = 50;
            if(s.charAt(i) == 'C') num = 100;
            if(s.charAt(i) == 'D') num = 500;
            if(s.charAt(i) == 'M') num = 1000;
            if(num<res){
                res -= num;
            }
            else res += num;
        }
        return res;
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String prefix = strs[0];
        for(int i = 1; i<strs.length ; i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }

}
