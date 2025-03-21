public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void makeComputer(String type) {
        builder.reset();
        if (type.equals("basic")) {
            builder.buildCPU();
        } else {
            builder.buildCPU();
            builder.buildRAM();
            builder.buildGPU();
        }
    }
}