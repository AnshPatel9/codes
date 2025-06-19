import java.util.*;
public class day22{
    public static void main(String[] ansh){
//LinkedList<Integer> arr=new LinkedList<>();
//arr.add(9);
//arr.add(18);
//arr.add(27);
//arr.add(36);
//arr.add(45);
//System.out.println(arr);
//System.out.println(arr.contains(9));
//arr.remove(2);
//System.out.println(arr);
//System.out.println(arr.contains(27));
//System.out.println(arr.IndexOf());

TreeSet<String> set=new TreeSet<>();
set.add("a");
set.add("b");
set.add("c");
set.add("d");                                 
set.add("e");
set.add("F");
System.out.println(set);

HashSet<String> sett=new HashSet<>();
sett.add("a");
sett.add("b");
sett.add("c");
sett.add("d");
sett.add("e");
sett.add("F");
System.out.println(sett);
int []arr={1,2,2,42,4,5,3,53,45,3,5};
TreeSet<Integer> set1=new TreeSet<>();
for(int i=0;i<arr.length;i++){
    set1.add(arr[i]);
}
System.out.println(set1);

HashMap<String,Integer> map=new HashMap<>();
map.put("id0",1);
map.put("id1",2);
map.put("id2",3);
System.out.println(map.get("id0"));

    }
}