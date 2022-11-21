package lexical.analyzer.core;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

public class AnalisadorLexico extends Analisador {

    protected char proxCaractere; // caractere disponível no cabeçote de leitura
    protected int linha = 1; // linha atual do arquivo fonte
    protected StringBuffer entrada = new StringBuffer(); // armazena o conteúdo do arquivo
    protected int posicaoLeitura = 0; // posição do caractere a ser lido na entrada
    protected int colunaErro = 0; // posição do caractere a ser lido na entrada com erro
    protected Token tokenReconhecido; // último token lido	

    public AnalisadorLexico(String nomeArquivoEntrada) {
        super(nomeArquivoEntrada);
        try {
            FileInputStream file = new FileInputStream(new File(nomeArquivoEntrada));
            int c;
            while ((c = file.read()) != -1) {
                this.entrada.append((char) c);
            }
            file.close();
            leProxCaractere();
        } catch (IOException e) {
            throw new RuntimeException("Erro de leitura no arquivo " + nomeArquivoEntrada);
        }
    }      

    // lê o próximo caractere do buffer. Se fim, retorna EOF
    // avança o ponteiro de leitura 1 posição
    public void leProxCaractere() {
        try {
            this.proxCaractere = this.entrada.charAt(this.posicaoLeitura++);
            colunaErro++;
            if (this.proxCaractere == '\n'){
                linha++;
                colunaErro = 0;
            }
        } catch (IndexOutOfBoundsException e) {
            this.proxCaractere = EOF;
        }
    }

    // verifica se o próximo caractere é um dos que estão em 's'
    // NãO avança o ponteiro de leitura
    public boolean proxCaractereIs(String s) {
        if (s.indexOf(this.proxCaractere) != -1) {
            return true;
        } else {
            return false;
        }
    }
}
