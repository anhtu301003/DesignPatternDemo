public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape greenCircle = new Circle(new Green());

        redCircle.draw();
        //Output: Drawing Circle. Filling with red color
        greenCircle.draw();
        //Output: Drawing Circle. Filling with green color
    }
}
