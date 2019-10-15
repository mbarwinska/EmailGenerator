import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


public class PasswordTest {
    private Password password;

    @Before
    public void setup() {
        password = new Password();
    }

    @Test
    public void shouldCheckIfGeneratedPasswordIsNotNull() {

        //when
        String generatedPassword = password.generatePassword();

        //then
        assertThat(generatedPassword).isNotNull();

    }

    @Test
    public void shouldCheckIfLengthOfPasswordIsEqualTo7() {
        //given
        int desiredPasswordLength = 7;

        //when
        String generatedPassword = password.generatePassword();

        //then
        assertThat(generatedPassword.length()).isEqualTo(desiredPasswordLength);
    }

    @Test
    public void shouldSetNewPasswordInsertByUserWhichIsNotEqualToGeneratedPassword() {

        //given
        password.generatePassword();
        String currentUserPassword = password.getUserPassword();

        //when
        password.setUserPassword("Sambal666");
        String newPasswordFromUser = password.getUserPassword();

        //then
        assertThat(currentUserPassword).isNotEqualTo(newPasswordFromUser);
    }
}