
  import java.util.*;
  class Banking{
    double amount;
     String result;
    public void Balance(double amount){
        if(amount!=0){
            System.out.println("You can Withdrawa "+amount+" avalible");
        }
    }
    public void Withdrawa(double amount){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the withdrawal amount");
        int withdrawal=sc.nextInt();
        if(amount<withdrawal){
            amount-=withdrawal;
            System.err.println("You'r withdrawal sucessfull  completed: "+amount);
        }
        else{
            System.err.println("insufficent balance");
        }
    }
    public static void main(String[] args) {
        Banking bn=new Banking();
        bn.Balance(15000);
        bn.Withdrawa(1000);
    }
}