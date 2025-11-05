/*
---------------------------------------------------------------
Universidad Tecnologica del Norte de Guanajuato
Nombre: Nataly Victoria Gonzalez Aviles
Grupo: Q GTID0141
Fecha: 04/11/2025
Tema: Estructuras de Datos - Colas

Descripcion:
Simula la atencion de clientes en un supermercado durante 7 horas.
Los clientes llegan aleatoriamente, se forman en una fila unica y
son atendidos por tres cajas, abriendo una cuarta cuando la fila
supera los 20 clientes. Muestra estadisticas al finalizar.
---------------------------------------------------------------
*/

package Cola;

import java.util.*;

/**
 * Ejercicio 3: Simulación del flujo de atención de clientes durante 7 horas.
 * Usa una cola única de espera y abre una cuarta caja si hay más de 20 clientes.
 */
public class SimulacionAtencionClientes {
    // Cola única de clientes esperando
    private Cola<String> filaClientes;
    // Lista de colas que representan las cajas activas
    private List<Cola<String>> cajas;
    // Estadísticas
    private int clientesAtendidos;
    private int maxTamañoFila;
    private int tiempoAperturaCuartaCaja = -1;
    private boolean cuartaCajaAbierta;

    /** Constructor: inicia con 3 cajas activas */
    public SimulacionAtencionClientes() {
        this.filaClientes = new Cola<>();
        this.cajas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cajas.add(new Cola<>());
        }
    }

    /**
     * Simula la atención por 7 horas (420 minutos).
     * Cada minuto llega un cliente y las cajas atienden.
     */
    public void simular() {
        Random random = new Random();
        int minutos = 7 * 60; // 420 minutos

        for (int minuto = 1; minuto <= minutos; minuto++) {
            // Cada minuto llega un nuevo cliente
            filaClientes.encolar("Cliente" + minuto);

            // Si la fila supera los 20 clientes, se abre una cuarta caja
            if (filaClientes.tamaño() > 20 && !cuartaCajaAbierta) {
                cajas.add(new Cola<>());
                cuartaCajaAbierta = true;
                tiempoAperturaCuartaCaja = minuto;
                System.out.println("⚡ Se abrio la cuarta caja en el minuto " + minuto);
            }

            // Cada caja atiende un cliente (si hay)
            // Simulación más realista: no todas las cajas atienden cada minuto
        for (Cola<String> caja : cajas) {
            if (!filaClientes.estaVacia() && Math.random() < 0.7) { // 70% de probabilidad de atender
            String cliente = filaClientes.desencolar();
            caja.encolar(cliente);
            clientesAtendidos++;
    }
}

                

            // Actualiza el tamaño máximo de la fila
            maxTamañoFila = Math.max(maxTamañoFila, filaClientes.tamaño());
        }

        mostrarEstadisticas();
    }

    /** Imprime las estadísticas al finalizar la simulación */
    private void mostrarEstadisticas() {
        System.out.println("\n📊 ESTADISTICAS DE SIMULACION:");
        System.out.println("Total de clientes atendidos: " + clientesAtendidos);
        System.out.println("Tamano maximo de la fila: " + maxTamañoFila);
        System.out.println("Cuarta caja abierta: " + (cuartaCajaAbierta ? "Si" : "No"));
        if (cuartaCajaAbierta)
            System.out.println("Tiempo de apertura de la cuarta caja: minuto " + tiempoAperturaCuartaCaja);
    }

    // Métodos getter para consultar los resultados desde fuera
    public int getClientesAtendidos() { return clientesAtendidos; }
    public int getMaxTamañoFila() { return maxTamañoFila; }
    public boolean isCuartaCajaAbierta() { return cuartaCajaAbierta; }
    public int getTiempoAperturaCuartaCaja() { return tiempoAperturaCuartaCaja; }
}

