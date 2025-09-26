package Lv1_Lv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CommerceSystem commerceSystem = new CommerceSystem();
        commerceSystem.addProduct("오정빈",23,"휴학생",1);
        commerceSystem.start();

        int answer = scanner.nextInt();
        while(answer == 0){
            break;
        }
    }
}