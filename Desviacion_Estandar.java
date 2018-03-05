
/**
 * Escriba un programa en Java que lea un conjunto de n números double, los almacene en un arreglo o
 * lista, y luego calcule la desviación estándar de esos números, representada por la siguiente expresión 
 * matemática: 𝜎 = √(1/(n-1))∑ (𝑥𝑖 − 𝑥̅)^2 Donde xi representa cada uno de los elementos almacenados en el arreglo o lista. 𝑥̅ representa el
 * promedio de los elementos del arreglo o lista y n es el número de elementos en el arreglo.
 */
public class StandardDeviation {
 
 public static void main(String[] args) {
 
  double[] numbers = new double[10];
 
  // Toma los 10 números en un listado
  // a los cuales se le calculará la desviación estándar
  numbers[0] = 23;
  numbers[1] = 92;
  numbers[2] = 46;
  numbers[3] = 55;
  numbers[4] = 63;
  numbers[5] = 94;
  numbers[6] = 77;
  numbers[7] = 38;
  numbers[8] = 84;
  numbers[9] = 26;
 
  System.out.println("1. Obtenga la media de los números. La media es : ");
 
  double sum = 0;
 
  // Media de los números
  for(int i =0; i< numbers.length; i++) {
   sum = sum + numbers[i];
  }
 
  double mean = sum/numbers.length;
 
  System.out.println(mean);
 
  System.out.println("\n2. Obtener la desviación de la media de cada número : ");
 
  double[] deviations = new double[10];
 
  // Calculando la desviación de la media para cada uno de los números
  for(int i = 0; i < deviations.length; i++) {
   deviations[i] = numbers[i] - mean ; 
   System.out.printf("%2.2f",deviations[i]);
   System.out.print(" ");   
  }
 
  System.out.println();
  System.out.println("\n3. Raíz cuadrada de las desviaciones : ");
  double[] squares = new double[10];
 
  // Raíz cuadrada de las desviaciones
  for(int i =0; i< squares.length; i++) {
   squares[i] = deviations[i] * deviations[i];
   System.out.printf("%4.2f",squares[i]);
   System.out.print(" ");
  }
 
  System.out.println();
  System.out.println("\n4. Obtener la suma de las raíces cuadradas : ");
 
  sum = 0;
 
  // Añadiendo las raíces cuadradas
  for(int i =0; i< squares.length; i++) {
   sum = sum + squares[i];
  }
 
  System.out.println(sum);
 
  // Dividiendo los números por n - 1
  System.out.println("\n5. Divide la suma de los cuadrados por (n) - 1 : ");
  double result = sum / (numbers.length - 1);
 
  System.out.printf("%4.2f",result);
 
  double standardDeviation = Math.sqrt(result);
   
  // La raíz cuadrada del resultado es la desviación estándar
  System.out.println("\n\n6. Toma la raíz cuadrada del resultado lo cual da");
  System.out.println("La Desviación Estándar de los 10 números : ");
  System.out.printf("%4.2f",standardDeviation);
 
 }
 
}

