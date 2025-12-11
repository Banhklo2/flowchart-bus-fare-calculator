package BusPrice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("요금을 입력하시오: ");
            int price = sc.nextInt();

            if (price < 0 || price > 3000) {
                System.out.println("잘못된 요금입니다.");
                continue;
            }

            if (0 <= price && price <= 3000) {
                System.out.println("요금 입력 완료");
                return;
            }
            sc.close();
        }
    }
}
