//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file1 = new TextFile("file1.txt");
        File file2 = new ImageFile("file2.jpg");

        Folder folder = new Folder("My Folder");
        folder.add(file1);
        folder.add(file2);
        folder.show();
    }
}