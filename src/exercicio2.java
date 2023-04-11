/* Nome do Aluno: Nathan Almeida Gois
* RA: 722311425
* Nome do Programa: . 2. Construa um programa que receba como entrada três valores A, B
e C e os imprima em ordem crescente.
* Data: 10/04/2023
*/
import java.text.Format;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) throws Exception {

        int A,B,C;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Me informe número A");
        A = teclado.nextInt();
        System.out.println("Me informe número B");
        B = teclado.nextInt();
        System.out.println("Me informe número C");
        C = teclado.nextInt();
        teclado.close();
    
        if(A > B) {
            if(B < C) {
                System.out.println(A+"-"+B+"-"+C);
            }
            else if (A < C) {
                System.out.println(A+"-"+C+"-"+B);
            } else{
                System.out.println(C+"-"+A+"-"+B);
            }
        }
        else if(B < C){
            if(A < C){
                System.out.println(B+"-"+A+"-"+C);
            } else{
                System.out.println(B+"-"+C+"-"+A);
            } 
            }
            else{
                System.out.println(C+"-"+B+"-"+A);
            }
        }
}
