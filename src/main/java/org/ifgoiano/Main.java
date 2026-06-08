import org.ifgoiano.grafo.Grafo;

void main(){
    Grafo grafo = new Grafo(12);
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





    grafo.mostrarGrafo();

    System.out.println(grafo.buscarEmLargura(0).toString());

}