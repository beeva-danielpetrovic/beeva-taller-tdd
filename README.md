# Kata-3: Bowling


### Definición
Esta Kata se basa en reproducir una partida de bolos.


### Antes de empezar
Es muy importante no olvidar refactorizar en cada ciclo. En esta kata podéis comprobar los valores incorrectos que se os ocurra.


### Descripción
- De 1 a 5 jugadores. Cada jugador tiene un nombre y una abreviatura de 3 caracteres para mostrar en pantalla.
- Una partida se compone de 10 turnos.
- En cada turno, el jugador puede lanzar dos veces.
- Si en el segundo tiro el jugador no consigue tirar todos los bolos, se suman el número de bolos que ha tirado a su puntuación total.
- Si en el segundo tiro el jugador consigue tirar todos los bolos, hace un "semipleno (spare)" y la puntuación es 10 + el número de bolos que tire en el primer lanzamiento de su siguiente turno. Por ejemplo, si hace un semipleno y en el siguiente turno, en el primer lanzamiento tira 6 bolos, el semipleno tendrá un valor de 16 puntos.
- Si en el primer tiro consigue tirar todos los bolos, se llama "pleno (strike)". El turno finaliza y la puntuación será 10 + los puntos que consiga en total en el siguiente turno. Por ejemplo, si en el siguiente turno tira, en el primer lanzamiento, 4 y en el segundo lanzamiento 4, el valor total del pleno será 18.
- Si consigue un pleno o semipleno en el último turno, tiene un lanzamiento extra en ese mismo turno.
- Gana quién más puntos tenga.
- Se debe poder ver las puntuaciones por tirada, donde "X" es pleno, "/" es semipleno y "-" es fallo (no tira ningún bolo).
- Al finalizar la partida, se puede volver a empezar la partida con los mismos jugadores.


### Vídeo
*Pendiente de grabación*
