package ExerciciosGeradosPorIA;
/* > Exercício 1: Inverter Elementos de um Array

Crie um programa que receba um array de inteiros do usuário
e inverta a ordem dos elementos.
Exiba o array original e o array invertido.

        [1, 2, 3]
        [3, 2, 1]
        [3, 2 ,
*/
public class Ex002 {
    public static void main(String[] args) {
        int[] arrayOriginal = {1,2,3};
        int[] arrayCopia = new int[3];
        int inicio = 0;

        for(int contador = arrayOriginal.length - 1 ; contador >= 0; contador--) {
            System.out.println("contador: " + contador);
            arrayCopia[inicio] = arrayOriginal[contador];
            inicio++;
        }
        System.out.println(arrayCopia[0]);
        System.out.println(arrayCopia[1]);
        System.out.println(arrayCopia[2]);
    }
}
