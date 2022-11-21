# Protótipo de um lexical.analyzer.core.Analisador Sintático

## **Resumo**
Este programa realiza a análise sintática dos programas escritos na linguagem oob. 
Realiza a identificação de:
 - numeros inteiros,
 - atribuicao,
 - identificadores,
 - ponto e virgula.

## **Arquivos oob**
É disponibilizado dois arquivos, um lexicamente correto (`programa.oob`) e o outro com erro (`programa_erro.oob`).

## **Arquivos lote**
Os arquivos lotes(.bat) tem a seguinte função:
- `compila.bat` - Realiza a compilação do código fonte do compilar da linguagem oob.
- `empacota.bat` - Realiza o empacotamento(jar) do compilar da linguagem oob.
- `limpa.bat` - Apaga os diretórios jar e bin do compilar da linguagem oob.
- `executa.bat`- Realiza a execução do compilador da linguagem oob. Necesário especifica o nome do arquivo a ser analisado.
- `documenta.bat`- Realiza a documentação do código fonte.

## ** Exemplo compilação da linguagem oob**
- Abra o terminal e execute no diretório do projeto `compila.bat programa.oob`.

## **Requisitos** 
- JDK 1.8 
- Windows