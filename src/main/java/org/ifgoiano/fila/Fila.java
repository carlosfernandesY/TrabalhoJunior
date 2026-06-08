package org.ifgoiano.fila;


public class Fila<T> {
    Node<T> inicio;
    Node<T> fim;
    public Fila() {
        this.inicio = null;
    }

    public boolean ehVazia() {
        return this.inicio == null;
    }

    public void enfileirar(T data) {
        Node<T> node = new Node<>(data);
        if (ehVazia()) {
            this.inicio = node;
            this.fim = node;
        } else {
            this.fim.prox = node;
            this.fim = node;
        }
    }

    public Node<T> desifileirar() {
        if (ehVazia()) {
            System.out.println("Lista Vazia");
        } else {
            Node<T> aux  = this.inicio;
            this.inicio = this.inicio.prox;
            return aux;
        }

        return  null;


    }

    public void mostrarFila(){
        Node<T> aux = this.inicio;
        while(aux != null){
            System.out.print(aux.data +" ");
            aux = aux.prox;
        }
    }
    void main() {
        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(4);
        fila.enfileirar(5);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(1);
        fila.mostrarFila();
        fila.desifileirar();
        fila.desifileirar();
        fila.desifileirar();
        System.out.println();
        fila.mostrarFila();
    }

}
