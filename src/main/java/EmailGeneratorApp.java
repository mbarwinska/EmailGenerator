import java.io.IOException;

public class EmailGeneratorApp {
    public static void main(String[] args) {

        EmailGenerator emailGenerator = new EmailGenerator();

        FileWriter fileWriter = new FileWriter();
        try {
            fileWriter.writeWorkersInfoToFile(1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
