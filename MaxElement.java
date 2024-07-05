public class MaxElement {
    public static void main(String[] args) {
        int arr[]={3,20,4,6,9};
        int max=arr[0];
        for(int k:arr){
          if(k>max)
          {
            max=k;
          }
        }
        System.out.println(max);
    }
}
