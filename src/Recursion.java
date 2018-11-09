import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        getUserInputNoRecursion(scanner, 1, 5);
//       getUserInput(scanner,1,5);
        createArray(scanner);

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

    private static int[] createArray (Scanner sc){
        System.out.println("введите длинну");
        int lenght = sc.nextInt();
        
        int[] array = new int[lenght];;

        if (lenght == 0 || lenght >10){
            System.out.println("длинна массива должна быть от - до 10");
            array = createArray(sc);
        }
        System.out.println("последний элемент массива = " + array[lenght - 1]);
        return array;
    }

//public static int getUserInputNoRecursion(Scanner scanner, int min, int max) {  // бесконечная ошибка
//    System.out.println("enter number from " + min + " to " + max);
//    int result;
//    while (true) {
//        try {
//            result = scanner.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("not a number");
//            continue;
//        }
//        if (result < min || result > max) {
//            System.out.println("number not from " + min + " to " + max);
//            continue;
//        }
//        return result;
//    }
//}
}
