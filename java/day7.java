import java.util.*;
public class day7{
    public static void main(String[] ansh){
    //array1();
    //array2();
    //array3();
    String str="hello";
    
    //System.out.println(str.charAt(1));
    for(int i=0;i<str.length();i++){
        System.out.println(str.charAt(i));
    }
    }
    public static void array1(){
        int [][] arr={{1,2,3,4},{3,4,5,6},{4,5,6,7}};
        int s=0,d=0;
        Scanner in=new Scanner(System.in);
        System.out.println("eneter the dimensional of array");
        int m=in.nextInt();
        int n=in.nextInt();
        //arr[i].length
        //arr[j].length
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               // s=arr[i][j];
                d++;
            }
        }
        //for(int i=0;i<3;i++){
        //    for(int j=0;j<4;j++){
        //        System.out.println(arr[i][j]);
        //    }
        //}
        System.out.println(d);
        int [] b=new int [d];
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++)
            b[i*n+j]=arr[i][j];
        }
        for(int i=0;i<d;i++){
            System.out.println(b[i]);
        }
        }
    

    public static void array2(){
       int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr2[i][j]+" ");
        }
        System.out.println();
       }

    }

    public static void array3(){
        int [][] arr3={{1,2,3},{4,5,6},{7,8,9}};
        int s=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                s=s+arr3[i][j];
            }
        }
        System.out.println(s);
    }

    public static void array4(){

    }
        }
    