public class Application {
    private DBConnection connection;
    private QueryExecutor queryExecutor;

    public Application(DatabaseFactory factory) {
        this.connection = factory.createConnection();
        this.queryExecutor = factory.createQueryExecutor();
    }

    public void run() {
        connection.connect();
        queryExecutor.executeQuery();
    }
}
