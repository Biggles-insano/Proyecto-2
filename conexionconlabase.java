import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;

public class conexionconlabase {
    private final Driver driver;

    public Neo4jConnector() {
        this.driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "issues-windlass-rescue"));
    }

    public Driver getDriver() {
        return driver;
    }
}
