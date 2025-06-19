import java.util.ArrayList;
import java.util.Collections;
class day21{
    public static void main(String[] ansh){
ArrayList<String> arr=new ArrayList<>();
arr.add("ansh");
arr.add("Ansh");
arr.add("ANSH");
arr.add(3,"patel");
System.out.println(arr);
System.out.println(arr.get(2));
System.out.println(arr.remove(3));
System.out.println(arr);
Collections.sort(arr);
for(int i=0;i<arr.length;i++){
    
}
    }
}