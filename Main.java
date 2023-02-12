import java.util.Scanner;
//Ввод Массива , обработка элементов
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int numbers[] = new int [size];

        for (int i = 0; i < numbers.length;i++ ){
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < numbers.length;i++){
            sum += numbers[i];
        }

        System.out.println(sum);

    }
}
