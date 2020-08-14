package works.weave.socks.orders.config;

import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;

@Component
public class MongoDBManager {

    @Autowired
    Mongo mongo;

    @PreDestroy
    public void shutdown() {
        mongo.close();
    }
}
