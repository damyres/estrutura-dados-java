package com.loiane.estrutura.dados.vetor;

public class Vetor {

    public static void main(String[] args) {

      /*  double temperaturas[] = new double[10];

        temperaturas[0] = 33.1;
        temperaturas[1] = 33.1;
        temperaturas[2] = 32.1;
        temperaturas[3] = 34.1;
        temperaturas[4] = 32.1;
        temperaturas[5] = 13.1;
        temperaturas[6] = 3.1;


        for (int i = 0 ; i<temperaturas.length; i++){
            System.out.println(temperaturas[i]);
        }

        //Exibir registro de temp na posição
        System.out.println("Temperatura é " + temperaturas[5]);

        //tamanho do array
        System.out.println(temperaturas.length);

        //for melhorado
        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }

*/
    }

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;

    }
    /*

    //metodo adicionar sem verificar o tamanho do array
    public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    //metodo para adicionar e verifcar se o array tem tamanho disponível
    public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais um elemento");
        }
    }

     */

    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }
}
