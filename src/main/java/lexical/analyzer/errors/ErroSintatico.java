package lexical.analyzer.errors;

import lexical.analyzer.core.Constantes;
import lombok.Data;

@Data
public class ErroSintatico extends RuntimeException implements Constantes {

    private Constantes.Token tokenEncontrado;
    private Constantes.Token[] tokensEsperados;
    private int linha;
    private int coluna;

    public ErroSintatico(Constantes.Token _tokenEncontrado, Constantes.Token[] _tokensEsperados, int linha, int coluna) {
        setTokenEncontrado(_tokenEncontrado);
        setTokensEsperados(_tokensEsperados);
        setLinha(linha);
        setColuna(coluna);
    }

    public ErroSintatico(Constantes.Token _tokenEncontrado, Constantes.Token _tokenEsperado, int linha, int coluna) {
        setTokenEncontrado(_tokenEncontrado);        
        this.tokensEsperados = new Constantes.Token[1];
        tokensEsperados[0] = _tokenEsperado;
        setLinha(linha);
        setColuna(coluna);
    }
    
    @Override
    public String toString() {
        String listaDeTokensEsperados = "";
        for (int i = 0; i < this.tokensEsperados.length; i++) {
            listaDeTokensEsperados += this.tokensEsperados[i] + " ";
        }
        return "Token encontrado: " + this.tokenEncontrado  
                + "\n  Na linha " + linha + " coluna " + coluna
                + "\n  Era(m) esperado(s): " + listaDeTokensEsperados;
    }
}
