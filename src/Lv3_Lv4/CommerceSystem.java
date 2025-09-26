package Lv3_Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    List<Product> products = new ArrayList<>();

    // 선언과 동시에 초기화 안하면 NullPointException 발생한다.
    Category category = new Category();

    Scanner scanner = new Scanner(System.in);
    public void start(){

        boolean temp = false;
        String categoryName = null;
        while(true){
            category.showCategory();
            // switch case 사용시
            // 추가가 되면 일일이 추가해야하는 문제 발생 -> 해결 방법 모르겠음
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
                    categoryName = "전자제품";
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
                    System.out.println(products.get(0).getProductStock());
                    break;
                case 2:
                    System.out.println(products.get(1).getProductStock());
                    break;
                case 3:
                    System.out.println(products.get(2).getProductStock());
                    break;
                case 4:
                    System.out.println(products.get(3).getProductStock());
                    break;
                case 0:
                    break;
            }

        }

    }
}
