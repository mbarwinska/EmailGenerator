import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WorkersCreator {


    Worker createWorker(String workerData) {
        Worker worker = null;
        String workerRegex = "^([A-Z][a-z]+)\\s+([A-Z][a-z]+)\\s+([a-z]+)";
        Pattern pattern = Pattern.compile(workerRegex);
        Matcher matcher = pattern.matcher(workerData);
        if (matcher.find()) {
             worker = new Worker(matcher.group(1),matcher.group(2),matcher.group(3));
        }
        return worker;
    }

    List<Worker> createWorkersList() throws IOException {
        List<String> workersFromFile = WorkersReader.readWorkersFromFile();
        List<Worker> workerList = new ArrayList<>();
        Worker worker;
        for (int i = 0; i < workersFromFile.size(); i++) {
            worker = createWorker(workersFromFile.get(i));
            workerList.add(worker);

        }
        return workerList;
    }
}
