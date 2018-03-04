
/**
 * Escriba un programa en Java que permita crear dos vectores o listas A y B de tamaños N y P
 * respectivamente, y a partir de estos dos, crear un tercer vector o lista C, el cual contengo los elementos
 * no comunes (no repetidos) de A y B, sin que queden valores repetidos en C.
 * Ejemplo: Si A es [1, 4, 5, 8, 9] y B es [1, 5, 6, 7, 8, 11, 20]
 * El resultado, C, sería: [4, 6, 7, 9, 11, 20]. Nótese que los elemento 1, 5 y 8 no están en el vector resultado,
 * ya que están repetidos en ambos vectores.
 */
 
import java.util.Scanner;
public class Comparacion_Vectores
{
    public static void main(String Args[])      
    {
        System.out.println("El siguiente programa permite crear dos vectores A y B, los compara entre si y muestra los elementos no comunes");
	System.out.println();
    Comparacion_Vectores vectores = new Comparacion_Vectores();
    // Metodo
    vectores.solicitarDatos();
    }
    public void solicitarDatos()
    {
        Scanner tecla = new Scanner(System.in);
        int [] vector_A;
        int [] vector_B;
        int [] vector_C;
        
        System.out.print("Digitar tamaño primera lista: ");
        int tamano_1 = tecla.nextInt();
        vector_A = new int[tamano_1];
        int cual_1 = 1;
        System.out.print("Digitar tamaño segunda lista: ");
        int tamano_2 = tecla.nextInt();
        vector_B = new int[tamano_2];
        int cual_2 = 2;
        System.out.println();
        vector_A = deligenciasArreglos(vector_A, tamano_1, cual_1);
        vector_B = deligenciasArreglos(vector_B, tamano_2, cual_2);
        // Comparar el largo del los arreglos y tomar el menor
        int tamano_3;
        if(vector_A.length < vector_B.length)
        {
        tamano_3 = vector_A.length;
        }
        else
        {
        tamano_3 = vector_B.length;
        }
        vector_C = new int[tamano_3];
        vector_C = compararArreglos(vector_A, vector_B, tamano_3);
        System.out.println("Los datos en común entre los vectores son: ");
        for(int i = 0; i < vector_C.length; i++)
        {
        System.out.println(vector_C[i]+" es un número en común");
        }
        }
        public int[] deligenciasArreglos(int [] a, int b, int c)
        {
        Scanner tecla = new Scanner(System.in);
        int [] arreglo;
        arreglo = new int[b];
        for(int i = 0; i < b; i++)
        {
        System.out.print("Digite el contenido de la lista "+c+": ");
        arreglo[i] = tecla.nextInt();
        }
        System.out.println();
        return arreglo;
    }
    public int[] compararArreglos(int [] a1, int [] b2, int c3)
    {
    int [] resultadoComparacion;
    resultadoComparacion = new int[c3];
    for(int i = 0; i < c3; i++)
    {
    for(int j = 0; j < c3; j++)
    {
    if(a1[i] == b2[j])
    {
    resultadoComparacion[i]=a1[i];
    }
    }
    }
    return resultadoComparacion;
    }
}