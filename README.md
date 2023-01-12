# Macotas & Mascotas
Ejercicio aplicando JDBC


La empresa “Mascotas y Mascotas”, rescata animales que han sido abandonados, los
rehabilitan y cuando están totalmente sanos, los ponen a disposición para que estos sean
adoptados, se tienen las siguientes entidades:

<picture>
  <img src="https://github.com/sdtsnake/MacotasYMascotas/blob/ac49de4a696fb81d407377c9284ad0981c4a1f84/src/main/resources/img.png">
</picture>

Construya el modelo entidad relación en la base de datos de su elección (relaciones, tipos
de datos, llaves primarias y foráneas, etc…), si ud. lo considera necesario, puede adicionar
más entidades o tablas.
De acuerdo al modelo ER que Ud. acaba de transcribir, escriba las siguientes instrucciones
SQL:<br>
● Listar todas las mascotas.<br>
● Listar las mascotas que no han sido adoptadas.<br>
● Listar el número de mascotas por cada tipo de mascota.<br>
● Listar los propietarios que tengan más de una mascota.<br>
● Listar el número de mascotas por cada tipo de mascota y por cada propietario.<br>
● Listas los propietarios que no tienen mascotas.<br>
Se debe entregar este punto con un archivo sql donde se encuentre el script de la creación
de las tablas y las consultas ejecutadas
6- Con el lenguaje de su preferencia debe construir una API Rest que cumpla con lo
siguiente:<br>
Debe recibir un parámetro get<br>
Debe consultar en la base de datos con una de las consultas anteriores<br>
Debe responder en formato Json<br>

# Solucion
Para este ejercicio se usa simple JDBC con **Srping Boot** y no se resolvio un unico endpoint si no se que se solucinaron todos los casos que se plantearon
