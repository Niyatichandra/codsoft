import java.util.Scanner;

import static java.lang.System.exit;

public class atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        account ac=new account();
        int bal=10000000;

        System.out.println("enter 1 for withdrawal 2 for deposit and 3 to check bank balance ");
               int n=sc.nextInt();
               if(n==1)
               {
                 ac.withdrawal(bal);
               }
              else if(n==2)
               {
                   ac.deposit(bal);
               }
              else
               {
                   ac.check(bal);
               }



    }
}
class account
{
   public void withdrawal(int bal) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter amount to withdraw");
       int amt = sc.nextInt();
       if (amt > bal) {
           System.out.println("invalid ,amount greater than balance");
       } else {
           bal = bal - amt;
           System.out.println("amount withdrawn "+amt);
           System.out.println("enter 1 to view balance");
           int f=sc.nextInt();
           if(f==1)
               System.out.println(bal);
           else
               exit(0);

       }
   }

   public void deposit(int bal)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter amount to deposit");
       int amt=sc.nextInt();
       bal=amt+bal;
       System.out.println(bal);
   }
   public void check(int bal)
    {
        System.out.println("balance="+bal);
    }
}

