# Busca em Largura (BFS) em Grafos com Java

##  Identificação Acadêmica
* **Instituição:** Instituto Federal Goiano - Campus Urutaí
* **Curso:** Sistemas de informação 
* **Disciplina:** Estrutura de Dados I
* **Professor:** Junio Cesar de Lima
* **Autores:**
  * Carlos Roberto Ferreira Fernandes - [@carlosfernandesY](https://github.com/carlosfernandesY)
  * Guilherme Cordeiro Candido de Sousa - [@guicordeiro1](https://github.com/guicordeiro1)
  * Renan Henrique Gonçalves Justino - [ReHenrique](https://github.com/ReHenrique)
##  1. Explicação do Projeto

Este projeto foi desenvolvido para simular uma rede de transporte interconectada contendo 16 cidades (de 'A' até 'P'). Utilizando conceitos práticos de Grafos, mapeamos essa malha através de uma matriz de adjacência para gerenciar o mapa, permitindo verificar se uma cidade específica está presente e contar o total de cidades cadastradas. A partir daí, aplicamos o algoritmo de Busca em Largura (BFS) para rastrear a ordem em que as cidades são visitadas e calcular quantas "paradas" (cidades intermediárias) existem no caminho mais curto entre dois pontos.


###  Restrições Técnicas Atendidas
* **Estrutura de Fila Própria:** O controle de vizinhança da BFS utiliza uma classe customizada e genérica `Fila<T>` sustentada por nós (`Node<T>`), respeitando o conceito fundamental FIFO (First-In, First-Out).
* **Modelagem Estrutural:** Utilização de uma Matriz de Adjacência primitiva para representar as conexões entre as cidades.

---

##  2. Explicação da Solução Implementada

O projeto foi organizado de forma modular, dividindo-se entre os pacotes `org.ifgoiano.fila` e `org.ifgoiano.grafo`.

### A. Estrutura de Dados Manual (`Node<T>` e `Fila<T>`)
Para evitar coleções prontas, a fila foi construída sob o conceito de alocação dinâmica encadeada:
* **`Node<T>`:** Classe base que armazena o dado encapsulado (`data`) e a referência para o próximo elemento da memória (`prox`).
* **`enfileirar(T data)`:** Cria um novo nó. Se a fila estiver vazia, define-o como `inicio` e `fim`. Caso contrário, vincula-o ao final da fila (`this.fim.prox = node`) e atualiza o ponteiro de encerramento.
* **`desifileirar()`:** Extrai o nó localizado na cabeça da estrutura (`this.inicio`), desloca o ponteiro inicial para o elemento subsequente e retorna o nó removido para processamento de seus dados internos via `.getData()`.

### B. Representação do Grafo por Matriz de Adjacência
Dentro da classe `Grafo<T>`, as conexões são gerenciadas por uma matriz bidimensional pura de inteiros (`int[][] matriz`). O método `adicionarAresta(int i, int j)` estabelece a relação bidirecional (grafo não-direcionado), marcando as coordenadas de ida e volta com o valor `1`.

Para a exibição legível do mapa, o método `mostrarGrafo()` utiliza um vetor estático de caracteres:
```java
char[] alfa = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L','M','N','O','P'};
