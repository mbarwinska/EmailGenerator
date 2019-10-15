import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

class FileWriter {
    private static final String workersDataBase = "workersInfo.txt";
    private EmailGenerator emailGenerator;
    private Password password;

    void writeWorkersInfoToFile(int workerNumber) throws IOException {
        password = new Password();
        WorkersCreator workersCreator = new WorkersCreator();
        List<Worker> workerList = workersCreator.createWorkersList();
        Worker worker = workerList.get(workerNumber - 1);
        emailGenerator = new EmailGenerator();
        try (PrintWriter writer = new PrintWriter(workersDataBase)) {
            writer.println(worker.getFirstName() + " " + worker.getLastName());
            writer.println("Email: " + emailGenerator.generateEmailAddress(workerNumber));
            writer.println("Password: " + password.generatePassword());
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File workersInfo does not exist");
        }
    }
}
