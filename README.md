# Programacion Orientada a Objetos - TP1 - Legajo 53452

Este repositorio contiene el desarrollo del Trabajo Practico 1 de la asignatura Paradigmas de Programacion (UTN FRM). El proyecto se encuentra estructurado en carpetas independientes, facilitando la compilacion y evaluacion del codigo de forma incremental.

## Estructura del Proyecto

PP_TP1_53452/
├── TP1_Ejercicio1_Eventos/
│   └── src/
│       ├── App.java                 (Clase ejecutora Ejercicio 1)
│       └── EventoUniversitario.java (Modelo de evento del Ejercicio 1)
├── TP1_Ejercicio2_Eventos/
│   └── src/
│       ├── Actividad.java           (Clase asociativa con control de cupos)
│       ├── App.java                 (Clase ejecutora Ejercicio 2)
│       ├── Estudiante.java          (Clase de entidad estudiante)
│       ├── EventoUniversitario.java (Modelo con agregacion y composicion)
│       ├── Inscripcion.java         (Clase puente asociativa)
│       └── Sala.java                (Clase de agregacion para el espacio fisico)
├── TP1_Ejercicio3_Eventos/
│   └── src/
│       ├── Actividad.java           (Superclase abstracta)
│       ├── App.java                 (Clase ejecutora interactiva con ligado dinamico)
│       ├── Charla.java              (Subclase especializada de Actividad)
│       ├── Estudiante.java          (Clase de entidad estudiante)
│       ├── EventoUniversitario.java (Modelo con calculo polimorfico de costos)
│       ├── Inscripcion.java         (Clase asociativa)
│       ├── Sala.java                (Clase de agregacion)
│       └── Taller.java              (Subclase especializada de Actividad)
├── captura_consola.png              (Captura de ejecucion requerida por pauta)
└── README.md                        (Este archivo de documentacion)

## Detalles de los Ejercicios

### Ejercicio 1: Administracion de Eventos Simples
* Enfoque: Creacion de objetos basicos, encapsulamiento y constructor de copia.

### Ejercicio 2: Relaciones entre Clases
* Enfoque: Agregacion de Sala y composicion de Actividad con listas dinamicas de inscripciones.

### Ejercicio 3: Herencia y Polimorfismo
* Enfoque: Transformacion de Actividad en clase abstracta. Especializacion en Charla y Taller. Calculo polimorfico de costo de materiales y creacion interactiva de actividades por consola.

