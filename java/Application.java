import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] data = { 1, 2, 0, 3, 4, 0, 5, 6 };
        
        System.out.println(Arrays.toString(doubleTheZero(data)));
/*
//        KthMax.smallest(data);
//        KthMax.secondSmallest(data);
//        KthMax.thirdSmallest(data);
//        System.out.println(KthMax.findKthSmallestElement(data,5));
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));
//
//        int size = data.length;
//        BubbleSort.sort(data);
        insertionSort(data);
        // call quicksort() on array data
//        Quicksort.sort(data, 0, size - 1);
//
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));*/
        //BinaryTree tree = new BinaryTree();
        //TreeNode root = tree.makeTree();
        //System.out.println(tree.inOrderTraversal(root));
       // System.out.println(tree.preorderTraversal(root));
       // System.out.println(tree.postOrderTraversal(root));
    }
    private static int[] doubleTheZero(int[] data) {
       int cptr = 0, dptr = 0;
       int [] copy = new int[data.length];
       while (cptr < data.length){
        copy[cptr] = data[dptr];
        if(data[dptr] == 0){
           copy[++cptr] = data[dptr];
        }
            cptr++;
            dptr++;
       }
       return copy;
    }
    static void insertionSort(int[] arr){
        for(int i =1; i< arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j= j-1;
            }
            arr[j+1] = key;
        }
    }
}
