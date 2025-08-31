
import java.util.Queue;
import java.util.LinkedList;

public class DBConnectObjectPool {
    private final Queue<DBConnect> pool;
    private final int maxSize;
    
    public DBConnectObjectPool(int size) {
        this.maxSize = size;
        this.pool = new LinkedList<>();
    }

    public synchronized DBConnnect getConnection() {
        if (pool.isEmpty()) {
            if (DBConnect.dbConnectionCount < maxSize) {
                return new DBConnect();
            }
            throw new RuntimeException("Error: Maximum pool size reached. There are no DB connections available.");
        }
        return pool.poll();
    }

    public synchronized void releaseConnection(DBConnect dbConnection) {
        if (pool.size() < maxSize) {
            pool.offer(dbConnection);
            System.out.println("Splash: Connection object returned to the pool.");
        } else {
            dbConnection.dbConnectionClose();
        }
    }
}