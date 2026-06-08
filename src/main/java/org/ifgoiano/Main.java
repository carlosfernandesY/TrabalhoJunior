import org.ifgoiano.grafo.Grafo;

void main(){
    Grafo grafo = new Grafo(16);
    grafo.adicionarAresta(0,1);
    grafo.adicionarAresta(0,4);
    grafo.adicionarAresta(1,2);
    grafo.adicionarAresta(1,5);
    grafo.adicionarAresta(2,3);
    grafo.adicionarAresta(2,6);
    grafo.adicionarAresta(3,7);
    grafo.adicionarAresta(4,5);
    grafo.adicionarAresta(5,9);
    grafo.adicionarAresta(5,6);
    grafo.adicionarAresta(6,7);
    grafo.adicionarAresta(6,10);
    grafo.adicionarAresta(7,11);
    grafo.adicionarAresta(8,4);
    grafo.adicionarAresta(8,9);
    grafo.adicionarAresta(8,12);
    grafo.adicionarAresta(9,6);
    grafo.adicionarAresta(9,13);
    grafo.adicionarAresta(10,14);
    grafo.adicionarAresta(10,11);
    grafo.adicionarAresta(10,9);
    grafo.adicionarAresta(11,15);
    grafo.adicionarAresta(13,12);
    grafo.adicionarAresta(14,13);
    grafo.adicionarAresta(14,15);
    grafo.mostrarGrafo();

    System.out.println(grafo.distanciaEntreCidades(0,5));

}