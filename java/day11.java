import java.util.*;
public class day11{
    public static void main(String[] ansh){
    //sort();
    array();
    }


public static void sort(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter the size of array");
    int s=in.nextInt();
    System.out.println("*************************************************************");
    int t;
    int []a= new int[s];
    System.out.println("enter the elements of array");
    for(int i=0;i<s;i++){
        a[i]=in.nextInt();
    }
    System.out.println("*************************************************************");
    System.out.println("given array is");
    for(int i=0;i<s;i++){
        System.out.println(a[i]);
    }
    System.out.println("*************************************************************");
    System.out.println("sorted array is");
    for(int i=0;i<s;i++){
        for(int j=0;j<(s-1);j++){
            if(a[j]>a[i]){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
    }
    for(int i=0;i<s;i++){
    System.out.println(a[i]);
    }
}

public static void array(){
    int n=0;
    int m=0;
    Scanner in =new Scanner(System.in);
    System.out.println("enter the no of rows and columns");
    int r=in.nextInt();
    int c=in.nextInt();
     System.out.println("*************************************************************");
    int [][]a=new int[r][c];
    System.out.println("enter the elements of array");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[i][j]=in.nextInt();
        }
    }
     System.out.println("*************************************************************");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
     System.out.println("*************************************************************");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(a[i][j]==0){
                System.out.println("find at index "+i+""+j);
                n=j;
                m=i;
            }
        }
    }
 System.out.println("*************************************************************");
for(int i=0;i<r;i++){
    a[i][n]=0;
}
for(int j=0;j<c;j++){
    a[m][j]=0;
}





for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
}
}


}