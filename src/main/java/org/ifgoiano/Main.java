
/*
Nome alunos: Carlos Roberto Ferreira Fernandes, Guilherme Cordeiro Cândido De sousa,Renan Henrique Gonçalves Justino
Disciplina: Estrutura de Dados I
Codificação: 08/06/2026

Explicação: Utilizada como ponto de partida, nessa classe definimos os vertices e as ligações que eles vão fazer, além de ser a classe
responsável por chamar todos os métodos.
 */import org.ifgoiano.grafo.Grafo;

void main() {
    Grafo grafo = new Grafo(16);
    Map<Character, Integer> cidades = new HashMap<>();
    cidades.put('A', 0);
    cidades.put('B', 1);
    cidades.put('C', 2);
    cidades.put('D', 3);
    cidades.put('E', 4);
    cidades.put('F', 5);
    cidades.put('G', 6);
    cidades.put('H', 7);
    cidades.put('I', 8);
    cidades.put('J', 9);
    cidades.put('K', 10);
    cidades.put('L', 11);
    cidades.put('M', 12);
    cidades.put('N', 13);
    cidades.put('O', 14);
    cidades.put('P', 15);



    grafo.adicionarAresta(cidades.get('A'), cidades.get('B'));
    grafo.adicionarAresta(cidades.get('A'), cidades.get('E'));
    grafo.adicionarAresta(cidades.get('B'), cidades.get('C'));
    grafo.adicionarAresta(cidades.get('B'), cidades.get('F'));
    grafo.adicionarAresta(cidades.get('C'), cidades.get('D'));
    grafo.adicionarAresta(cidades.get('C'), cidades.get('G'));
    grafo.adicionarAresta(cidades.get('D'), cidades.get('H'));
    grafo.adicionarAresta(cidades.get('E'), cidades.get('F'));
    grafo.adicionarAresta(cidades.get('E'), cidades.get('I'));
    grafo.adicionarAresta(cidades.get('F'), cidades.get('G'));
    grafo.adicionarAresta(cidades.get('F'), cidades.get('J'));
    grafo.adicionarAresta(cidades.get('G'), cidades.get('K'));
    grafo.adicionarAresta(cidades.get('G'), cidades.get('H'));
    grafo.adicionarAresta(cidades.get('H'), cidades.get('L'));
    grafo.adicionarAresta(cidades.get('I'), cidades.get('M'));
    grafo.adicionarAresta(cidades.get('I'), cidades.get('J'));
    grafo.adicionarAresta(cidades.get('J'), cidades.get('K'));
    grafo.adicionarAresta(cidades.get('J'), cidades.get('N'));
    grafo.adicionarAresta(cidades.get('K'), cidades.get('O'));
    grafo.adicionarAresta(cidades.get('K'), cidades.get('L'));
    grafo.adicionarAresta(cidades.get('M'), cidades.get('N'));
    grafo.adicionarAresta(cidades.get('N'), cidades.get('O'));
    grafo.adicionarAresta(cidades.get('O'), cidades.get('P'));
    grafo.adicionarAresta(cidades.get('P'), cidades.get('L'));



    //Percorrer Todas as cidades com Busca em Largura
    System.out.println("Busca em largura: ");
    System.out.println(grafo.buscarEmLargura(cidades.get('A')).toString());
    System.out.println();
    System.out.println();
    System.out.println();
    //Calcular Distâcia entre cidades
    //Distância entre A e P
    System.out.print("Entre A-P:");
    System.out.println(grafo.distanciaEntreCidades(cidades.get('A'),cidades.get('P')));
    System.out.print("Entre M-K:");
    //Distância entre M e K
    System.out.println(grafo.distanciaEntreCidades(cidades.get('M'),cidades.get('K')));
    System.out.print("Entre C-O:");
    //Distância entre C e O
    System.out.println(grafo.distanciaEntreCidades(cidades.get('C'),cidades.get('O')));

    //Quantas cidades tem no grafo

    System.out.println("Quantidade de cidades: "+ grafo.buscarEmLargura(cidades.get('L')).size());

    System.out.println();
    System.out.println();
    char[]testes = {'A','Z','C','L','Y'};
    for(int i = 0; i< testes.length;i++){
        if(cidades.containsKey(testes[i])){
            System.out.println("Cidade existe");
        }
        else{
            System.out.println("Cidade não existe");
        }
    }


}