public class ArrayFunc {
  //insret beging
  public int bg(int data, int[] arr, int n){
    if(n>=arr.length){
      System.out.println("Array is full");
      return n;
    }
    for(int i=n;i>0;i--){
      arr[i]=arr[i-1];
    }
    arr[0]= data;
    return n+1;
  }

  //end insert
  public int end(int data, int[] arr, int n){
    if(n>=arr.length){
      System.out.println("Array is full");
      return n;
    }
    arr[n]= data;
    return n+1;
  }

  //position
  public int insertPos(int[] arr,int data,int pos,int n)
  {
    if(n>= arr.length){
      System.out.println("Array is full");
      return n;
    }
    if(pos <1 || pos>n+1){
      System.out.println("invalid position");
      return n;
    }
    if(pos == n+1){
      arr[pos-1]=data;
      return n+1;
    }
    for(int i =n;i> pos-1;i--){
      arr[i]= arr[i-1];
    }
    arr[pos-1] =data;
    return n+1;
  }
 public int delBEG(int[] arr,int n){
  if(n==0){
    System.out.println("empty array");
    return n;
  }
  for(int i= 1;i<n;i++){
    arr[i-1]=arr[i];
  }
  return n-1;
 }
 public int delEND(int[] arr,int n){
    if(n==0){
    System.out.println("empty array");
    return n;
  }

  return n-1;
 }
  public void display(int[] arr, int n){
    if(n==0){
    System.out.println("Array is empty");
    return ;
    }
    for(int i=0;i<n ;i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[10];
    arr[0]=8;
    arr[1]=9;
    arr[2]=5;
    arr[3]=3;
    arr[4]=2;
    int n =5;
    ArrayFunc obj =new ArrayFunc();
    n=obj.bg(1, arr, n);
    n = obj.end(10, arr, n);
    n= obj.insertPos(arr, 6, 8, n);
    n=obj.delBEG(arr,n);
    obj.display(arr, n);
  }
}
