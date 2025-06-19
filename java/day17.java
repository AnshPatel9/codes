public class day17{
    public static void main(String[] ansh){
//upipayment obj=new upipayment();
//obj.print();
//obj.pay(1000);
//cardpayment obj1=new cardpayment();
//obj1.pay(2000);

circle obj1=new circle();
obj1.area(1);
square obj2=new square();
obj2.area(3);
    }
}

//abstract class payment{
//    abstract void pay(int a);
//    void print(){
//        System.out.println("payment done ");
//    }
//}
//
//class upipayment extends payment{
//    void pay(int a){
//        System.out.println("payment done via upi "+a);
//    }
//}
//
//class cardpayment extends payment{
//    void pay(int a){
//        System.out.println("card payment done "+a);
//    }
//}

abstract class shape{
    //abstract void type(String a);
    abstract void area(int a);
   // abstract void area(int b,int c);
}

class circle extends shape{
    void area(int a){
        System.out.println("the area is "+(3.14)*(a*a));
    }
}
class square extends shape{
    void area(int a){
        System.out.println("the area is "+(a*a));
    }
}