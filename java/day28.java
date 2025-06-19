import java.util.*;
public class day28{
    public static void main(String[] ansh){
        int [][]arr={{1,4,7},{2,5,8},{3,6,9}};
        System.out.println(arr);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max=2;
        int min=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]);
                if(j==max){
                    max=max-1;
                    break;
                }
                break;
            }
        }
        
    }
}