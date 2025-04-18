import java.util.*;
public class day5{
    public static void main(String[] ansh){
    Scanner in=new Scanner(System.in);
    //sum();
   // int [] a={1,2,3,4,5,6,7,8,9};
   // for(int i=0;i<a.length;i++){
   //     System.out.println(a[i]);
   // }
   array();
    }
    public static void sum(){
        Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=0;
    while(a!=0){
        int c=a%10;
        b=b+c;
        a=a/10;
    }
    System.out.println(b);
    }
    
    public static void palindrome(){
        
    }

    public static void array(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=in.nextInt();
        int []a=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }                                                            
    }
}