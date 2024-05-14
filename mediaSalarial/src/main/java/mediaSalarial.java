import java.util.Scanner;
public class mediaSalarial {
    public static void main (String[] args) {

        /* to do a program that, the user provides the salary of each one,
        and the program calculate the media of all salaries */

        /* create variables for sum of salaries, media of salaries, number of workers*/

        int media = 0, numberOfWorkers = 0, sumOfSalaries = 0, salarios = 0, ans = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i<5; i++){
            System.out.println("digite o salário: ");
            salarios = in.nextInt();
            numberOfWorkers++;
            sumOfSalaries = sumOfSalaries + salarios;

            System.out.println("voce quer continuar? (digite 1, se sim, 2, se nao)");
            ans = in.nextInt();

            if (ans == 2){
                break;
            }
        }
        media = sumOfSalaries/numberOfWorkers;





    }
}
