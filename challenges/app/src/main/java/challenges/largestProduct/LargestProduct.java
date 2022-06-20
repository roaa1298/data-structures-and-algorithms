package challenges.largestProduct;

import java.util.List;

public class LargestProduct {
    public int largestProduct(int[] list)
    {
        if (list.length < 3)
            return -1;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for (int i=0 ; i<list.length ; i++)
        {
            if (list[i]> max1)
            {
                max3=max2;
                max2=max1;
                max1=list[i];
            }
            else if (list[i]>max2)
            {
                max3=max2;
                max2=list[i];
            }
            else if (list[i]>max3)
            {
                max3=list[i];
            }

            if (list[i]<min1)
            {
                min2=min1;
                min1=list[i];
            }
            else if (list[i]<min2)
            {
                min2=list[i];
            }

            System.out.println("max1 --> "+max1);
            System.out.println("max2 --> "+max2);
            System.out.println("max3 --> "+max3);
            System.out.println("min1 --> "+min1);
            System.out.println("min2 --> "+min2);
            System.out.println("-------------------------->>>>>");
        }
        if ((max1*max2*max3)>(max1*min1*min2))
        {
            return (max1*max2*max3);
        }
        else if ((max1*min1*min2)>(max1*max2*max3))
        {
            return (max1*min1*min2);
        }


        return -1;
    }
}
