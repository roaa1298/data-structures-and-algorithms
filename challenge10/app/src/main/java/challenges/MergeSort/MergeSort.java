package challenges.MergeSort;

import java.util.Arrays;

public class MergeSort {

    public MergeSort() {

    }

    public int[] Mergesort(int[] arr)
    {
        int n = arr.length;
        if (n>1){
            int mid=(n - 1)/2;
            System.out.println("med= "+mid);
            int[] left=new int[mid+1];
            double x=(n - 1)/2.0;
            int[] right=new int[(int) Math.ceil(x)];
            for (int i=0 ; i<=mid ; i++){
                left[i]=arr[i];
            }
            int c=0;
            for (int i=mid+1 ; i<=arr.length-1 ; i++){
                right[c]=arr[i];
                c++;
            }
            System.out.println("left array= "+Arrays.toString(left));
            System.out.println("right array= "+Arrays.toString(right));
            Mergesort(left);
            Mergesort(right);
            Merge(left, right, arr);
        }
        return arr;
    }

    public void Merge(int[] left, int[] right, int[] arr)
    {
        int i=0;
        int j=0;
        int k=0;
        while (i<left.length && j<right.length)
        {
            if (left[i]<=right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
        System.out.println("sorted half= "+Arrays.toString(arr));
    }
}
