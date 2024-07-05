class EvenIndisesArray
{
    public static void main(String[] args) {
        int arr[]={3,20,4,6,9};
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
            {
                s+=arr[i];
            }
        }
        System.out.println(s);
    }
}