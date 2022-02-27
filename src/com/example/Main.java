package src.com.example;

public class Challenge1 {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6};
        int[] reverse=reverseArray(arr);
        for(int i=0 ; i<reverse.length ; i++)
        {
            System.out.println(reverse[i]);
        }

    }
    public static int[] reverseArray(int[] a){
        int[] result=new int[a.length];
        int j=a.length;
        for(int i=0 ; i<a.length ; i++)
        {
            result[j-1]=a[i];
            j--;
        }
        return result;
    }
}
