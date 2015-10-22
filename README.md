# Kata-1: String Calculator

Ejercicio sencillo, sin capas ni dependencias externas, debería resolverse en, como máximo, 30 minutos.

## Antes de empezar

Realiza test solo de parámetros correctos. No es necesario que se realicen test de valores inválidos para esta kata.

## String Calculator

* Crear una calculadora que admita un String y realice cálculos:
    * Puede contener 1 o 2 números (por ejemplo `“1”` o `“1,2”`) separados por coma. Devuelve la suma de los números.
    * Si la cadena está vacía, devuelve 0.
* Ahora, la calculadora soporta una cantidad indeterminada de números.
* Soporta diferentes delimitadores. Para ello, el formato del String es `“[delimiter]numbers”`. Por ejemplo `“[;]1;2”` que devuelve 3.
* Si se pasan números negativos, lanzar excepción con el mensaje “Negativos no soportados”.
