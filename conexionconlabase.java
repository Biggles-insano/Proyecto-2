import org.neo4j.driver.*;

public class conexionconlabase {
    public static void main(String[] args) {
        // Establecer la conexión a la base de datos
        try (Driver driver = GraphDatabase.driver("bolt://localhost:7474", AuthTokens.basic("neo4j", "pissues-windlass-rescue"))) {
            // Crear una sesión para ejecutar consultas
            try (Session session = driver.session()) {
                // Ejecutar una consulta
                StatementResult result = session.run("MATCH (a:Artista) RETURN a.nombre AS nombre");
                // Iterar sobre los resultados
                while (result.hasNext()) {
                    Record record = result.next();
                    System.out.println(record.get("nombre").asString());
                }
            }
        }
    }
}
