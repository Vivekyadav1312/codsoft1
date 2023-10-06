import java.util.*;
public class Main {
    public static void main(String []args){
        int balance=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("press 1 for deposit");

        System.out.println("press 2 for withdraw");

        System.out.println("press 3 for balance check");
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Enter the amount");

                int b=sc.nextInt();
                balance+=b;
                System.out.println("your updated balance is "+balance);
                break;
            case 2:
                System.out.println("Enter the amount");

                int c=sc.nextInt();
                if(c<=balance) {
                    balance -= c;
                    System.out.println("your updated balance is " + balance);
                } else{
                    System.out.println("your balance is low");
                }
                break;
            case 3:
                System.out.println("your balance is "+balance);
        }


    }
}