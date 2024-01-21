import kata6.Math;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class MathTest {
    @Test
    public void should_return_120_given_5_factorial(){
        assertThat(new Math("5", "!", "").execute()).isEqualTo("120");
    }

    @Test
    public void should_return_5040_given_7_factorial(){
        assertThat(new Math("7", "!", "").execute()).isEqualTo("5040");
    }

    @Test
    public void should_return_362880_given_9_factorial(){
        assertThat(new Math("9", "!", "").execute()).isEqualTo("362880");
    }

    @Test
    public void should_return_4_given_2_pow_2(){
        assertThat(new Math("2", "^", "2").execute()).isEqualTo("4");
    }
}