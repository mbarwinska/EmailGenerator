import org.junit.Test;

import org.junit.Assert.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EmailGeneratorTest {

    @Test
    public void shouldCheckIfGeneratedEmailIsNotNull() {
        //given
        EmailGenerator emailGenerator = new EmailGenerator();

        //when
        String emailAddressForWorker1 = emailGenerator.generateEmailAddress(1);

        //then
        assertThat(emailAddressForWorker1).isNotNull();

    }

    @Test
    public void shouldCheckIfGeneratedEmailHasProperSyntax() {

        //given
        EmailGenerator emailGenerator = new EmailGenerator();
        String expectedEmailSyntax = "smith@marketing.herocompany.com";

        //when
        String emailAddressForWorker1 = emailGenerator.generateEmailAddress(1);

        //then
        assertThat(emailAddressForWorker1).isEqualTo(expectedEmailSyntax);
    }

}