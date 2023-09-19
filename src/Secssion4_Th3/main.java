package Secssion4_Th3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,11,6,7,8,9};
        int Max =0;
        int index = -1;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= Max) {
                Max = arr[i];
                index = i + 1;
            }
        }
        System.out.println( " Số lớn nhất trong mảng la : " + Max + " tại vị trí : " + index);


    }
}
