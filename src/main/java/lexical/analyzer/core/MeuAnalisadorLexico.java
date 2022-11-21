package lexical.analyzer.core;

import lexical.analyzer.errors.ErroLexico;

public class MeuAnalisadorLexico extends AnalisadorLexico {

    public MeuAnalisadorLexico(String nomeArquivoEntrada) {
        super(nomeArquivoEntrada);
    }

    public void s0() {
        if (this.proxCaractereIs(DIGITOS)) {
            leProxCaractere();
            s1();
        } else if (this.proxCaractere == DOISPONTOS) {
            leProxCaractere();
            s2();
        } else if (this.proxCaractereIs(LETRAS_MINUSCULAS + LETRAS_MAIUSCULAS)) {
            leProxCaractere();
            s4();
        } else if (this.proxCaractere == PONTOVIRGULA) {
            leProxCaractere();
            s5();
        } else if (this.proxCaractere == EOF) {
            leProxCaractere();
            s6();
        } else if (this.proxCaractereIs(VAZIOS)) {
            leProxCaractere();
            s0();
        } else {            
            throw new ErroLexico(this.proxCaractere, DIGITOS + LETRAS_MINUSCULAS + LETRAS_MAIUSCULAS + VAZIOS + PONTOVIRGULA + HIFEN, linha, colunaErro);
        }
    }
    
    public void s1() {
        this.tokenReconhecido = Token.NUMERO;
        if (this.proxCaractereIs(DIGITOS)) {
            leProxCaractere();
            s1();
        }
    }

    public void s2() {
        if (this.proxCaractere == IGUAL) {
            leProxCaractere();
            s3();
        } else {
            throw new ErroLexico(this.proxCaractere, LETRAS_MINUSCULAS + IGUAL, linha, colunaErro);
        }
    }

    public void s3() {
        this.tokenReconhecido = Token.ATRIBUICAO;
    }

    public void s4() {
        this.tokenReconhecido = Token.IDENTIFICADOR;
        if (this.proxCaractereIs(LETRAS_MINUSCULAS + LETRAS_MAIUSCULAS + DIGITOS + HIFEN)) {
            leProxCaractere();
            s4();
        }
    }

    public void s5() {
        this.tokenReconhecido = Token.PONTOVIRGULA;
    }

    public void s6() {
        this.tokenReconhecido = Token.EOF;
    }
}
