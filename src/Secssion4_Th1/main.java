package Secssion4_Th1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số phần tử mảng");
            size = scanner.nextInt();
            if(size > 20) {
                System.out.print("Số phần tử mảng không không vượt quá 20");
            }

        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Nhập phần tử mảng" + i + " ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("\n %-20s%s", "mảng mới nhập :", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Mảng sau khi đảo ngược: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


    }

}