
    import java.util.Scanner;
    public class Switchstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firs number:\n");
        int a = sc.nextInt();
        System.out.println("Enter second number:\n");

        int b= sc.nextInt();
        System.out.println("Enter operator");
        char operator=sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a+b);
                
                break;

            case '-':
            System.out.println(a-b);

            break;
            case '*':
            System.out.println(a*b);

            break;
            case '/':
            System.out.println(a/b);

            break;        
            default:
                break;
        }


    }
}



