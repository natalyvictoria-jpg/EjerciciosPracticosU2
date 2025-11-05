<h1 style="color:red;">🧩 Ejercicios Prácticos – Listas Enlazadas en Java</h1>


<p align="center">
  <img src="https://cdn-icons-png.flaticon.com/512/1006/1006363.png" alt="Código y desarrollo" width="180">
</p>


## GTID0141

📘 **Materia:** Estructura de Datos  
👩‍💻❤️ **Nombre:** Nataly Victoria Gonzalez Aviles  
🏫 **Proyecto:** Implementación de estructuras enlazadas en Java con NetBeans  
📅 **Unidad:** 2 – Listas Enlazadas  
⚙️ **Lenguaje:** Java  
🧠 **Propósito:** Desarrollar y aplicar diferentes tipos de listas enlazadas (simples, circulares y dobles) para manipular datos dinámicamente, reforzando el uso de nodos, referencias y recorridos.

---

## 🟩 Ejercicio 01 – Lista Enlazada Simple

**Objetivo:**  
Implementar una lista enlazada simple que almacene números enteros, los recorra y elimine aquellos mayores a un valor dado.

### 📂 Archivos del código

| Parte del ejercicio        | Código                                   |
| -------------------------- | ---------------------------------------- |
| Nodo para lista simple     | [Nodo.java](Nodo.java)                   |
| Implementación de la lista | [ListaEnlazada.java](ListaEnlazada.java) |

### 💡 Descripción

El programa genera una lista de números aleatorios, los muestra en pantalla y luego elimina los valores mayores a un límite introducido por el usuario.

### ▶️ Ejecución

1. Ejecutar la clase `ListaEnlazada`.  
2. Ingresar la cantidad de números a generar.  
3. Ingresar el valor límite para eliminar elementos mayores.

---

## 🟦 Ejercicio 02 – Lista Enlazada de Palabras desde Archivo

**Objetivo:**  
Leer palabras desde un archivo de texto, almacenarlas en una lista enlazada y permitir su manipulación (añadir, eliminar y guardar cambios).

### 📂 Archivos del código

| Parte del ejercicio                     | Código                                   |
| --------------------------------------- | ---------------------------------------- |
| Nodo de palabras                        | [NodoPalabra.java](NodoPalabra.java)     |
| Lista de palabras con lectura/escritura | [ListaPalabras.java](ListaPalabras.java) |

### 💡 Descripción

El programa abre un archivo de texto con palabras, las carga en una lista enlazada y permite agregar o eliminar palabras. Finalmente, reescribe el archivo con las modificaciones.

### ▶️ Ejecución

1. Crear un archivo `palabras.txt` con texto simple.  
2. Ejecutar `ListaPalabras`.  
3. Seguir las instrucciones en consola para leer, modificar y guardar.

---

## 🟨 Ejercicio 03 – Representación y Evaluación de Polinomios

**Objetivo:**  
Representar un polinomio mediante una lista enlazada simple y calcular su valor para distintos puntos de evaluación.

### 📂 Archivos del código

| Parte del ejercicio                       | Código                                   |
| ----------------------------------------- | ---------------------------------------- |
| Nodo de término de polinomio              | [NodoPolinomio.java](NodoPolinomio.java) |
| Implementación y evaluación del polinomio | [Polinomio.java](Polinomio.java)         |

### 💡 Descripción

Cada nodo almacena un coeficiente y exponente. El programa evalúa el polinomio desde x = 0.0 hasta 5.0 en incrementos de 0.5, mostrando una tabla de valores.

### ▶️ Ejecución

1. Ejecutar `Polinomio`.  
2. Introducir los términos (coeficiente y exponente).  
3. Ingresar `0` como coeficiente para terminar la entrada.

---

## 🟧 Ejercicio 04 – Polinomio con Lista Circular

**Objetivo:**  
Modificar la lista enlazada de un polinomio para convertirla en **circular**, facilitando recorridos continuos.

### 📂 Archivos del código

| Parte del ejercicio          | Código                                           |
| ---------------------------- | ------------------------------------------------ |
| Nodo circular del polinomio  | [NodoCircular.java](NodoCircular.java)           |
| Lista circular del polinomio | [PolinomioCircular.java](PolinomioCircular.java) |

### 💡 Descripción

La lista circular permite que el último nodo apunte al primero, generando un recorrido cíclico.  
Se capturan términos del polinomio y se muestran en forma circular.

### ▶️ Ejecución

1. Ejecutar `PolinomioCircular`.  
2. Introducir pares de coeficiente y exponente.  
3. Finalizar con coeficiente `0`.

---

## 🟥 Ejercicio 05 – Lista Doblemente Enlazada

**Objetivo:**  
Construir una lista doblemente enlazada a partir de los caracteres de una cadena ingresada y ordenarla alfabéticamente.

### 📂 Archivos del código

| Parte del ejercicio              | Código                                                       |
| -------------------------------- | ------------------------------------------------------------ |
| Nodo doblemente enlazado         | [NodoDoble.java](NodoDoble.java)                             |
| Implementación de la lista doble | [ListaDoblementeEnlazada.java](ListaDoblementeEnlazada.java) |

### 💡 Descripción

Cada nodo guarda un carácter y enlaces a su predecesor y sucesor.  
El programa ordena los caracteres alfabéticamente mediante un algoritmo de burbuja.

---

## 🧠 Conceptos reforzados

* Estructuras dinámicas de datos (Listas enlazadas simples, dobles y circulares)  
* Manipulación de nodos y punteros  
* Evaluación de polinomios y recorrido de listas  
* Lectura y escritura de archivos en Java  
* Aplicación del paradigma orientado a objetos (POO)

---
# 🧮 Ejercicios Prácticos de Colas (Java)

Este repositorio contiene tres ejercicios de simulación y comparación de colas implementados en **Java**, aplicando **estructuras genéricas, encapsulamiento y buenas prácticas POO**.

---

## 📘 Descripción de los ejercicios

| Ejercicio | Descripción |
|------------|-------------|
| **Ejercicio 1** | Comparación de dos colas genéricas (mismo tamaño y elementos en el mismo orden). |
| **Ejercicio 2** | Simulación del funcionamiento de un supermercado con carritos y cajas de pago. |
| **Ejercicio 3** | Simulación de atención al cliente durante 7 horas con apertura dinámica de una cuarta caja. |

---

## 🗂️ Archivos del código


| Parte del ejercicio                      | Código                                                       |
| ---------------------------------------- | ------------------------------------------------------------ |
| Clase Cola genérica                      | [Cola.java](Cola.java)                              |
| Comparador de colas                      | [ComparadorDeColas.java](ComparadorDeColas.java)    |
| Simulación de supermercado               | [SupermercadoSimulacion.java](SupermercadoSimulacion.java) |
| Simulación de atención de clientes       | [SimulacionAtencionClientes.java](SimulacionAtencionClientes.java) |
| Clase principal                          | [Main.java](Main.java)  


---
![Salida del programa](ImagenSalida)


## 🧠 Objetivos

- Aplicar estructuras de datos tipo **cola (FIFO)**.  
- Implementar recorrido y comparación de elementos.  
- Simular el flujo de clientes en sistemas reales.  
- Aplicar **encapsulamiento y reutilización de clases genéricas**.  
- Generar estadísticas de rendimiento y comportamiento.

---

## ⚙️ Cómo ejecutar el proyecto

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tuusuario/ejercicios-colas.git


## ✨ Autor

**Nataly Victoria Gonzalez Aviles** 👩‍💻❤️  
📍 *Estudiante de Ingeniería en Desarrollo de Software*  
📧 *Proyecto académico – Unidad 2: Estructuras Enlazadas*







