public class SubArray {
  public static void main(String[] args) {
    int arr[] = new int[5];
    arr[0] = 5;
    arr[1] = -7;
    arr[2] = 4;
    arr[3] = 3;
    arr[4] = -2;
    int sum;
    //int arrSum[] = new int[15];
    int max=arr[0];

    for(int i=0; i<5; i++){
      sum=0;
      for(int j=i;j<5;j++){
          sum = sum+arr[j];
          if(max<sum){
            max= sum;
          }System.out.println(max);
      }  
    }
  }
}