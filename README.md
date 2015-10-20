# Kata-1: String Calculator

Ejercicio sencillo, sin capas ni dependencias externas, debería resolverse en, como máximo, 30 minutos.

## Antes de empezar

Realiza test solo de parámetros correctos. No es necesario que se realicen test de valores inválidos para esta kata.

## String Calculator

* Crear una calculadora que admita un String y realice cálculos:
    * Puede contener 0, 1 o 2 números (por ejemplo “” o “1” o “1,2”) separados por coma.
    * Debe devolver la suma de los números (para un String vacío, devolver 0).
* Ahora, la calculadora soporta una cantidad indeterminada de números.
* Soporta diferentes delimitadores. Para ello, el formato del String es “[delimiter]numbers”. Por ejemplo “[;]1;2” que devuelve 3.
* Si no se indica delimitador, por defecto es la coma.
* Si se pasan números negativos, lanzar excepción con el mensaje “Negativos no soportados”.
* Números mayores que 1000 deben ser ignorados, por ejemplo “2,1001” devuelve 2.
* Admite cualquier número de delimitador. Por ejemplo: “[*]1****2*****3” devuelve 6.
* Maneja múltiples delimitadores, indicados entre corchetes. Por ejemplo: “[*][;]1*2%3” que devuelve 6.
* Maneja cualquier número de múltiples delimitadores. Por ejemplo: “[*][;]1***2%%%%%%3” devuelve 6.
