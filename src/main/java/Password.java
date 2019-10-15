import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Password {
    private List<Character> signsForPassword = new ArrayList<>();
    private String userPassword;

    Password() {
        createListOfCharacters();
    }


    private void createListOfCharacters() {
        char numericValueOfFirstChar = 33;
        char numericValueOfLastChar = 123;
        for (char i = numericValueOfFirstChar; i < numericValueOfLastChar; i++) {
            signsForPassword.add(i);
        }
    }

    String generatePassword() {
        Random random = new Random();
        String sign1 = signsForPassword.get(random.nextInt(signsForPassword.size())).toString();
        String sign2 = signsForPassword.get(random.nextInt(signsForPassword.size())).toString();
        String sign3 = signsForPassword.get(random.nextInt(signsForPassword.size())).toString();
        String sign4 = signsForPassword.get(random.nextInt(signsForPassword.size())).toString();
        String sign5 = signsForPassword.get(random.nextInt(signsForPassword.size())).toString();
        String sign6 = signsForPassword.get(random.nextInt(signsForPassword.size())).toString();
        String sign7 = signsForPassword.get(random.nextInt(signsForPassword.size())).toString();
        this.userPassword = sign1 + sign2 + sign3 + sign4 + sign5 + sign6 + sign7;
        return userPassword;
    }

    void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    String getUserPassword() {
        return userPassword;
    }
}

