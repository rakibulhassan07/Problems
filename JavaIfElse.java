import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int a=scan.nextInt();

        if(a%2==0 && 2<a&& a<5)
        {
            System.out.println("Not Weird");
        }
        else if (a%2==0 && 6<a && a<20) {
            System.out.println("Weird");
        }
        else if (a%2==0 && a>20) {
            System.out.println("Not Weird");
        }
        else{
            System.out.println("Weird");
        }
        }
    }