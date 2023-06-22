cd C:/Pedmisan
g++ -o Ejecutable Implementacion.cpp
gcc -S Implementacion.cpp
ren Implementacion.S Ensamblador.S
title Ejecucion del Programa
cls
Ejecutable.exe
DEL /F /A Ejecutable.exe
DEL /F /A Implementacion.S
exit
