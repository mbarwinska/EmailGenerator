
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class EmailGenerator {
    private WorkersCreator workersCreator;
    private String companySuffix = "herocompany.com";
    private String at = "@";

    String generateEmailAddress(int numberOfWorker) {
        workersCreator = new WorkersCreator();
        List<Worker> workers = new ArrayList<>();
        try {
            workers = workersCreator.createWorkersList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Worker worker = workers.get(numberOfWorker - 1);
        return worker.getLastName().toLowerCase() + at + worker.getDepartment() + "." + companySuffix;

    }

    void showInfo(String emailAddress) {
        Password password = new Password();
        System.out.println("Worker email: " + emailAddress);
        System.out.print("Password to account: ");
        System.out.println(password.generatePassword());
    }
}
