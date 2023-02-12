import java.util.Scanner;
//Вывод массива ,поиск элементов в массиве
public class Main2 {
    public static void main(String[] args) {
        int numbers [] = {23, 10, 55, 12, 45 , 67, 1, 20 };

        System.out.print("number = { ");
        for(int i = 0 ; i < numbers.length;i++){
            System.out.print(numbers [i] + " ");
        }
        System.out.println(" } ");

        Scanner scanner = new Scanner(System.in);
        int numberForSearch = scanner.nextInt();

        int position = -1;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == numberForSearch){
                position = i;
                break;
            }
        }
        System.out.println(position);
    }
}
