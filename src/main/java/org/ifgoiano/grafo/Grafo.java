package org.ifgoiano.grafo;

import org.ifgoiano.fila.Fila;
import org.ifgoiano.fila.Node;


import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {
   private int [][]matriz;
   private int numeroVertices;
   public Grafo(int numeroVertices){
       this.numeroVertices = numeroVertices;
       this.matriz = new int[numeroVertices][numeroVertices];
   }
   public void adicionarAresta(int i, int j){
       this.matriz[i][j] = 1;
       this.matriz[j][i] = 1;


   }

   public List buscarEmLargura(char src){
       boolean []visited = new boolean[numeroVertices];
       List<Node<Character>> res = new ArrayList<>();
       Fila<Character> fila = new Fila<>();
       visited[src] = true;
       fila.enfileirar(src);

       while(!fila.ehVazia()){
           Node<Character> atual  = fila.desifileirar();
           res.add(atual);
           for(int i = 0; i< numeroVertices;i++){
           if(matriz[0][i]==1 && !visited[i]){
           visited[i] = true;
           fila.desifileirar();
           }
           }
       }
       return res;

   }

   public void mostrarGrafo(){
       char[]alfa = {'A','B','C','D','E','F','G','H','I','J','K','L'};
       System.out.print("  "); for(char i: alfa ) System.out.print(i+ " ");
       System.out.println();
       for(int i = 0; i < matriz.length;i++){
           System.out.print(alfa[i]+ " ");
           for (int j = 0; j < matriz.length; j++){
               System.out.print(matriz[i][j]+ " ");
           }
           System.out.println();
       }
   }

}
