# 🎯 Buscaminas en Java

Este proyecto es una implementación del clásico juego **Buscaminas** en consola utilizando **Java**. Se aplicaron principios de **Programación Orientada a Objetos (POO)**, el **patrón de diseño MVC**, pruebas unitarias con **JUnit5**, y principios de **código limpio y SOLID**.

---

## 🧠 Características del Proyecto

- ✅ Juego de Buscaminas jugable por consola.
- ✅ Aplicación del patrón **MVC** (Modelo-Vista-Controlador).
- ✅ Manejo de **excepciones personalizadas** para validaciones de entrada.
- ✅ Generación aleatoria de minas.
- ✅ Interfaz amigable en consola.
- ✅ **Pruebas Unitarias** con JUnit5.
- ⚠️ [Por implementar] Guardado/carga de partidas desde archivos.

---

## 📁 Estructura de Paquetes

buscaminas/
│
├── app/ → Punto de entrada (main.java)
├── controlador/ → Lógica del juego (JuegoBuscaminas)
├── modelo/ → Clases del juego (Casilla, Tablero, ElementoTablero, etc.)
├── vista/ → Interfaz de consola (VistaConsola)
├── excepciones/ → Excepciones personalizadas
└── util/ → Utilidades como conversión de coordenadas


---

## 🏁 Cómo Ejecutar

### 📌 Requisitos

- Java 17+ (o compatible con tu versión)
- Eclipse o cualquier IDE Java
- JUnit5 (para correr las pruebas)

### ▶️ Ejecutar el Juego

1. Clona este repositorio:

   ```bash
   git clone https://github.com/tuusuario/BuscaminasJava.git
   

Abre el proyecto en Eclipse o tu IDE favorito.

Ejecuta la clase main.java ubicada en buscaminas.app (o en el paquete raíz).

¡Empieza a jugar desde la consola!

🧪 Pruebas Unitarias
Ubicadas en el directorio /test/ o dentro de los mismos paquetes.

Clases probadas:

CasillaTest.java

TableroTest.java

UtilidadesTest.java

Cobertura:

Estados y comportamiento de casillas.

Colocación de minas y dimensiones del tablero.

Conversión y validación de coordenadas.

💡 Principios Aplicados
✅ POO: Herencia, polimorfismo, encapsulamiento, abstracción.

✅ MVC: Separación entre modelo, vista y controlador.

✅ SOLID:

SRP (Responsabilidad única): cada clase tiene una única responsabilidad.

OCP (Abierto/cerrado): se puede extender el comportamiento del tablero sin modificarlo.

✅ Clean Code: nombres descriptivos, métodos cortos, claridad en flujo.
