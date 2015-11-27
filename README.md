# Kata-3: Bowling


### Definición
Esta Kata se basa en reproducir una partida de bolos.


### Antes de empezar
Es muy importante no olvidar refactorizar en cada ciclo. En esta kata podéis comprobar los valores incorrectos que se os ocurra. Si queréis, podéis añadir más complejidad creando diferentes jugadores. En este caso, solo se tiene en cuenta un jugador para no alargar demasiado la kata.


### Descripción
- Una partida se compone de 10 turnos.
- En cada turno, el jugador puede lanzar dos veces.
- Si en el segundo tiro el jugador no consigue tirar todos los bolos, se suman el número de bolos que ha tirado a su puntuación total.
- Si en el segundo tiro el jugador consigue tirar todos los bolos, hace un "semipleno (spare)" y la puntuación es 10 + el número de bolos que tire en el primer lanzamiento de su siguiente turno. Por ejemplo, si hace un semipleno y en el siguiente turno, en el primer lanzamiento tira 6 bolos, el semipleno tendrá un valor de 16 puntos.
- Si en el primer tiro consigue tirar todos los bolos, se llama "pleno (strike)". El turno finaliza y la puntuación será 10 + los puntos que consiga en total en el siguiente turno. Por ejemplo, si en el siguiente turno tira, en el primer lanzamiento, 4 y en el segundo lanzamiento 4, el valor total del pleno será 18.
- Si consigue un pleno o semipleno en el último turno, tiene un lanzamiento extra en ese mismo turno.
- Al finalizar las 10 rondas, se debe mostrar un mensaje con la puntuación por cada ronda, donde 'X' es pleno y '/' es semipleno. Por ejemplo: "Ronda 1 -> |4|/| --- Ronda 2 -> |X| --- Ronda 3 -> |4|0|"...


### Vídeo
*Pendiente de grabación*
