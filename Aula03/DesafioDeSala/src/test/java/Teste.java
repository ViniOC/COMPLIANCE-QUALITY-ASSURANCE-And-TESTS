import org.example.ClassificadoraPreco;
import org.example.Produto;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Teste {

    @Before
    public void preparaTeste(){
        System.out.println("Vou Testar");
    }

    @Test
    public void TesteComparaProdutosPoPreco(){
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("C",100));
        produtos.add(new Produto("D",300));
        produtos.add(new Produto("A",150));

        ClassificadoraPreco classificadora = new ClassificadoraPreco();

        List<Produto> produtosOrdenados = classificadora.classificaProdutosPorPreco(produtos);

        assertEquals("A", produtosOrdenados.get(0).codigo);
        assertEquals(150, produtosOrdenados.get(0).preco);

        assertEquals("C", produtosOrdenados.get(1).codigo);
        assertEquals(100, produtosOrdenados.get(1).preco);

        assertEquals("D", produtosOrdenados.get(2).codigo);
        assertEquals(300, produtosOrdenados.get(2).preco);



    }
    @After
    public void finalizaTeste(){
        System.out.println("Acabei de testar");
    }

}
