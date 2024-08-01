import java.util.*;
public class SelectionSort {

   public static void selectionSort(int arr[])
   {
    for(int i=0;i<arr.length;i++)
    {
        int min_ind=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]>arr[min_ind])
            min_ind=j;
        }
        if(min_ind!=i)
        {
            int temp=arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;
        }
    }
   }
    public static void main(String[] args) {
        int arr[]={20,50,10,12,45,67,90};
        selectionSort(arr);
        System.out.println("sorted array is");
        System.out.println(Arrays.toString(arr));
}
}