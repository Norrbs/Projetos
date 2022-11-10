/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {2, 10, -8, 7, -3, 0};

        int count = 0;
        System.out.print("Vetor: ");
        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1) ; i >= 0 ; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
