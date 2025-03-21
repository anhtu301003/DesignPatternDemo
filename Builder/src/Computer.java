public class Computer {
    private String CPU;
    private String GPU;
    private String RAM;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }


    public void setGPU(String GPU) {
        this.GPU = GPU;
    }


    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM + "]";
    }
}
