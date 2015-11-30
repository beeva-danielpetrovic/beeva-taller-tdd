# Kata-3: Bowling


### Definición
Esta Kata se basa en reproducir una partida de bolos de un único jugador.


### Antes de empezar
Es muy importante no olvidar refactorizar en cada ciclo. En esta kata podéis comprobar los valores incorrectos que se os ocurra. Si queréis, podéis añadir más complejidad creando diferentes jugadores, por ejemplo. En este caso, solo se tiene en cuenta un jugador para no alargar demasiado la kata.


### Descripción
- Una partida se compone de 10 rondas. Iniciamos la partida en la ronda 1.
- En las nueve primeras rondas, el jugador puede lanzar como máximo dos veces por ronda, excepto si en el primer lanzamiento tira todos los bolos. En este caso, no tendrá un segundo tiro, excepto en la última ronda.
- Si no consigue tirar todos los bolos en los dos lanzamientos, se suman el número de bolos que ha tirado a su puntuación total.
- Si en el primer lanzamiento no consigue tirar todos los bolos y en el segundo lanzamiento lo consigue, hace un "semipleno (spare)" y la puntuación es 10 + el número de bolos que tire en el primer lanzamiento de su siguiente ronda. Por ejemplo, si hace un semipleno y en la siguiente ronda, en el primer lanzamiento, tira 6 bolos, el semipleno tendrá un valor de 16 puntos.
- Si en el primer lanzamiento consigue tirar todos los bolos, se llama "pleno (strike)". La ronda finaliza y la puntuación será 10 + los puntos que consiga en total en la siguiente ronda. Por ejemplo, si en la siguiente ronda tira, en el primer lanzamiento, 4 y en el segundo lanzamiento 3, el valor total del pleno será 17.
- Si consigue un pleno o semipleno en la última ronda, tiene un lanzamiento extra en esa misma ronda.
- Al finalizar las 10 rondas, se debe mostrar un mensaje con la puntuación por cada ronda, donde 'X' es pleno y '/' es semipleno. Por ejemplo: "Ronda 1 -> |4|/| ··· Ronda 2 -> |X|-| ··· Ronda 3 -> |4|0|"


### Vídeo
*Pendiente de grabación*
