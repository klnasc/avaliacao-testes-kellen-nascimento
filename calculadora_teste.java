import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calculadora_teste {

    calculadora calc = new calculadora();

    @Test
    void soma() {
        assertEquals(10, calc.soma(5, 5));
    }

    @Test
    void divisao() {
        assertEquals(5, calc.divisao(10, 2));
    }

    @Test
    void testeDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divisao(10, 0);
        });
    }
}
