
import java.util.Queue;

public class DBConnectObjectPool {
    private final Queue<DBConnect> pool;
    private final int maxSize;
    
    public DBConnectObjectPool(Queue<DBConnect> pool, int maxSize) {
        this.pool = pool;
        this.maxSize = maxSize;
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
}