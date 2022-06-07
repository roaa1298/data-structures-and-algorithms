package challenges.QuickSort;

public class QuickSort {

    public QuickSort() {
    }

    public void quickSort(int[] arr, int left, int right){
        if (left<right){
            int pos=Partition(arr, left, right);
            quickSort(arr, left, pos - 1);
            quickSort(arr, pos + 1, right);
        }
    }

    public int Partition(int[] arr, int left, int right){
        int pivot=arr[right];
        int low=left-1;
        for (int i=left ; i<right ; i++)
        {
            if (arr[i]<=pivot)
            {
                low++;
                Swap(arr, i, low);
            }
        }
        Swap(arr, right, low + 1);
        return low+1;
    }

    public void Swap(int[] arr, int i, int low)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[low];
        arr[low]=temp;
    }
}
