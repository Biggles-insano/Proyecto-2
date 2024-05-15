import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su artista favorito:");
        String nombreArtista = scanner.nextLine();

        Neo4jConnector neo4jConnector = new Neo4jConnector();
        ArtistaService artistaService = new ArtistaService(neo4jConnector);
        artistaService.recomendarArtistas(nombreArtista);

        scanner.close();
    }
}
