package exercise.chapter_33;

public class Fish extends Animal{
    // 속성
    private boolean havingPoison;
    private String livingSea;

    // 행위

    @Override
    public void eat(String food) {
        System.out.printf("물고기가 %s 을 뻐끔뻐금하며 입으로 먹습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("물고기가 잠을 자고 있습니다.\n");
    }
    public void swim(){
        System.out.println("물고기가 신나게 헤엄을 치고 있습니다.\n");
    }
}

