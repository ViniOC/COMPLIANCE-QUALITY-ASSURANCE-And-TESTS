import org.example.Calculadora;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteJava {
    @Test
    public void testeSoma(){
        Calculadora calc = new Calculadora();

        double resultado = calc.soma(2.0, 3.0);

        assertEquals(5.0, resultado, 0.0);
    }

    @Test
    public void testeSub(){
        Calculadora calc = new Calculadora();
        double resultado = calc.subtrair(3.0, 2.0);
        assertEquals(1.0, resultado, 0.0);

    }

    @Test
    public void testeMult(){
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(2.0, 3.0);
        assertEquals(6.0, resultado, 0.0);
    }

    @Test
    public void testeDiv(){
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(5.0, 10.0);
        assertEquals(2.0, resultado, 0.0);

    }
}
