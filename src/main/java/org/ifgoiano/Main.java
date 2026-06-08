import org.ifgoiano.grafo.Grafo;

void main(){
    Grafo grafo = new Grafo(12);
    grafo.adicionarAresta(0,1);
    grafo.adicionarAresta(0,4);
    grafo.adicionarAresta(1,3);
    grafo.adicionarAresta(1,5);
    grafo.adicionarAresta(2,3);
    grafo.adicionarAresta(2,6);


    grafo.mostrarGrafo();

}