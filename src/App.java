import java.util.Scanner;

/* Nome do Aluno: Geliel Raynne
* RA:13523114449
* Nome do Programa:Imprimir o maior de dois numeros
* Data:16/04/2023
*/
public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("escreva o numeroA");
        int numeroA = teclado.nextInt();

        System.out.println("escreva o numeroB");
        int numeroB = teclado.nextInt();

        if (numeroA > numeroB) {
            System.out.println("O numero  " + numeroA + " é maior que o numero " + numeroB);

        } else
            System.out.println("O numero  " + numeroB + " é maior que o numero " + numeroA);

    }

}