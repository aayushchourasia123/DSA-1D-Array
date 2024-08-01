import java.util.Arrays;
public class BubbleSort
{
    public static void bubbleSort(int arr[])
    {
        boolean swap=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
                
            }
            if(!swap) break;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={20,50,10,12,45,67,90};
        bubbleSort(arr);
        System.out.println("sorted array is");
        System.out.println(Arrays.toString(arr));
}
}
