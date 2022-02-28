import static java.lang.Math.ceil;

public class Main {
    public static void main(String[] args) {
        int[] arr={2,4,6,-8};
        int[] arr2={42,8,15,23,42};
        int[] newArr=insertShiftArray(arr2,5);
        for (int i=0 ; i<newArr.length ; i++)
        {
            System.out.println(newArr[i]);
        }

    }
    public static int[] insertShiftArray(int[] a,int num){
        int[] newA=new int[a.length+1];
        int c=0;
        for (int i=0 ; i<Math.ceil((double)a.length/2) ; i++)
        {
            newA[i]=a[i];
            c=i;
        }
        newA[c+1]=num;
        for (int i = (int) Math.ceil((double)a.length/2); i<a.length ; i++)
        {
            newA[i+1]=a[i];
        }
        return newA;
    }
}
