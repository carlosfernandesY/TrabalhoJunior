package org.ifgoiano.grafo;

import org.ifgoiano.fila.Fila;
import org.ifgoiano.fila.Node;


import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {
    private int[][] matriz;
    private int numeroVertices;

    public Grafo(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        this.matriz = new int[numeroVertices][numeroVertices];
    }

    public void adicionarAresta(int i, int j) {
        this.matriz[i][j] = 1;
        this.matriz[j][i] = 1;


    }

    public List buscarEmLargura(int src) {
        boolean[] visited = new boolean[numeroVertices];
        List<Integer> res = new ArrayList<>();
        Fila<Integer> fila = new Fila<>();
        visited[src] = true;
        fila.enfileirar(src);

        while (!fila.ehVazia()) {
            int atual = fila.desifileirar().getData();
            res.add(atual);
            for (int i = 0; i < numeroVertices; i++) {
                if (matriz[atual][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    fila.enfileirar(i);
                }
            }
        }
        return res;

    }

    public void mostrarGrafo() {
        char[] alfa = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L','M','N','O','P'};
        System.out.print("  ");
        for (char i : alfa) System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(alfa[i] + " ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
