import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getUserInput(scanner,1,5);
    }
    public static int getUserInput(Scanner sc, int min, int max){
        System.out.println("Введите число от " +min+ " до " + max);
        int result;
        try{
            result = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("вы ввели не число");
            return getUserInput(sc,min,max);
        }
        if (result<min || result > max){
            System.out.printf("Вы ввели число не от %d до %d \n", min, max);
            return getUserInput(sc,min,max);
        }
        return result;
    }
}
