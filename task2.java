import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter marks in math");
        int a=sc.nextInt();
        System.out.println("enter marks in hindi");
        int b=sc.nextInt();
        System.out.println("enter marks in english");
        int c=sc.nextInt();
        System.out.println("enter marks in science");
        int d=sc.nextInt();
        System.out.println("enter marks in social science");
        int e=sc.nextInt();
        int total=(a+b+c+d+e);
        int average=(total)/5;
        String grade;

        if(average>=90){
            grade="A";
        }else if(average>=80){
            grade="B";
        }
       else if(average>=70){
            grade="C";
        }
        else if(average>=60){
            grade="D";
        }
        else if(average>=50){
             grade="E";
        }
        else{
             grade="F";
        }
        System.out.println("total marks:"+total);
        System.out.println("total percentage:"+average);
        System.out.println("your grade is :"+grade);


    }
}