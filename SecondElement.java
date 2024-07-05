public class SecondLargest {
    public static void main(String[] args) {
         {
        int arr[]={2,3,4,5};
        int max1=arr[0];
        for(int k:arr){
          if(k>max1)
          {
            max1=k;
          }
    }
    int max2=arr[0];
    for(int s:arr)
    {
        if(s>max2){
            if(s!=max1)
            max2=s;
        }
    }
    System.out.println("second largest no is "+max2);
}
    
}
}
