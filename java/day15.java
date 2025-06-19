public class day15{
    public static void main(String[] ansh){
//dog obj=new dog();
//obj.eat();
//obj.bark();
parent obj=new parent();
obj.sum(1,2);
obj.sum(3,3,3);
    }
}

// class animal{
//    void eat(){
//        System.out.println("eatttt");
//    }
//}
//
//class dog extends animal{
//    void bark(){
//        System.out.println("bow wow");
//    }
//}

class parent{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}