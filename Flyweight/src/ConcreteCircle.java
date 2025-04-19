public class ConcreteCircle implements Circle {
    private String color;// Trạng thái nội tại (intrinsic)
    private int x;        // Trạng thái ngoại tại (extrinsic)
    private int y;        // Trạng thái ngoại tại (extrinsic)

    public ConcreteCircle(String color){
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a "+ color + " circle at (" + x + ", " + y + ")");
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
