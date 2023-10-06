import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int max=100;
      int min=1;
      int a=(int)Math.floor(Math.random()*(max-min+1)+min);


      System.out.println("please enter your guess");
      for(int i=0;i<=10;i++) {

          if(i==10){
              System.out.println("YOU ATTEMPTS ARE OVER! PLEASE TRY AGAIN");
              return;
          }
          Scanner sc = new Scanner(System.in);
          int b = sc.nextInt();
          if(a==b){
              System.out.println("you guess it right!");
              System.out.println("you guessed in :" +(i+1)+ "attempts" );
              return;

          } else if(a>=b){
              System.out.println("you guess it wrong;please guess higher  value");

          }
          else{
              System.out.println("you guess it wrong;please guess lower  value");
          }

      }





    }
}