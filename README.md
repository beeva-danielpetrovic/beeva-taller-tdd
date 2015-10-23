# Kata-1: String Calculator

Ejercicio sencillo, sin capas ni dependencias externas.

## Antes de empezar

Realiza test solo de parámetros correctos. No es necesario que se realicen test de valores inválidos para esta kata.
Existe un [esqueleto](https://github.com/beeva-danielpetrovic/beeva-taller-tdd/tree/master) con todas las dependencias necesarias para realizar esta Kata.

## String Calculator

* Crear una calculadora que admita un String y realice una suma:
    * Puede contener 1 o 2 números (por ejemplo `“1”` o `“1,2”`) separados por coma. Devuelve la suma de los números.
    * Si la cadena está vacía, devuelve 0.
* Ahora, la calculadora soporta una cantidad indeterminada de números (por ejemplo `"1,5,1,2,5"` devolvería 14)
* Soporta diferentes delimitadores. Para ello, el formato del String es `“[delimiter]numbers”`(por ejemplo `“[;]1;2”` devolvería 3)
* Si se pasan números negativos, lanzar excepción con el mensaje “Negativos no soportados” (por ejemplo `"[;]1;4;-1;3"`)
