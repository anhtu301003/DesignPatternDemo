public class TextFile implements File {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("TextFile: " + name);
    }

    @Override
    public void add(File file) {
        throw new UnsupportedOperationException("Cannot add to a TextFile.");
    }
}
