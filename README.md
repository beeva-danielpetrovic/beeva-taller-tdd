# Kata-2: Tres en Raya


### Definición
Esta Kata se basa en reproducir el famoso juego de Tres en Raya (en inglés, Tic Tac Toe). No utiliza dependencias externas.


### Antes de empezar
Es muy importante no olvidar refactorizar en cada ciclo. 


### Descripción
- Al iniciarse el juego:
  - El tablero tiene 3x3 casillas.
  - El tablero está vacío.
  - El jugador 1 juega con X y el jugador 2 con O.
  - Es turno del jugador 1
- El jugador pone su marca en la casilla que elija.
  - Si la casilla no está dentro del tablero, se muestra un mensaje de error.
  - Si la casilla ya está ocupada, se muestra un mensaje informativo.
  - Una vez puesta la marca, es turno del otro jugador.
- Al finalizar el juego, mostrar mensaje informativo. El juego finaliza si:
  - Si se consigue 3 casillas iguales en horizontal, mostrar “El jugador .. GANA”.
  - Si se consigue 3 casillas iguales en vertical, mostrar “El jugador .. GANA”.
  - Si se consigue 3 casillas iguales en diagonal, mostrar “El jugador .. GANA”.
  - Si se han ocupado todas las casillas y no se cumple ninguno de los anteriores puntos, se considera empate y muestra “Ha sido un EMPATE”.
  - Al darse cualquiera de los puntos anteriores, el juego finaliza y no debe dejar poner otra ficha hasta que se inicialice de nuevo el juego, mostrando un mensaje tipo: "El juego ha finalizado. Si quiere volver a jugar, inicie de nuevo el juego"


### Vídeo
*Pendiente de grabación*
