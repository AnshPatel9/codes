import java.util.*;
public class day12{
    public static void main(String[] ansh){
     String[] str={"B","A","C"};
     for(int i=0;i<str.length-1;i++){
        for(int j=0;j<str.length-1-i;j++){
            if((int)str[j].charAt(0)>(int)str[j+1].charAt(0)){
                String t=str[j];
                str[j]=str[j+1];
                str[j+1]=t;
            }
        }
     }

for(String i:str){
    System.out.println(i);
}
}
}