import java.util.*;
public class problem1{
   public static void main(String[] ansh) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the size of array");
    int s=in.nextInt();
    int []arr=new int[s];
    System.out.println("enter the elements of array");
    for(int i=0;i<arr.length;i++){
        arr[i]=in.nextInt();
    }
    System.out.println("*******************************************************************");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    System.out.println("*******************************************************************");
    System.out.println("on every which element you want to reverse an array");
    int n=in.nextInt();
    int m=n;
    int mid=m/2;
    for(int k=0;k<arr.length;k=k+n){
    for(int i=k,j=(m-1);i<mid;i++,j--){
        int t;
        t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    m=m+n;
    mid=(m+(2*k))/2;
    }
    //int n=in.nextInt();
    //for(int j=0;j<n;j++){
    //for(int i=j;i<(i+n);i++){
    // 
    //}
    //}
   System.out.println("***************************************************************");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

   }
}