//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String[] colors = {"Red","Green","Blue","White","Black"};
    public static void main(String[] args) {
        for(int i = 0;i<20;i++){
            Circle circle = CircleFactory.getCircle(getRandomColor());
            circle.setPosition(getRandomX(),getRandomY());
            circle.draw();
        }
    }
    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX(){
        return (int)(Math.random()*100);
    }
    private static int getRandomY(){
        return (int)(Math.random()*100);
    }
}
