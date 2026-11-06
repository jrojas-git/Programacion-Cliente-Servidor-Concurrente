# Fidness - Sistema de Gestión de Rutinas

## Descripción
Fidness esta es una aplicación desarrollada en Java utilizando Swing para una cadena de gimnasios. 

Proyecto desarrollado para el curso **Programación Cliente/Servidor Concurrente**.

## Estas son las credenciales de prueba documentadas para el avance2.
### Usuario cliente
- **Usuario:** `usuario`
- **Contraseña:** `1234`

### Usuario administrador
- **Usuario:** `admin`
- **Contraseña:** `1234`

**Nota:** Estas credenciales se agregaron estaticamente y están definidas directamente en la clase `ServicioAutenticacion.java`.

## Requisitos
- Java JDK.
- Apache NetBeans IDE.

## Instrucciones de ejecución
1. Descargar o clonar el repositorio de GitHub.
2. Abrir Apache NetBeans.
3. Seleccionar **File → Open Project**.
4. Buscar y seleccionar la carpeta `Fidness`.
5. Ejecutar el proyecto utilizando **Run**.
6. Iniciar sesión con las credenciales de prueba.

## Funcionalidades implementadas
- Inicio de sesión con validación de credenciales.
- Consulta del catálogo de ejercicios.
- Visualización de instrucciones y recomendaciones.
- Creación de rutinas personalizadas.
- Selección de varios ejercicios para una misma rutina.

## Cómo crear una rutina
1. Iniciar sesión con el usuario `usuario`.
2. En el catálogo, seleccionar uno o varios ejercicios.
3. Para seleccionar varios ejercicios, mantener presionada la tecla **Ctrl** mientras se hace clic sobre ellos.
4. Presionar el botón **Crear rutina**.
5. Escribir el nombre de la rutina.
6. Confirmar la creación.

## Conceptos de programación implementados
- Clases y objetos.
- Herencia.
- Polimorfismo.
- Manejo de excepciones.
- Colecciones `ArrayList`.
- Interfaz gráfica con Java Swing.

## Consideraciones
- Los usuarios y las contraseñas son datos de prueba definidos en el código.
- Las rutinas se almacenan temporalmente en memoria y no se conservan al cerrar la aplicación.
- El rol de administrador está definido, pero todavía no se ha implementado una interfaz para administrar ejercicios.
- La comunicación mediante sockets y la ejecución multihilo no forman parte de esta versión.
