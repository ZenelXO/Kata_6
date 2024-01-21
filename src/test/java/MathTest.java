import kata6.MathBoard;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class MathTest {
    @Test
    public void should_return_120_given_5_factorial(){
        assertThat(new MathBoard("5", "!", "").execute()).isEqualTo("120");
    }

    @Test
    public void should_return_5040_given_7_factorial(){
        assertThat(new MathBoard("7", "!", "").execute()).isEqualTo("5040");
    }

    @Test
    public void should_return_5040_given_negative7_factorial(){
        assertThat(new MathBoard("-7", "!", "").execute()).isEqualTo("-5040");
    }

    @Test
    public void should_return_362880_given_9_factorial(){
        assertThat(new MathBoard("9", "!", "").execute()).isEqualTo("362880");
    }

    @Test
    public void should_return_4_given_2_pow_2(){
        assertThat(new MathBoard("2", "^", "2").execute()).isEqualTo("4.0");
    }

    @Test
    public void should_return_16_given_4_pow_4(){
        assertThat(new MathBoard("4", "^", "4").execute()).isEqualTo("256.0");
    }

    @Test
    public void should_return_16_given_4_pow_negative4(){
        assertThat(new MathBoard("4", "^", "-4").execute()).isEqualTo("0.00390625");
    }
}