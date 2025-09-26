package Lv3_Lv4;


import java.util.*;

public class Category {
    // 카데고리를 key 값에 저장하고 value 부분에 List를 넣기
    // 카데고리 출력 -> key 값 출력
    // 전자기계 출력 -> value 출력으로 간편해짐
    Map<String, List<Product>> category;
//    Scanner scanner = new Scanner(System.in);

    public Category() {
        category = new HashMap<>();
        category.put("전자제품",new ArrayList<>());
        category.put("의류",new ArrayList<>());
        category.put("식품",new ArrayList<>());

        category.get("전자제품").add(new Product("Galaxy S25",1200000,"최신 안드로이드 스마트폰",1));
        category.get("전자제품").add(new Product("iPhone 16",1350000,"Apple의 최신 스마트폰",1));
        category.get("전자제품").add(new Product("MacBook Pro",2400000,"M3 칩셋이 탑재된 노트북",1));
        category.get("전자제품").add(new Product("AirPods Pro ",350000,"노이즈 캔슬링 무선 이어폰",1));

        category.get("의류").add(new Product("AirPods Pro ",350000,"노이즈 캔슬링 무선 이어폰",1));

        category.get("식품").add(new Product("AirPods Pro ",350000,"노이즈 캔슬링 무선 이어폰",1));


    }

    public  void addProduct(String categoryName, String name, int price, String introduction, int stock) {
        // get은 해쉬함수 ket를 통해 벨류 list 가져오기
        // add는 리스트에 새로운 프로덕트 추가
        category.get(categoryName).add(new Product(name, price, introduction, stock));
    }

    public void addCategory(String categoryName) {
        category.put(categoryName, new ArrayList<>());
    }

    public void showCategory() {
        int index = 1;
        for (String key : category.keySet()) {
            System.out.println(index + ". " + key);
            index++;
        }
        System.out.println("0. 종료 \t | 프로그램 종료");
    }

    public void showAllProducts(String categoryName) {
        List<Product> products = category.get(categoryName);

        // NullPointerException 발생
        if(products == null) {
            System.out.println("존재하지 않는 카테고리입니다.");
        }

        // Array이기 때문에 index 접근 가능
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }

        System.out.println("0. 뒤로가기");
    }

    public List<Product> getProducts(String categoryName) {
        return category.get(categoryName);
    }
}
