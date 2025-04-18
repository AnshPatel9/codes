import java.util.*;
public class day6{
    public static void main(String[] ansh){
    //Scanner in=new Scanner(System.in);
    //int []a={1,2,3,4,5,6,7,8,9,0};
    //System.out.println("enter the number to find");
    //int b=in.nextInt();
    //int c=0;
    //int i;
    //for( i=0;i<10;i++){
    //    if(a[i]==b){
    //        c=1;
    //        break;
    //    }
    //}
    //if(c==1){
    //        System.out.println("found on "+i);
    //    }
    //    else{
    //        System.out.println("not found");
    //    }
        //array();
        //array2();
        //array3();
        //array4();
        //array5();
    }

    public static void array(){
        int []a={1,2,3,4,5};
        int []b={6,7,8,9,10};
        int i;
        int c=0;
        int d=0;
        for(i=0;i<5;i++){
            c=c+a[i];
        }
        for(i=0;i<5;i++){
            d=d+b[i];
        }
        System.out.println(c);
        System.out.println(d);
    }

    public static void array2(){
        int []a={1,2,3,4,5};
        int []b={6,7,8,9,10};
        int []c=new int [5];
        int i;
        for(i=0;i<5;i++){
            c[i]=a[i]+b[i];
        }
        for(i=0;i<5;i++){
            System.out.println(c[i]);
        }
    }

    public static void array3(){
        int []a={1,2,3,4,5};
        int []b={1,2,3,4,5};
        int c=0;
        int i;
        for(i=0;i<5;i++){
            if(a[i]==b[i]){
                c=1;
            }
            else{
                c=0;
                break;
            }
        }
        if(c==1){
            System.out.println("arrays are equal");
        }
        else{
            System.out.println("arrays are not equal");
        }
    }

    public static void array4(){
        int []a={1,2,3,4,5};
        int []b={6,7,8,9,10};
        int []c=new int[10];
        int i;
        for(i=0;i<5;i++){
            c[i]=a[i];
        }
        for(i=5;i<10;i++){
            c[i]=b[(i-5)];
        }
        System.out.println("merged array is");
        for(i=0;i<10;i++){
            System.out.println(c[i]);
        }
    }

    public static void array5(){
        int []a={1,2,3,4,5};
        int []b={6,7,8,9,10};
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
            if(a[i]==b[j]){
                System.out.println(a[i]+" is common");
                break;
            }
        }
        }
    }

    public static void array6(){

    }
}