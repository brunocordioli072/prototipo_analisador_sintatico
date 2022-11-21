package lexical.analyzer;

import lexical.analyzer.core.MeuAnalisadorSintatico;
import lexical.analyzer.errors.ErroLexico;
import lexical.analyzer.errors.ErroSintatico;

public class Principal {

    public static void main(String[] args) {
        MeuAnalisadorSintatico leitor;
        try {
            if (args.length != 1) {
                throw new RuntimeException("esqueceu de escrever o nome do arquivo de entrada!");
            }
            leitor = new MeuAnalisadorSintatico(args[0]);
            leitor.inicio();
            System.out.println("Analise Sintatica realizada com sucesso no arquivo " + leitor.getNomeArquivoEntrada());

        } catch (ErroLexico e) {
            System.out.println("Erro lexico: " + e.toString());
        } catch (ErroSintatico e) {
            System.out.println("Erro sintatico: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
