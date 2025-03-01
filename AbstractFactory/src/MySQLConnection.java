public class MySQLConnection implements DBConnection{
    @Override
    public void connect() {
        System.out.print("\033[33m");
        System.out.println("Connecting to MySQL...");
        System.out.print("\033[0m");
    }
}
