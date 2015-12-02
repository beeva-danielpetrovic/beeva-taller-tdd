# Kata-3: Videoclub


### Definición
En esta kata vamos a simular el funcionamiento básico de un videoclub. En este videoclub se podrá gestionar clientes, películas y, por supuesto, alquilarlas.


### Antes de empezar
Es muy importante no olvidar refactorizar en cada ciclo. En esta kata podéis comprobar los valores incorrectos que se os ocurra. No es necesario crear parte web o servicios, ya que se verá en la siguiente Kata. Con esta kata se intenta mostrar cómo trabajar con diferentes capas (en nuestro caso, servicio y acceso a datos).


### Descripción
- Se pueden obtener todas las películas. También se puede buscar una película por su título.
- Se puede alquilar una película. Para alquilarla, el cliente tiene que tener un mínimo de saldo, correspondiente al precio de un día de alquiler (por ejemplo, 1 euro). Si no tiene suficiente saldo, no permite alquilar. Si tiene suficiente saldo, la película es alquilada.
- Se puede devolver una película. Se comprueba la fecha de recogida con la de entrega, y si está dentro de las 24 horas permitidas, se cobra 1 euros del precio de alquiler. Si se supera, se cobra 1 euros por cada día superado. Si no tuviera suficiente saldo, se muestra mensaje para que recargue la tarjeta.
- Se puede recargar la tarjeta, introduciento una cantidad de dinero. Solo se permiten billetes.
- Si se intenta alquilar una película ya alquilada, se informa que ya ha sido alquilada.

### Vídeo
*Pendiente de grabación*
