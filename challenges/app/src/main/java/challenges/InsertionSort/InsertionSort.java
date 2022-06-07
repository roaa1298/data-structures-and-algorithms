package challenges.InsertionSort;

public class InsertionSort {

    public InsertionSort() {
    }

    public int[] Insertion(int[] arr){

        if (arr.length>0) {

            for (int i = 1; i < arr.length; i++) {
                int j = i - 1;
                int temp = arr[i];
                while (j >= 0 && temp < arr[j]) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = temp;
            }
            return arr;
        }
        else {
            return arr;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
