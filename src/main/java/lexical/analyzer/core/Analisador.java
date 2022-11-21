package lexical.analyzer.core;

public abstract class Analisador implements Constantes {

    private String nomeArquivoEntrada;

    public Analisador() {
        setNomeArquivoEntrada(NOME_DEFAULT_ARQUIVO_ENTRADA);
    }
    
    public Analisador(String nomeArquivoEntrada) {
        setNomeArquivoEntrada(nomeArquivoEntrada);
    }
    

    public void setNomeArquivoEntrada(String nomeArquivoEntrada) {
        this.nomeArquivoEntrada = nomeArquivoEntrada;
    }

    public String getNomeArquivoEntrada() {
        return nomeArquivoEntrada;
    }
}
