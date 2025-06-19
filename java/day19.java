public class day19{
    public static void main(String[] ansh){
       // int[]arr={-4,0,5,5,0,0,-5};
       // int index=0;
       // int[] narr=new int[arr.length];
       // for(int i=0;i<arr.length;i++){
       //     if(arr[i]<0){
       //         narr[index++]=arr[i];
       //     }
       // }
       // for(int j=0;j<arr.length;j++){
       //     if(arr[j]==0){
       //         narr[index++]=arr[j];
       //     }
       // }
       // for(int k=0;k<arr.length;k++){
       //     System.out.println(narr[k]);
       // }
       
       int[] arr={1,2,3,4,5};
       int a=arr.length;
       for(int i=arr.length-1;i>0;i--){
        arr[i]=arr[i-1];
       }
arr[0]=a;

       for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]);
       }
            }
        }