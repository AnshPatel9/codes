//day3
//11-04-2025
import java.util.*;
public class day3{
public static void main(String[] ansh){
    Scanner in=new Scanner(System.in);
    System.out.println("enter your input");
    int a=in.nextInt();
    int c=0;
    for(int i=2;i<a;i++){
        if(a%i==0){
            c=1;
            break;
        }
        else{
         c=0;
        }
    }
    if(c==1){
    System.out.println("not prime");
    }
    else{
    System.out.println("prime");
    }

    //int x=0;
    //while(a!=0){
    //    x=(x*10)+(a%10);
    //    a/=10;
    //}
    //System.out.println(x);

    //int f=1;
    //for(int i=1;i<=a;i++){
    //    f=f*i;
    //} 
    //System.out.println(f);

   // char ab=in.next().charAt(0);
   // System.out.println((int)ab);

   // if(a%3==0){
   //     System.out.println("yes");
   // }
   // else{
   //     System.out.println("no");
   // }

   // System.out.println(a);
   // float x=(float)a;
   // System.out.println(x);

    //if((a%5)==0&&(a%11)==0){
    //    System.out.println("yes");
    //}
    //else{
    //    System.out.println("no");
    //}

   // for(int i=1;i<=10;i++){
   //     System.out.println(a*i);
   // }

    //int b=in.nextInt();
    //int i=0;
    //int c=0;
    //while(i<=a){
    //     c=c+i;
    //     i++;
    //}
    //System.out.println(c);

   // for(int i=1;i<=a;i++){
   //     System.out.println(i);
   // }


   // char ac=in.next().charAt(0);
   // if(ac=='a'||ac=='e'||ac=='i'||ac=='o'||ac=='u'){
   //     System.out.println("vowels");
   // }
   // else{
   //     System.out.println("consonant");
   // }

    //if(a>b){
    //    System.out.println("a is greater");
    //}
    //else{
    //    System.out.println("b is greater");
    //}

   // if(a<0){
   //     System.out.println("negative");
   // }
   // else{
   //     if(a>0){
   //         System.out.println("positive");
   //     }
   //     else{
   //         System.out.println("zero");
   //     }
   // }

   // if((a%2)==0){
   //     System.out.println("even");
   // }
   // else{
   //     System.out.println("odd");
   // }


    //System.out.println("your input is "+a);
    //for(int j=1;j<(a+1);j++){
    //for(int i=0;i<j;i++){
    //    System.out.print("*");
    //}
    //System.out.println();
    //}
    //for(int i=a;i>=0;i--){
    //    for(int j=0;j<=i;j++){
    //        System.out.print("*");
    //    }
    //    System.out.println();
    //}

   // for(int i=0;i<5;i++){
   //     System.out.println("hello");
   // }
   // int a=0;
   // while(a<10){
   //     System.out.println(a);
   //     a++;
   // }

    //switch(a){
    //    case 0:
    //        System.out.println("zero");
    //        break;
    //    case 1:
    //        System.out.println("one");
    //        break;
    //    case 2:
    //        System.out.println("two");
    //        break;
    //    case 3:
    //        System.out.println("three");
    //        break;
    //    case 4:
    //        System.out.println("four");
    //        break;
    //    case 5:
    //        System.out.println("five");
    //        break;
    //    case 6:
    //        System.out.println("six");
    //        break;
    //    case 7:
    //        System.out.println("seven");
    //        break;
    //    case 8:
    //        System.out.println("eight");
    //        break;
    //    case 9:
    //        System.out.println("nine");
    //        break;
    //    default:
    //        System.out.println("invalid input");
    //}


    //int a=in.nextInt();
    //int b=in.nextInt();
    //char c=in.next().charAt(0);
    //switch(c){
    //    case '+':
    //        System.out.println("the sum is "+(a+b));
    //        break;
    //    case '-':
    //        System.out.println("the subtraction is "+(a-b));
    //        break;
    //    case '*':
    //        System.out.println("the multiplication is "+(a*b));
    //        break;
    //    case '/':
    //        System.out.println("the division is "+(a/b));
    //        break;
    //    default:
    //        System.out.println("invalid input");
    //}
}
}

   // System.out.println("input is "+a);
   // switch(a){
   //     case 1:
   //         System.out.println("monday");
   //         break;
   //     case 2:
   //         System.out.println("tuesday");
   //         break;
   //     case 3:
   //         System.out.println("wednesday");
   //         break;
   //     case 4:
   //         System.out.println("thrusday");
   //         break;
   //     case 5:
   //         System.out.println("friday");
   //         break;
   //     case 6:
   //         System.out.println("satyrday");
   //         break;
   //     case 7:
   //         System.out.println("sunday");
   //         break;
   //     default:
   //         System.out.println("invalid input");
   // }



    //int a=5;
    //switch(a){
    //    case 1:
    //    case 2:
    //    case 3:
    //    case 4:
    //        System.out.println("hello");
    //         break;
    //        case 5:
    //            System.out.println("hiiii");
    //            break;
    //        default:
    //            System.out.println("bye");
    //}
//}
//}