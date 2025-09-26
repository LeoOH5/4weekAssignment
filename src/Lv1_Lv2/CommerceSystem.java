package Lv1_Lv2;

import java.util.ArrayList;
import java.util.List;

public class CommerceSystem {
    List<Product> products;

    public CommerceSystem() {
        products = new ArrayList<>();
        products.add(new Product("Galaxy S25",1200000,"최신 안드로이드 스마트폰",1));
        products.add(new Product("iPhone 16",1350000,"Apple의 최신 스마트폰",1));
        products.add(new Product("MacBook Pro",2400000,"M3 칩셋이 탑재된 노트북",1));
        products.add(new Product("AirPods Pro ",350000,"노이즈 캔슬링 무선 이어폰",1));
    }

    // main에서 값 받아서 Products 생성
    public void addProduct(String name, int price, String introduction, int stock) {
        products.add(new Product(name, price, introduction, stock));
    }

    public void start(){
        // 원래처럼 하면 무한루프에 걸려서 수정
        // 반복문 끝나면 출력되게 변경
        int count = 0;

        while(count < products.size()){
            System.out.println((count+1)+". " + products.get(count));
            count++;
        }
        System.out.println("0. 종료 \t| 프로그램 종료");
    }
}
