package lexical.analyzer.errors;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ErroLexico extends RuntimeException {

    private char caractereEncontrado;
    private String caracteresEsperados;
    private int linha;
    private int coluna;

    public ErroLexico(char caracterEncontrado, String caracteresEsperados, int linha, int coluna) {
        setCaractereEncontrado(caracterEncontrado);
        setCaracteresEsperados(caracteresEsperados);
        setLinha(linha);
        setColuna(coluna);
    }

    @Override
    public String toString() {
        return "caractere encontrado: " + ((char) getCaractereEncontrado()) 
                + "\n  Na linha " + linha + " coluna " + coluna
                + "\n  Era(m) esperado(s): " + getCaracteresEsperados();
    }
}
