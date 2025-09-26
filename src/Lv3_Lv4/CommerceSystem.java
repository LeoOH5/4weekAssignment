package Lv3_Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    List<Product> products = null;

    // 선언과 동시에 초기화 안하면 NullPointException 발생한다.
    Category category = new Category();

    Scanner scanner = new Scanner(System.in);
    public void start(){
        category.showCategory();
        boolean temp = false;
        String categoryName = null;
        while(true){

            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    categoryName = "식품";
                    products = category.getProducts(categoryName);
                    break;
                case 2:
                    categoryName = "의류";
                    products = category.getProducts(categoryName);
                    break;
                case 3:
                    products = category.getProducts(categoryName);
                    break;
                case 0:
                    temp = true;
                    break;
            }

            if(temp){
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }

            category.showAllProducts(categoryName);

            switch (Integer.parseInt(scanner.nextLine())){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
            }

        }

    }
}
