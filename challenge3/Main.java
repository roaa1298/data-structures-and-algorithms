public class Main {
    public static void main(String[] args) {
        int[] a={1, 2, 3, 5, 6, 7};
        int res=BinarySearch(a,4);
        System.out.println(res);
    }

    public static int BinarySearch(int[] arr,int key){
        int first=0;
        int last=arr.length-1;

        while (first<=last)
        {
            int mid=first+(last-first)/2;
            if (arr[mid]==key) {
                return mid;
            }
            else
            {
                if (key>arr[mid])
                {
                    first=mid+1;
                }
                else {
                    last=mid-1;
                }
            }
        }

        return -1;
    }

}
