package exercise.chapter_19;

public class ThreeSixNineGame {
    public static void main(String[] args){
        for(int num = 1; num <= 30; num++) {
            if(num %3 == 0) {
                // 3으로 나눴을때 나머지가 0인것 = 3의 배수
                System.out.print("짝,");
                continue;
            }
            System.out.printf("%d,", num);
            //결과
            // : 1,2,짝,4,5,짝,7,8,짝,10,11,짝,13,14,짝,16,17,짝,19,20,짝
            // ,22,23,짝,25,26,짝,28,29,짝,
        }
    }
}
