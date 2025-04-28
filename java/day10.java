public class day10{
  int a=9;
    public static void main(String[] ansh){
        //String str="hello";
       
       //StringBuilder str= new StringBuilder("hello");
       //System.out.println(str);
       //str.append("ansh");
       //System.out.println(str);
      // StringBuilder str= new StringBuilder(10);
      // str.append("hi i am ansh");
      // System.out.println(str.length());
      // System.out.println(str.capacity());
    // func();
    // day10 obj=new day10() ;
    // obj.func2();
    //func3(123453);
    //func4(9);
    //System.out.println(func4(9));
    //func5(9,9);
    //day10 obj=new day10();
    //System.out.println(obj.a);
    ques1();
    }
    public static void func(){
        int a=9;
        int b=9;
        System.out.println(a+b);
    }
    void func2(){
        int a=9;
        int b=9;
        System.out.println(a+b);
    }

    public static void func3(int a){
        int d=0;
     while(a!=0){
        d=d+(a%10);
        a=a/10;
     }
     System.out.println(d);
    }
    public static int func4(int a){
        return a;
    }
    public static void func5(int a,int b){
      int c=a+b;
      int max=0;
      int maxx=0;
      while(c!=0){
      max=c%10;
      c=c/10;
      if(max>maxx){             
        maxx=max;
      }
      }
      System.out.println(a+b);
      System.out.println(maxx);
    }

    public static void ques1(){
      int min=0;
      int []arr={2,3,4,5,6,1,7,8,9};
      int minn = arr[0];
      for(int i=0;i<9;i++){
       for(int j=0;j<9;j++){
        if(arr[i]<arr[j]){
          min=arr[i];
        }
       }
       if(min<minn){
        minn=min;
       }
      }
      System.out.println(minn);
    }

    public static void ques2(){
    int []arr={1,2,3,4,5,6,7,8,9};
    int l=arr.length();
    l=((l)*(l+1))/2;
    int c=0;
    for(int i=0;i<arr.length();i++){

    }
    }
}