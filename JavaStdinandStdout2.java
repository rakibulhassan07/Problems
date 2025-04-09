import java.util.Scanner;

public class JavaStdinandStdout2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int a=scan.nextInt();
        Double b=scan.nextDouble();
        scan.nextLine();
        String S=scan.nextLine();
        System.out.println("String: "+S);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);

        }
    }
