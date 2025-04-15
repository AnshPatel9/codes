import java.util.*;
public class day4{
    public static void main(String[] ansh){
        Scanner in=new Scanner(System.in);
       pattern1();
        pattern2();
        pattern3();
       pattern4();
       //pattern5();
}
public static void pattern1(){
    int i,j;
    for(i=0;i<=5;i++){
        for(j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void pattern2(){
    int i,j,k;
     for(i=0;i<=5;i++){
       for(j=5;j>=i;j--){
        System.out.print("*");
       }
       System.out.println();
     }
}

public static void pattern3(){
    int i,j,k;
    for(i=0;i<=5;i++){
        for(j=0;j<=i;j++){
            System.out.print(" ");
        }
        for(k=i;k<=5;k++){
            System.out.print("*");
        }
        System.out.println();
}
}

public static void pattern4(){
    int i,j,k;
    for(i=0;i<=5;i++){
        for(j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(k=0;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
}
}

public static void pattern5(){
    int i,j,k;
    for(i=0;i<=5;i++){
        for(j=i;j<=5;j++){
            System.out.print(" ");
        }
        for(k=0;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}