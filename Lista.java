import java.util.*;

public class Lista{
    public static void main(String args[])
    {
        ArrayList<Integer> lista= new ArrayList<>(5);

            System.out.println("Adcionando os dados 1,2,3,4,5 na Lista:");


            lista.add(1);
            lista.add(2);
            lista.add(3);
            lista.add(4);
            lista.add(5);

            System.out.println("Lista:"+lista);
            System.out.println("--------------------------------------------");
            System.out.println("Removendo os dados da lista:");

            while(!lista.isEmpty()) {

                lista.remove(0);

        }
            System.out.println(lista);


        Stack<Integer> pilha = new Stack<Integer>();


            pilha.push(1);
            pilha.push(2);
            pilha.push(3);
            pilha.push(4);
            pilha.push(5);

            System.out.println("--------------------------------------------");
            System.out.println("Adcionando os dados 1,2,3,4,5 na pilha:");
            System.out.println("Pilha:"+pilha);

            System.out.println("--------------------------------------------");
            System.out.println("Removendo os dados da Pilha: ");

            while(!pilha.isEmpty()) {

                int element = pilha.pop();
        }
            System.out.println(pilha);
            System.out.println("--------------------------------------------");


        ArrayDeque<Integer> fila = new ArrayDeque<>(10);


            System.out.println("Inserindo os dados 1,2,3,4,5, da pilha na fila:");

            fila.add(1);
            fila.add(2);
            fila.add(3);
            fila.add(4);
            fila.add(5);

            System.out.println(fila);

            System.out.println("--------------------------------------------");
            System.out.println("Adicionando os dados 6,7,8,9,10 na lista:");

            lista.add(6);
            lista.add(7);
            lista.add(8);
            lista.add(9);
            lista.add(10);

            System.out.println("Lista:" + lista);

            System.out.println("--------------------------------------------");
            System.out.println("Removendo os dados da lista:");

            while(!lista.isEmpty()) {

                lista.remove(0);

        }
            System.out.println(lista);
            System.out.println("--------------------------------------------");
            System.out.println("Inserindo os dados 6,7,8,9,10 da lista na pilha:");

            pilha.push(6);
            pilha.push(7);
            pilha.push(8);
            pilha.push(9);
            pilha.push(10);
            System.out.println("Pilha:" + pilha);
            System.out.println("--------------------------------------------");

            System.out.println("Removendo os dados da pilha:");

            while(!pilha.isEmpty()) {

                int element = pilha.pop();
        }

            System.out.println(pilha);

            System.out.println("--------------------------------------------");

            System.out.println("inserindo os dados 6,7,8,9,10 da pilha na fila:");

            fila.add(6);
            fila.add(7);
            fila.add(8);
            fila.add(9);
            fila.add(10);

            System.out.println(fila);


    }


}

