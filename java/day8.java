import java.util.*;
public class day8{
    public static void main(String[] ansh){
    //q1();
    //q2();
    Scanner in=new Scanner(System.in);
   // String str="hello";
   // String str1="hiiii";
   // int count=0;
   // for(int i=0;i<str.length();i++){
   //  if(str.charAt(i)==str1.charAt(i)){
   //     count=count+1;
   //  }
   // }
   // System.out.println(count);
  // String str1;

   // String str="ansh";
   // String s="s";
   // int count=0;
   // for(int i=0;i<str.length();i++){
   //     if(str.charAt(i)==s.charAt(0)){
   //         count=count+1;
   //     }
   // }
   // System.out.println(count);
   int count=0;
   String str="acjhkacbeud";
   for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
        count=count+1;
    }
   }
   System.out.println(count);


    //for(int i=0;i<str.length();i++){
    //    System.out.println(str.charAt(i));
    }
    public static void q1(){
        int n=123;
        while(n!=0){
            int temp=n%10;
            if(temp%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
            n=n/10;
        }
    }
    public static void q2(){
        int n=123;
        int s=0;
        while(n!=0){
            int temp=n%10;
            s=s+temp;
            n=n/10;
        }
        System.out.println("the sum is "+s);
    }
}