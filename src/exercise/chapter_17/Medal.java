package exercise.chapter_17;

public class Medal {
    public static void main(String[] args){
        //메달 수여
        int myRank =2;
        String medal;

        switch (myRank){
            case 1:
                medal = "금메달";
                break;
            case 2:
                medal = "은메달";
                break;
            case 3:
                medal = "동메달";
                break;
            default:
                medal = "참가상";
        }
        String result = String.format("선수님의 메달은 %S 입니다", medal);
        System.out.println(result);
    }
}
