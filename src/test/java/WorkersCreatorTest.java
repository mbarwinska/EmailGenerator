import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WorkersCreatorTest {


    @Test
    public void shouldCheckIfCreateWorkerObjectsFromRegexHaveNoNullFields() {
        //given
        WorkersCreator workersCreator = new WorkersCreator();
        String workerData = "John Smith marketing";

        //when
        Worker worker = workersCreator.createWorker(workerData);

        //then
        assertThat(worker).hasNoNullFieldsOrProperties();

    }

    @Test
    public void shouldCheckIfCreatedListOfWorkersSizeIsEqualToTheNumberOfWorkersFromFile() throws IOException {
        //given
        WorkersCreator workersCreator = new WorkersCreator();
        List<String> workersFromFile = new ArrayList<>();
        try {
             workersFromFile = WorkersReader.readWorkersFromFile();
        } catch (IOException e) {
            System.out.println("File workers.txt does not exist");
        }

        //when
        List<Worker> workers = workersCreator.createWorkersList();

        //then
        assertThat(workers.size()).isEqualTo(workersFromFile.size());
    }

}