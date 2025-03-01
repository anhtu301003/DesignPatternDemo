// MySQL Query Executor
public class MySQLQueryExecutor implements QueryExecutor {
    @Override
    public void executeQuery() {
        System.out.print("\033[33m");
        System.out.println("Query executed successfully Mysql");
        System.out.print("\033[0m");
    }
}