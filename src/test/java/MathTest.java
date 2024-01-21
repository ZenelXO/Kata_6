import kata6.Math;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class MathTest {
    @Test
    public void should_return_120_given_5_factorial(){
        assertThat(new Math("5", "!").execute()).isEqualTo("120");
    }
}