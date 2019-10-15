import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WorkersReader {
    private static List<String> workers;

    private static final String workersData = "workers.txt";

    static List<String> readWorkersFromFile() throws IOException {
        workers = Files.readAllLines(Paths.get(workersData));
        return Files.readAllLines(Paths.get(workersData));
    }
}
