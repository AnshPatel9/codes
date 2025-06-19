import java.util.*;
public class day20 implements client1,client2{
    public void show(){
        System.out.println("checked");
    }
    public static void main(String[] ansh){
day20 obj=new day20();
obj.show();



       // dev obj=new dev();
       // obj.print();
       // obj.show();
       // String str="aaabbbbcccc";
       // int count=1;
       // StringBuilder newStr=new StringBuilder();
       // for(int i=1;i<str.length();i++){
       //     if(str.charAt(i)==str.charAt(i-1)){
       //     count++;
       //     }
       //     else{
       //     newStr.append(str.charAt(i-1)).append(count);
       //     count=1;
       //     }
       // }
       // newStr.append(str.charAt(str.length()-1)).append(count);
       // System.out.println(newStr);
    }
}

//interface client{
//    void print();
//    void show();
//
//}
//
//class dev implements client{
//    public void print(){
//        System.out.println("bill");
//           }
//           public void show(){
//            System.out.println("paid");
//           }
//}

interface client1{
    void show();
}
interface client2{
    void show();
}