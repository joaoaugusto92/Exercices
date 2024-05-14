import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc1 = new Calc();

       System.out.println("Type the first number: ");
       calc1.setNum1(scanner.nextInt());

       System.out.println("Type the operator(+,-,*,/): ");
       calc1.setOp(scanner.next().charAt(0));

       System.out.println("Type the second number: ");
       calc1.setNum2(scanner.nextInt());

       if (calc1.getOp() == '+') {
           System.out.println(calc1.getNum1() + calc1.getNum2());
       } else if (calc1.getOp() == '-') {
           System.out.println(calc1.getNum1() - calc1.getNum2());
       } else if (calc1.getOp() == '*') {
           System.out.println(calc1.getNum1() * calc1.getNum2());
       } else if (calc1.getOp() == '/') {
           System.out.println(calc1.getNum1() / calc1.getNum2());
       }
       else {System.out.println("error");}

    }
}






