package lexical.analyzer.core;

public interface Constantes {

    enum Token {
        NUMERO, ATRIBUICAO, IDENTIFICADOR, EOF, PONTOVIRGULA, VAZIO
    };

    String DIGITOS = "0123456789",
            LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz",
            LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
            ATRIB = ":=",
            VAZIOS = " \r\n\t";
    
    char EOF = 0,
            HIFEN = '_',
            PONTOVIRGULA = ';',
            DOISPONTOS = ':',
            IGUAL = '=';
    
    String NOME_DEFAULT_ARQUIVO_ENTRADA = "entrada.oob";

}
