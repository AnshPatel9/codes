import java.util.*;
public class ques{
    public static void main(String[] ansh){
    //ques1();
    //ques2();
    //ques3();
    //ques4();
    //ques5();
    //ques6();
    //ques7();
    //ques8();
    //ques9();
    //ques10();
    //ques11();
    //ques12();
    //ques13();
    //ques14();
    ques15();
    }

public static void ques1(){
 Scanner in=new Scanner(System.in);
 System.out.println("enter the limit");
 int a=in.nextInt();
for(int i=1;i<=a;i++){
    System.out.println(i);
}
}

public static void ques2(){
    Scanner in =new Scanner(System.in);

    System.out.println("enter the limit");
    int a=in.nextInt();
    int b=in.nextInt();
    for(int i=a;i<=b;i++){
    if(i%2==0){
        System.out.println(i);
    }
    }
}

public static void ques3(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the limit");
    int n=in.nextInt();
    for(int i=n;i>0;i--){
        System.out.println(i);
    }
}

public static void ques4(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the limit");
    int n=in.nextInt();
    int a=0;
    for(int i=1;i<=n;i++){
     a=a+i;
    }
     System.out.println(a);
}

public static void ques5(){
    Scanner in =new Scanner(System.in);
    System.out.println("enter the limit");
    int n=in.nextInt();
    int a=1;
    for(int i=1;i<=n;i++){
        a=a*i;
    }
    System.out.println(a);

}

public static void ques6(){
    Scanner in =new Scanner(System.in);
    System.out.println("enter the limit");
    int n=in.nextInt();
    while(n!=0){
       int a=n%10;
        System.out.println(a);
        n=n/10;
    }
}

public static void ques7(){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the no");
    int n=in.nextInt();
    int b=0;
    while(n!=0){
        int a=n%10;
        b=b+a;
        n=n/10;
    }
   System.out.println(b);
}

public static void ques8(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the no");
    int n=in.nextInt();
    int b=0;
    while(n!=0){
        n=n/10;
        b++;
    }
System.out.println(b);
}

public static void ques9(){
    Scanner in =new Scanner(System.in);
    System.out.println("enter the no");
    int n=in.nextInt();
    while(n!=0){
       int a=n%10;
        System.out.print(a);
        n=n/10;
    }
}

public static void ques10(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the no");
    int n=in.nextInt();
    int m=n;
    int b=0;
    while(n!=0){
    int a=n%10;
    b=b+a;
    b=b*10;
    n=n/10;
    }
    b=b/10;
    System.out.println(b);
    if(m==b){
        System.out.println("the no is palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }
}

public static void ques11(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the no");
    int n=in.nextInt();
    System.out.println("the factors are");
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i);
        }
    }
}

public static void ques12(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the no");
    int n=in.nextInt();
    int a=0;
    System.out.println("the sum of factors are");
    for(int i=1;i<=n;i++){
        if(n%i==0){
            a=a+i;
        }
    }
    System.out.println(a);
}

public static void ques13(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the no");
    int a=0;
    int n=in.nextInt();
    System.out.println("the no factors are");
    for(int i=1;i<=n;i++){
        if(n%i==0){
            a++;
        }
    }
    System.out.println(a);
}

public static void ques14(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the no");
    int c=0;
    int n= in.nextInt();
    for(int i=2;i<n;i++){
        if(n%i==0){
            c=1;
            break;
        }
    }
    if(c==1){
        System.out.println("not a prime");
    }
    else{
        System.out.println("prime no");
    }
}

public static void ques15(){
    int b=0;
    int c=0;
    for(int i=3;i<=100;i++){
        for(int j=2;j<i;j++){
            if(i%j==0){
                b=j;
                c=1;
            }
        }
        if(c!=1){
            System.out.println(b);
        }
        c=0;
    }
}



}