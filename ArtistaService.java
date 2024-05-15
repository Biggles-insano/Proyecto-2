import org.neo4j.driver.Driver;

public class ArtistaService {
    private final Neo4jConnector neo4jConnector;

    public ArtistaService(Neo4jConnector neo4jConnector) {
        this.neo4jConnector = neo4jConnector;
    }

    public void recomendarArtistas(String nombreArtista) {
        // Lógica de recomendación
    }
}
