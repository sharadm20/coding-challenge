package matrices;

//find the max of two number without if else or direct comparator.
public class MaximumNumberHard {
    public static void main(String[] args) {
        int x = 10;
        int y = 37;
        int dif = x - y;
        int max = x -  (dif & (dif >> 31));
        System.out.println(max);
    }   
}
