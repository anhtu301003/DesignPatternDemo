public class Main {
    public static void main(String[] args) {
        // Xây dựng máy tính Gaming
        GamingPCBuilder gamingBuilder = new GamingPCBuilder();
        ComputerDirector director = new ComputerDirector(gamingBuilder);

        director.makeComputer("basic");
        Computer basicGamingPC = gamingBuilder.getResult();
        System.out.println("Basic Gaming PC: " + basicGamingPC);

        director.makeComputer("full");
        Computer fullGamingPC = gamingBuilder.getResult();
        System.out.println("Full Gaming PC: " + fullGamingPC);

        // Chuyển sang builder cho Office PC
        OfficePCBuilder officeBuilder = new OfficePCBuilder();
        director.changeBuilder(officeBuilder);

        director.makeComputer("full");
        Computer officePC = officeBuilder.getResult();
        System.out.println("Office PC: " + officePC);
    }
}
