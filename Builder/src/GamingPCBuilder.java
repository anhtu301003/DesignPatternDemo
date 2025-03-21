public class GamingPCBuilder implements ComputerBuilder{
    private Computer computer;

    public GamingPCBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Intel Core i9");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("NVIDIA RTX 4090");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("32GB DDR5");
    }

    public Computer getResult() {
        return this.computer;
    }
}
