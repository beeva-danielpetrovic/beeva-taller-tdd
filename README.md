# Kata-3: Videoclub


### Definición
En esta kata vamos a simular el funcionamiento básico de un videoclub. En este videoclub se podrá gestionar clientes, películas y, por supuesto, alquilarlas.


### Antes de empezar
Es muy importante no olvidar refactorizar en cada ciclo. En esta kata podéis comprobar los valores incorrectos que se os ocurra. Para realizarlo, hemos utilizado Spring Framework para la inyección de dependencias, pero la solución sería muy parecida utilizando cualquier framework o incluso sin utilizar ninguno. No es necesario crear parte web o API.


### Descripción
- Se podrá gestionar un cliente (alta, baja y modificación). El cliente tiene que tener, obligatoriamente, nombre y apellidos, dirección, email, usuario, password y teléfono. Se puede indicar de forma opcional la fecha de nacimiento.
- Se podrán gestionar las películas (alta, baja y modificación). Las películas tienen que tener, obligatoriamente, título y género. Además, de forma opcional, puede tener informado el director, los actores, el año de estreno y la edad recomendada.
- Se pueden obtener todas las películas. También se puede buscar una película por su título, director, género, actor, año de estreno o edad recomendada.
- Se puede alquilar una película. Para alquilarla, el usuario tiene que tener un mínimo de saldo, correspondiente al precio de un día de alquiler (por ejemplo, 1 euro). Si no tiene suficiente saldo, no permite alquilar. Si tiene suficiente saldo, la película es alquilada.
- Se puede devolver una película. Se comprueba la fecha de recogida con la de entrega, y si está dentro de las 24 horas permitidas, se cobra 1 euros del precio de alquiler. Si se supera, se cobra 1 euros por cada día superado. Si no tuviera suficiente saldo, se muestra mensaje para que recargue la tarjeta.
- Se puede recargar la tarjeta, introduciento una cantidad de dinero. Solo se permiten billetes.
- Si se intenta alquilar una película ya alquilada, se informa de la hora aproximada de entrega (correspondiente a la hora máxima que tiene el cliente para entregarla).
- Se puede obtener una relación de las películas alquiladas en el momento por el cliente.
- Se puede obtener un histórico de las películas alquiladas por el cliente (1 mes, 6 meses, 1 año)
- Se puede obtener el número de alquileres de una película. Se puede realizar un top 10 de películas alquiladas.

### Vídeo
*Pendiente de grabación*
