public class OfficePCBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficePCBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Intel Core i5");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("Integrated GPU");
    }

    public Computer getResult() {
        return this.computer;
    }
}
