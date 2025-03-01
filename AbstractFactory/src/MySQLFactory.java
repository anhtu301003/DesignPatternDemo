class MySQLFactory implements DatabaseFactory {
    public DBConnection createConnection() {
        return new MySQLConnection();
    }

    public QueryExecutor createQueryExecutor() {
        return new MySQLQueryExecutor();
    }
}