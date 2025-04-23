public class day9{
    public static void main(String[] ansh){
     //   String str="happy new year";
     //   String newstr="";
     //   for(int i=0;i<str.length();i++){
     //       char c=str.charAt(i);
     //       if(newstr.indexOf(c)==-1){
     //           newstr=newstr+c;
     //       }
     //   }
     //   System.out.println(newstr);

   // String str="helolo";
   //     String newstr="";
   //     for(int i=0;i<str.length();i++){
   //       char c=str.charAt(i);
   //         if(newstr.indexOf(c)==-1){
   //             newstr=newstr+c;
   //         }
   //         else{
   //     System.out.println(c);
   //             break;
   //         }
   //     }


  String str="helllloo";
  int count=1;
  int max=1;
  for(int i=0;i<str.length();i++){
  char c=str.charAt(i);
  for(int j=(i+1);j<str.length();j++){
      if(c==str.charAt(j)){
      count=count+1;
      if(count>max){
          max=count;
      }
      }
  }
  }
  System.out.println(max);


    }
}