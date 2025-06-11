# Taller unidad 2 
Enunciado.  

1. Crear un programa que almacene clasifique animales como terrestres, aéreos, acuáticos, luego muestre los animales de cada categoría o clasificación correcta.  

Pasos sugerencia:  

a. Crea una clase Animal con los atributos nombre, tipo (terrestre, aéreo, acuatico), genero (masculino, femenino) (crea un constructor que settee o asigne todos los atributos y crea los getteres y setteres)  
b. Crea una clase Principal o de pruebas con un atributo de tipo Map<String, List<Animal>> llamado clasificación e instancia un TreeMap o HasMap y un atributo de lista de animales (puedes usar ArrayList como instancia) llamado “animales”.  
c. Llena la lista de animales solicitado por consola y clasifica como: terrestre, aéreo o acuático a medidas que vayas digitando.  
d. Almacena en el map la clase y muestra luego los animales.  
e. El resultado debe ser algo como lo que sigue:  



```bash
Terrestres:  
          Oso  
          Perro  
Acuáticos:  
          Ballena  
          Tiburon  
Aéreos:  
          Paloma  
          Buitre  

```

Nota: En el mapa guardan, por ejemplo:  
Map<Terrestres, [Oso, Perro, …]>  

2. Crea una clase Persona con los atributos: nombre, apellido, edad, genero, sueldoHora, cargo (crea sus métodos getteres y setteres). Crea una clase Principal (cualquier nombre) y mediante consola, o gráficamente, te permita almacenar personas en Collecciones (Set o List). Una vez ingreses los datos deseados, usando lambdas:

a. Calcule la cantidad de personas que hay almacenadas  
b. Calcule el promedio edades de personas (average)  
c. Muestre la cantidad de personas mayores de edad  
d. Muestre las personas cuyos nombres empiecen con “A” (usa startWith de String) 
e. Muestre las personas cuyos apellidos contengan (contains de String) la letra “M”  

Nota: Recuerda convertir la lista en un stream. Y puedes usar operaciones como filter, map, count, etc.  

3. Con la misma clase Persona creada en el ejercicio 2. Realice las siguientes operaciones con lambdas.  

a. Usa los métodos intermedios map y filter y terminal forEach para mostrar el sueldo de 8 horas de cada persona con cargo de director de género masculino (M).
Debe mostrar algo como:  

Sueldo por 8 horas: $45000000  

Extra: Puede mejorarlo con peek para mostrar algo como:  
Nombre: Fuancho Morales Sueldo por 8 horas: $45000000  
b. Usando findFirst, filter, muestra la primera persona que sea “desarrollador” y sea de género femenino.  
c. Muestre la persona con cargo de desarrollador que más gana por hora. Crea un atributo llamado masGana de tiempo Optional luego convierte la lista en un stream, usa filter como operación intermedia y max como función terminal, luego crea un condicional que evalue masGana.isPresent() y en caso tal de ser true, imprima los datos de esa persona  
Nota: lee sobre la clase Optional para recordar sus características.  
d. Usa sorted para mostrar todas las mujeres ordenadas por su nombre. Usa dentro de sorted Comparator con el método comparing.  

## Salida en consola ejercicio 1
```bash
---------------------------------------------
     🐾 CLASIFICACIÓN DE ANIMALES 🐾
---------------------------------------------

acuatico
  - pez
terrestre
  - perro
  - Gato
aereo
  - pajaro
============================================================
```
## Salida en consola ejercicio 2

```Lista de personas registradas:
kevin argumedo, Edad: 26, Género: masculino, Sueldo/Hora: $90, Cargo: Director
Astrid hernandez, Edad: 25, Género: femenino, Sueldo/Hora: $90, Cargo: desarrollador
daniela ortiz, Edad: 23, Género: femenino, Sueldo/Hora: $30, Cargo: auxiliar
====================================

Total de personas registradas: 3
====================================
La edad promedio es: 24,67
====================================
Numero de mayores de edad: 3
====================================
Personas cuyos nombres empiecen con “A”:
Astrid hernandez
====================================
Personas cuyos apellidos contengan “M”:
kevin argumedo
====================================
Personas con cargo de director de género masculino (M)
Nombre: kevin argumedo | Sueldo por 8 horas :$ 720
====================================
Primera persona desarrolladora de género femenino:
Astrid hernandez
================================================
Desarrolador que mas gana por hora:
Astrid hernandez
Sueldo por hora: $90
===============================================
Mujeres Ordenadas por nombre:
Astrid hernandez
daniela ortiz
***********************************************

```
