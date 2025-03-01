class PostgreSQLFactory implements DatabaseFactory {
    public DBConnection createConnection() {
        return new PostgreSQLConnection();
    }

    public QueryExecutor createQueryExecutor() {
        return new PostgreSQLQueryExecutor();
    }
}
