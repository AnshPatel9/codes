import java.util.*;
public class day27{
    public static void main(String[] ansh){
        try{
            File file=new file("new.txt");
            if(file.createNewFile()){
                System.out.println("file created"+file.getNewFile());
            }
                else{
                    System.out.println("flie already exist");
                }
        }
        catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
            }
        }