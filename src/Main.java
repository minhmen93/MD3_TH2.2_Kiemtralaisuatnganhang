import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0; // tiền gửi
        int month = 1;
        double interestRate = 1.0; // tỉ lệ lãi suất
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi :");
        money = input.nextDouble();
        System.out.println("Nhập số tháng :");
        month = input.nextInt();
        System.out.println("Nhập số tiền lãi :");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i=0;i<month; i++){
            totalInterest += money * (interestRate/100)/12* month;
        }
        System.out.println(" Tổng số tiền lãi là :"+totalInterest);
    }
}