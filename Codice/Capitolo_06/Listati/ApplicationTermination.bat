@echo off 

java LibroJava.Capitolo6.ApplicationTermination 

@if %ERRORLEVEL% == 0 CALL :OK
@if %ERRORLEVEL% == 119 CALL :ERROR
goto END

:ERROR 
	 echo ERRORE - Valore troppo grande o troppo piccolo per un byte [range: 0 - 255]
	 EXIT /B
:OK 
	 echo OK - Conversione valida
	 EXIT /B
:END
 	 echo CODICE TERMINAZIONE [%ERRORLEVEL%]