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
Product 객체가 순회를 다 돌고 나서 한 번 
응답이 0일 때 한 번 해서 
조건문 속에 조건문이 들어가는 일이 발생 -> 더 효율적이게 바꿀 수 있을까? 고민을 했으나 아직 정답을 모르겠음 



