/**
 * Question6
 */

class Account{
    int ac_no;
    float balance;
    String name,ac_name;
    public Account(int ac_no,float deposite,String name,String ac_name){
        this.ac_name=ac_name;
        this.ac_no=ac_no;
        this.name=name;
        balance=deposite;
    }
    public void Withdrawl(int amount){
        if(amount>balance){
            System.out.println("Please enter a valid amount");
            return;
        }
        balance=balance-amount;
        System.out.println(amount+"Has been withdrawn and your current balance is"+balance);
    }
    public void deposite(int amount){
        balance=balance+amount;
        System.out.println("The amount has been deposited current balance:"+balance);
    }
    public void display(){
        System.out.println("Account Name"+ac_name);
        System.out.println("Account No"+ac_no);
        System.out.println("name:"+name);
        System.out.println("Balance:"+balance);
    }
}

public class Question6 {
    public static void main(String[] args) {
        Account obj1=new Account(000, 1000, "Vagish Gupta", "Savings");
        obj1.display();
        obj1.Withdrawl(100);
        obj1.deposite(250);
        obj1.display();
    }
}