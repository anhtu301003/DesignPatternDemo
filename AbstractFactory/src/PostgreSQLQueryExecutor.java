public class PostgreSQLQueryExecutor implements QueryExecutor {
    public void executeQuery() {
        System.out.print("\033[31m");
        System.out.println("Query executed successfully PostgreSQL");
        System.out.print("\033[0m");
    }
}