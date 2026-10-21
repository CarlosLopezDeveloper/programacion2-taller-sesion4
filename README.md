# programacion2-taller-sesion4
Sistema de Nómina del INTEP para la asignatura de Programación II. El taller evalúa la aplicación práctica de los conceptos de Programación Orientada a Objetos
Elaborado por Carlos Ariel López
Parte A. Comprensión de conceptos
20 puntos · Responda con sus palabras y cite su propio código.

1	Aplique la prueba del «es un» a su jerarquía: escriba las dos frases que la justifican. Luego escriba una frase con las mismas clases que no tenga sentido, y explique por qué esa relación sería incorrecta. (4 pts)
R/.Un Docente es un Empleado.
    Un Administrativo es un Empleado.
	Un Empleado es un Docente, la herencia se aplica de lo general a lo específico.

2	Explique qué hace la línea super(cedula, nombre, dependencia); en su código y por qué debe ir en la primera línea del constructor. (4 pts)

R/. Función: Invoca explícitamente al constructor de la clase padre (Empleado) para inicializar los atributos heredados (cedula, nombre, dependencia).

Ubicación en la primera línea: Java exige que la parte del objeto correspondiente a la clase base sea completamente instanciada e inicializada en memoria antes de que la clase hija proceda a asignar o manipular sus propios atributos específicos.



3	Los atributos de la clase padre quedaron en protected y no en private . Explique qué habría pasado si los dejaba en private, y cuál es la alternativa que evitaría usar protected. (4 pts)

R/.Uso de protected: Permite que las clases hijas (Docente y Administrativo) accedan directamente a los atributos definidos en la clase padre (Empleado).   

Efecto de usarse private: Si los atributos fueran private, las clases hijas no podrían leerlos ni modificarlos de forma directa en sus propios métodos.   

 Mantener los atributos del padre en private y acceder a ellos desde las clases hijas mediante métodos de acceso (getters y setters) públicos o protegidos, preservando de mejor manera el encapsulamiento.

4	Explique para qué sirve la anotación @Override y qué error concreto le evita a usted como programador. (3 pts)

R/. Sirve para Informa explícitamente al compilador de Java que el método tiene la intención de redefinir un método heredado de la clase padre. 
Previene errores silenciosos como fallas ortográficas en el nombre del método (por ejemplo, escribir resumenes() en vez de resumen()) o discrepancias en los tipos de parámetros. Si la firma no coincide exactamente con el método de la clase padre, el compilador genera un error inmediatamente en lugar de tratarlo como un método nuevo. 



5	En su método resumen() de las clases hijas usted llamó a super.resumen() . Explique qué gana el programa frente a escribir otra vez el texto del padre. (3 pts)

R/. Evita la duplicación de código y garantiza el principio DRY (Don't Repeat Yourself). Si en el futuro cambia el formato o se agrega un dato general a la representación del Empleado, solo se modifica en la clase padre y todas las clases hijas reflejarán el cambio automáticamente sin necesidad de reescribir la lógica de visualización.

6	¿Qué diferencia hay entre sobrescribir (override) y sobrecargar (overload)? Dé un ejemplo de cada uno tomado de su propio código o del curso. (2 pts)


R/. Sobrescribir (Override): Ocurre en una relación de herencia cuando una clase hija redefine la implementación de un método heredado manteniendo exactamente el mismo nombre, tipo de retorno y parámetros. 
•	Ejemplo: Redefinir calcularPagoMensual() en la clase Docente para calcular el pago según horas y valor de hora. 
Sobrecargar (Overload): Ocurre dentro de una misma clase cuando se definen múltiples métodos con el mismo nombre pero con diferentes parámetros (distinta cantidad o tipos de datos).
•	Ejemplo: Tener dos constructores en la clase Empleado: uno sin parámetros Empleado() y otro parametrizado Empleado(String cedula, String nombre, String dependencia).

![alt text](<nomina uml-1.PNG>)