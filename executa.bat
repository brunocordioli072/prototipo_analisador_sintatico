@echo off

if exist bin (
	echo  *** Executando projeto ***
	java -cp bin lexical.analyzer.Principal %1 %2 %3
)