import org.junit.Test;
import processos.Calculo;

import static org.junit.Assert.assertEquals;

public class CalculoTest {
@Test
    public void testSoma6E29() {
    Calculo calculo = new Calculo();
    float Resultado = calculo.ExecutaCalculo(6, 29);

    assertEquals(35, Resultado, 0.0);

}



}
