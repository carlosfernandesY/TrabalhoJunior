package org.ifgoiano.fila;

public class Node<T> {
    T data;
    Node<T> prox;

    public Node(T data) {
        this.data = data;
    }
}
