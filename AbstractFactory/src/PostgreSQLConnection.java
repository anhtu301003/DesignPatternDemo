public class PostgreSQLConnection implements DBConnection{
    @Override
    public void connect() {
        System.out.print("\033[31m");
        System.out.println("Connecting to PostgreSQL...");
        System.out.print("\033[0m");
    }
}
