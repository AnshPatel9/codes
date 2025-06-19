public class day18{
    public static void main(String[] ansh){
        atm obj=new atm();
    obj.setrupees(900);
    System.out.println(obj.getrupees());
    }
    }

class atm{
  private
  int a;
  void setrupees(int a){
    this.a=a;
  }
  public int getrupees(){
    return a;
  }
}

