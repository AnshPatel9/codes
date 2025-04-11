public class basic3{
    public static void main(String[] args){
        int a,b,c;
        a=9;
        b=3;
        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("the swapped value of a is "+a);
        System.out.println("the swapped value of b is "+b);
    }
}