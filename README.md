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
* **Estrutura de Fila Própria:** O controle de vizinhança da BFS utiliza uma classe customizada e genérica `Fila` sustentada por nós (`Node`), respeitando o conceito fundamental FIFO (First-In, First-Out).
* **Modelagem Estrutural:** Utilização de uma Matriz de Adjacência primitiva para representar as conexões entre as cidades.

## 2. Principais Métodos 
A inteligência de navegação do projeto está concentrada em três métodos principais que operam sobre a Matriz de Adjacência:

* **`adicionarAresta(int i, int j)`:** Responsável por mapear as estradas. Como o modelo é um grafo não-direcionado (vias de mão dupla), o método espelha a conexão, atribuindo o valor `1` tanto para `matriz[i][j]` quanto para `matriz[j][i]`.

* **`buscarEmLargura(int src)`:** Realiza o rastreamento completo da rede a partir de uma cidade origem. 
  - Utiliza o vetor `boolean[] visited` para evitar loops em cidades já processadas. 
  - O processamento interno é matemático (índices de 0 a 15), mas utiliza um array de caracteres (`alfa`) para traduzir o caminho de volta para letras ('A' a 'P'), retornando uma lista com a ordem exata de visitação.

* **`distanciaEntreCidades(int origem, int destino)`:** Uma variação do BFS focada no cálculo da rota mais curta. 
  - Utiliza um array `int[] distancia` preenchido inicialmente com `-1` (não alcançado). 
  - Conforme a fila avança em "ondas", a distância de um novo vizinho é calculada como `distancia[atual] + 1`. 
  - **Tratamento de Regra de Negócio:** O método retorna `distancia[destino] - 1`. Essa subtração garante o atendimento ao requisito do projeto, informando estritamente a quantidade de cidades *intermediárias* entre os dois pontos, desconsiderando o salto final.

---

##  3. Explicação da Solução Implementada

O projeto foi organizado de forma modular, dividindo-se entre os pacotes `org.ifgoiano.fila` e `org.ifgoiano.grafo`.

### A. Estrutura de Dados Manual (`Node` e `Fila`)
Para evitar coleções prontas, a fila foi construída sob o conceito de alocação dinâmica encadeada:
* **`Node`:** Classe base que armazena o dado encapsulado (`data`) e a referência para o próximo elemento da memória (`prox`).
* **`enfileirar(T data)`:** Cria um novo nó. Se a fila estiver vazia, define-o como `inicio` e `fim`. Caso contrário, vincula-o ao final da fila (`this.fim.prox = node`) e atualiza o ponteiro de encerramento.
* **`desifileirar()`:** Extrai o nó localizado na cabeça da estrutura (`this.inicio`), desloca o ponteiro inicial para o elemento subsequente e retorna o nó removido para processamento de seus dados internos via `.getData()`.

### B. Representação do Grafo por Matriz de Adjacência
Dentro da classe `Grafo`, as conexões são gerenciadas por uma matriz bidimensional pura de inteiros (`int[][] matriz`). O método `adicionarAresta(int i, int j)` estabelece a relação bidirecional (grafo não-direcionado), marcando as coordenadas de ida e volta com o valor `1`.








