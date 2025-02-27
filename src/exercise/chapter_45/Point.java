package exercise.chapter_45;

public class Point<T extends Number,V extends Number> {
    private T x;
    private V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public Double calculateDistance() {
//        (X**2 + y**2) ^ 1/2
//        if 문으로 Number Type 인지 검증
//        public class Point<T extends Number,V extends Number>  추가로 검증 필요 X
//        if (! (this.x instanceof Number)) {
//            return null;
//        }
//        if (! (this.y instanceof Number)) {
//            return null;
//        }

        Double num1 = this.x.doubleValue();
        Double num2 = this.y.doubleValue();

        return Math.sqrt((Math.pow(num1, 2) + Math.pow(num2, 2)));
    }
}
