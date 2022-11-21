package lexical.analyzer.core;

import lexical.analyzer.errors.ErroSintatico;

public class AnalisadorSintatico extends Analisador implements Constantes {

    protected MeuAnalisadorLexico leitor;

    public AnalisadorSintatico(String nomeArquivoEntrada) {
        leitor = new MeuAnalisadorLexico(nomeArquivoEntrada);
        // lê o primeiro token e o coloca no campo tokenReconhecido
        leProxToken();
    }

    public AnalisadorSintatico() {
        super();
    }

    // Executa 1 vez a máquina
    public void leProxToken() {
        leitor.s0();
    }

    // Verifica se o próximo token é t
    // Avança o ponteiro para o próximo token
    public void reconhece(Token t) {
        if (t == leitor.tokenReconhecido) {
            leProxToken();
        } else {            
            throw new ErroSintatico(leitor.tokenReconhecido, t, leitor.linha, leitor.colunaErro);
        }
    }

    // Verifica se o próximo token é t
    // Não avança o ponteiro de leitura
    public boolean proxTokenIs(Token t) {
        if (t == leitor.tokenReconhecido) {
            return true;
        } else {
            return false;
        }
    }   
}