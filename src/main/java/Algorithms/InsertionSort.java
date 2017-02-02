package Logstash;

import java.util.Arrays;

/**
 * Hello world!
 *
 *
 * insertion sort
 *
 */



public class InsertionSort
{
    public static void main( String[] args )
    {
        System.out.println( "Insertion sort in progress");
        Integer [] arr={122,100,133,101,12,99};



        Integer [] sortedArray=new Integer[9];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=null) {
                sortedArray = sort(sortedArray, arr[i]);
                System.out.println("passed for "+i);
            }
            else
            {
                break;
            }

        }


        System.out.println(Arrays.asList(sortedArray));


    }

    public static Integer[] sort(Integer[] sortedArray,int nextNumber)
    {

        if(sortedArray[0]==null)
        {
            //empty array
            sortedArray[0]=nextNumber;
        }

        else
        {
            int i=0;
            while(sortedArray[i]!=null&&nextNumber>sortedArray[i])
            {
                i++;
            }
            int j=i;
            while(sortedArray[j]!=null)
            {
                j++;
            }
            for( ;j>i;j--)
            {
                sortedArray[j]=sortedArray[j-1];
            }

            sortedArray[i]=nextNumber;
        }
        return sortedArray;
    }
}
