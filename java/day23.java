import java.util.*;
public class day23{
    public static void main(String[] ansh){
//ArrayList<String> set =new ArrayList<>();
//set.add("ansh");
//set.add("patel");
//set.add("Ansh");
//set.add("Patel");
//System.out.println(set);
//Iterator<String> it=set.iterator();
//while(it.hasNext()){
//    String data=it.next();
//    if(data.startsWith("p")){ 
//        it.remove();
//    }
//}
//System.out.println(set);
ArrayList<String> set=new ArrayList<>();
set.add("ansh");
set.add("patel");
set.add("Ansh");
set.add("Patel");
ListIterator<String> it=set.listIterator();
*while(it.hasNext()){
    String data=it.next();
    System.out.println(data);
}
System.out.println("yes");
while(it.hasPrevious()){
    String prevdata=it.previous();
    System.out.println(prevdata);
}
while(it.hasNext()){
    String data=it.next();
    
}
    }
}