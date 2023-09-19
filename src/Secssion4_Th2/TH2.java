package Secssion4_Th2;
import java.util.Scanner;
public class TH2 {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();

        boolean studentFound = false; // Sử dụng cờ để kiểm tra xem sinh viên có tồn tại trong danh sách hay không

        for (int i = 0; i < students.length; i++) {
            if (input_name.equals(students[i])) {
                studentFound = true; // Đặt cờ thành true nếu tìm thấy sinh viên
                break; // Thoát khỏi vòng lặp khi tìm thấy sinh viên
            }
        }

        if (studentFound) {
            System.out.println("The student is in the list.");
        } else {
            System.out.println("The student is not in the list.");
        }


    }
}
