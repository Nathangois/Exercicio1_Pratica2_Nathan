/* Nome do Aluno: Nathan Almeida Gois
* RA: 722311425
* Nome do Programa: . A prática deve ser feita individualmente, pode conversar,
trocar figurinhas com o colega, mas cada um faz o seu.
* Data: 10/04/2023
*/
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) throws Exception {

        double NumeroA, NumeroB;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Me informe número A");
        NumeroA = teclado.nextDouble();
        System.out.println("Me informe número B");
        NumeroB = teclado.nextDouble();
        teclado.close();
        if (NumeroA > NumeroB) {
            System.out.print("O número maior é " + NumeroA);
        }
        if (NumeroA < NumeroB) {
            System.out.print("O número maior é " + NumeroB);
        }
    }
}
