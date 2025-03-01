public interface DatabaseFactory {
    DBConnection createConnection();
    QueryExecutor createQueryExecutor();
}
