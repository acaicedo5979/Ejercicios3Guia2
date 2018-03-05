
/**
 * Escriba un programa en Java que permita crear dos vectores o listas A y B de tamaños N y P
 * respectivamente, y a partir de estos dos, crear un tercer vector o lista C, el cual contengo los elementos
 * no comunes (no repetidos) de A y B, sin que queden valores repetidos en C.
 * Ejemplo: Si A es [1, 4, 5, 8, 9] y B es [1, 5, 6, 7, 8, 11, 20]
 * El resultado, C, sería: [4, 6, 7, 9, 11, 20]. Nótese que los elemento 1, 5 y 8 no están en el vector resultado,
 * ya que están repetidos en ambos vectores.
 */
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Comparacion_Vectores {
    public static void main(String[]args){
        int n, m, i, k, dif;
    Scanner leer = new Scanner(System.in);
    int[] c; 
    System.out.print("Número de elementos del vector A: ");
    n=leer.nextInt();
    System.out.print("Número de elementos del vector B: ");
    m=leer.nextInt();
    int a[] = new int [n];
    for(i=0;i<n;i++){
        System.out.print("Elemento del vector A: ["+i+"]");
        a[i]=leer.nextInt();
    }
    int b[] = new int [m];
    for(k=0;k<m;k++){
        System.out.print("Elemento del vector B: ["+k+"]");
        b[k]=leer.nextInt();
    }
    int aux = 0;
    dif = 0;
    for (int d=0; d<m; d++){
        aux = b[d];
        if(!duplicado(aux, a)){
            dif++;
        }
            }
    System.out.println("El tamaño del vector resultante C es "+ (dif+n));
    c = new int [dif + n];
    System.arraycopy(a, 0, c, 0, a.length); 
    aux=0;
    int g = 0;
    for(i = 0; i < b.length; i++){
        aux = b[i];
        if(!duplicado(aux, a)){
             c[a.length+g] = aux;
             g++;
        }
     }
    for (int j=0; j < c.length; j++) {
         System.out.println("C["+j+"]: "+c[j]);
     }
    } 
    public static boolean duplicado(int a, int array[]){
    int index; 
    Arrays.sort(array);
        index=Arrays.binarySearch(array, a);
    if(index < 0){
            return false;
    }else if (index >= 0){
            return true;
    }
            return false;
    }
}