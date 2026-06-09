/*
Nome alunos: Carlos Roberto Ferreira Fernandes, Guilherme Cordeiro Cândido De sousa,Renan Henrique Gonçalves Justino
Disciplina: Estrutura de Dados I
Codificação: 08/06/2026

Explicação: Apenas para fim de organização, escolhemos separar cada node da fila
assim essa classe tem o intuito de representar um elemento da fila
 */

package org.ifgoiano.fila;

public class Node<T> {
    T data;
    Node<T> prox;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getProx() {
        return prox;
    }

    public void setProx(Node<T> prox) {
        this.prox = prox;
    }
}
