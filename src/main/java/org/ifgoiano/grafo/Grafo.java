/*
Nome alunos: Carlos Roberto Ferreira Fernandes, Guilherme Cordeiro Cândido De sousa,Renan Henrique Gonçalves Justino
Disciplina: Estrutura de Dados I
Codificação: 08/06/2026

Explicação: Classe mais importante do projeto, pois é nela que representamos o grafo e contém todos os métodos necessários
sendo adicionarArestas,buscaEmLargura e distanciaEntreCidades
 */

package org.ifgoiano.grafo;

import org.ifgoiano.fila.Fila;

import java.util.ArrayList;
import java.util.Arrays;
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

    public List<Character> buscarEmLargura(int src) {
        boolean[] visited = new boolean[this.numeroVertices];
        List<Character> resposta = new ArrayList<>();
        Fila<Integer> fila = new Fila<>();
        visited[src] = true;
        fila.enfileirar(src);
        char[] alfa = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};
        while (!fila.ehVazia()) {
            int atual = fila.desenfileirar();
            resposta.add(alfa[atual]);
            for (int i = 0; i < this.numeroVertices; i++) {
                if (matriz[atual][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    fila.enfileirar(i);
                }
            }
        }
        return resposta;

    }

    public int distanciaEntreCidades(int origem, int destino) {
        Fila<Integer> fila = new Fila<>();
        int[] distancia = new int[this.numeroVertices];
        Arrays.fill(distancia, -1);
        distancia[origem] = 0;
        fila.enfileirar(origem);
        while (!fila.ehVazia()) {
            int atual = fila.desenfileirar();

            for (int i = 0; i < this.numeroVertices; i++) {
                if (matriz[atual][i] == 1 && distancia[i] == -1) {
                    distancia[i] = distancia[atual] + 1;
                    fila.enfileirar(i);
                }
            }
        }
        return distancia[destino] - 1;
    }
}


