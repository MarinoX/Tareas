# Gestión de Tareas - Proyecto Java

## Introducción
Este proyecto es una aplicación de escritorio para gestionar tareas personales o laborales. Permite crear, modificar, eliminar y visualizar tareas con información como nombre, descripción, estado y fecha límite.  
Es útil para usuarios que desean organizar y controlar sus pendientes de manera sencilla.

## Alcance
- **Funcionalidades principales:**
  - Registrar nuevas tareas.
  - Modificar tareas existentes.
  - Eliminar tareas.
  - Buscar tareas por ID.
  - Listar todas las tareas.
- **Límites del sistema:**
  - No incluye manejo multiusuario ni sincronización en red.
  - No envía notificaciones o recordatorios.

## Tecnologías usadas
- Lenguaje: Java
- IDE: NetBeans
- Base de datos: MySQL / MariaDB
- Conexión: JDBC
- Arquitectura: Modelo-Vista-Controlador (MVC)
- Librerías: Java Swing para GUI

## Requisitos del sistema
- Java JDK 8 o superior instalado.
- Servidor MySQL o MariaDB funcionando.
- NetBeans (opcional para desarrollo).
- Sistema operativo: Windows, Linux o macOS.

### Requisitos funcionales
- CRUD completo para tareas.
- Visualización en tablas con filtros por estado y fecha.

### Requisitos no funcionales
- Interfaz amigable y sencilla.
- Respuesta rápida a operaciones.
- Código modular y mantenible con MVC.

## Análisis
- Diagrama de clases UML: Describe clases `Tarea`, `tareasDb`, y GUI.
- Casos de uso: Registro, modificación, búsqueda y listado de tareas.

## Diseño
- Wireframes y mockups diseñados para la ventana principal con tabla de tareas, formularios y botones para las operaciones.

## Conclusiones
- Aprendizajes: manejo de base de datos con JDBC, manipulación de fechas con `LocalDate`, uso de TableRowSorter para filtros.
- Problemas: formato de fechas, manejo de datos nulos en SQL.
- Soluciones: uso de formateadores, validaciones, y control de excepciones.

---

### Instrucciones para ejecutar
1. Configura tu base de datos MySQL con la tabla `tarea`.
2. Ajusta las credenciales en la clase `conexion`.
3. Compila y ejecuta el proyecto en NetBeans o desde línea de comandos.

---

¡Gracias por usar esta aplicación!