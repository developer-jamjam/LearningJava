package exercise.chapter_42;


public class Customer {

    static int serialNums = 1;

    protected String customerID;
    protected String customerName;
    protected String customerGrade;

    protected int bonusPoint; // 보너스 포인트
    protected double bonusPointRatio; // 보너스 포인트 적립 비율

    // 행위
    public int calculatePrice(int price) {
        // 대부분 코드 구현상 내가 가지고 있는 속성은 내가 계산하는 것이 편하다.
        this.bonusPoint += price * bonusPointRatio; // 보너스 포인트 계산
        return price;
    }

    // 생성자
    Customer() {

    }
    Customer(String name){
        if(serialNums < 10) {
            this.customerID = "Customer0" + serialNums++;
        } else {
            this.customerID = "Customer" + serialNums++;
        }
        this.customerName = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    void printMyInfo(){
        System.out.printf("Customer (customer ID: %s , name = %s , customerGrade=%s, bonusPoint = %d)\n",
                this.customerID,this.customerName,this.customerGrade,this.bonusPoint);
    }
}
