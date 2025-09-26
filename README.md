# 4weekAssignment

        int count = 0;

        while(true){
            if(count==products.size()){
                System.out.println("0. 종료 \t| 프로그램 종료");
                int answer = scanner.nextInt();
                if(answer==0){
                    break;
                }
            }
            System.out.println((count+1)+". " + products.get(count));
            count++;

        }

Lv1 설계에서 
product에 저장된 객체를 순회를 돌아 보여주고 마지막에 0은 종료를 보여주기 위해 
for 보다는 while이 적합하다고 판단
while하고 count라는 변수를 선언해 순회할 때마다 1씩 증가해서 product 순회후 출력 
출력 코드를 간결하게 하기 위해 product에서 toString 사용 

--- 
Lv1 고민 부분 
while하고 count 변수를 사용하니 
Lv1_Lv2.Product 객체가 순회를 다 돌고 나서 한 번 
응답이 0일 때 한 번 해서 
조건문 속에 조건문이 들어가는 일이 발생 -> 더 효율적이게 바꿀 수 있을까? 고민을 했으나 아직 정답을 모르겠음 


---

public class Lv1_Lv2.CommerceSystem {
List<Lv1_Lv2.Product> products;

    public Lv1_Lv2.CommerceSystem() {
        products = new ArrayList<>();
        products.add(new Lv1_Lv2.Product("Galaxy S25",1200000,"최신 안드로이드 스마트폰",1));
        products.add(new Lv1_Lv2.Product("iPhone 16",1350000,"Apple의 최신 스마트폰",1));
        products.add(new Lv1_Lv2.Product("MacBook Pro",2400000,"M3 칩셋이 탑재된 노트북",1));
        products.add(new Lv1_Lv2.Product("AirPods Pro ",350000,"노이즈 캔슬링 무선 이어폰",1));
    }

    // main에서 값 받아서 Products 생성
    public void addProduct(String name, int price, String introduction, int stock) {
        products.add(new Lv1_Lv2.Product(name, price, introduction, stock));
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

---
Lv2 설계에서 어려웠던 점 : 
Lv1_Lv2.Product 객체를 어떻게 생성해야 효율적일까 감이 오지 않아 고민을 했다. 
필드에 List 타입 프로덕트를 생성하고 Lv1_Lv2.CommerceSystem 생성자에서 인스턴스화를 진행했고 
product를 추가로 생성하고 싶을 때는 void 함수를 통해 생성을 하게 설계를 했다.
Lv2 과제를 통해서 객체지향이라는 것이 무엇인지 조금은 감을 잡게 되었다.



