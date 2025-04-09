import java.util.Scanner;

public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int a=scan.nextInt();
        for(int i=1;i<=10;i++)
        {
            int result=a*i;
            System.out.println(a+" x "+i+" = "+result);
        }

        }
    }