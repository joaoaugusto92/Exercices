/* Voce recebe um numero de consultas 'q'.
essas consultas, cada uma, enviara 3 numeros, 'a', 'b' e 'n'
Para cada consulta, deve-se imprimir a serie correspondente aos valores 'a', 'b' e 'n', todos em uma unica linha de
'n' inteiros serparados por espaco
* */

package org.example;
import java.util.Scanner;

public class Consultas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        //esse loop é para que ele repita, o número de vezes da quantidade de consultas.
        for (int i = 0; i<q; i++){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int sum = a;
        //esse loop é para que ele construa a série de números com 'n' inteiros
        for (int j=0; j<n; j++){
            int pontencia = (int) (Math.pow(2,j) *b);
              sum+=pontencia;
              System.out.printf("%s", sum);
        }
        // essa condição é para verificar se o índice da consulta atual 't' é menor que o número
        //de consultas total. Se for, ele pula a linha, fazendo com que cada consulta fique em uma linha.
        if (i<q-1){
        System.out.print ("\n");
        }
        }
     in.close();




    }
}