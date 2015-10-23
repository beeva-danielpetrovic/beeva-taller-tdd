# Kata-3: Darts 501


### Definición
Esta Kata se basa en reproducir el juego 501 de dardos.


### Antes de empezar
Es muy importante no olvidar refactorizar en cada ciclo. 
Tenéis disponible el [esqueleto](https://github.com/beeva-danielpetrovic/beeva-taller-tdd/tree/master) con todas las dependencias necesarias.


### Descripción
- Al iniciarse el juego:
  - Ambos jugadores tienen una puntuación de partida de 501.
  - La diana consta de:
    - Zona vacía.
    - El centro rojo.
    - El centro verde.
    - 20 triángulos (cada uno representa un número)
      - Zona simple.
      - Zona doble
      - Zona triple.
  - Se sortea qué jugador empieza el juego
  
- En cada ronda:
  - El jugador lanza tres dardos que pueden:
    - Ir fuera de la diana (no puntúa)
    - Dar en uno de los 20 triángulos
      - En zona simple, puntúa el número en sí.
      - En zona doble, el doble del número.
      - En zona triple, el triple del número.
    - Dar en el centro verde (25 puntos)
    - Dar en el centro rojo (50 puntos).
  - Se resta la puntuación obtenida del resto del total acumulado
- Para cerrar la partida:
  - Para ganar la partida, uno de los jugadores debe llegar a 0.
  - El jugador debe puntuar en su último acumulado mediante doble o triple. (Ejemplo: si le quedan 11 puntos, debería puntuar 1 simple y 5 doble).
  - En el caso se pase de la puntuación del resto del acumulado se queda con el acumulado que tenía antes del lanzamiento (por ejemplo, en el primer lanzamiento puntúa 1, le quedan 10 puntos, y en el segundo lanzamiento puntua 20, su acumulado es de 10).
  - En el caso que el acumulado después de la ronda sea 1, se volvería al acumulado previo al inicio de su ronda.


### Vídeo
*Pendiente de grabación*
