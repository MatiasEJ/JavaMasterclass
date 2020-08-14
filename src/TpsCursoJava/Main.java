package TpsCursoJava;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    //RECORDAR index!=length
    public static void main(String[] args) {
        int[] vector;
        int[] vector2;
        int opt = opciones();


        while (opt != 6) {
            switch (opt) {
                case 1:
                    //1- Escriba un programa Java para encontrar el valor máximo y mínimo de un arreglo.
                    ejercicio1();
                    break;
                case 2:
                    //2- Escribir un programa Java para revertir un arreglo de valores enteros
                    revertir();
                    break;
                case 3:
                    //3 - Escriba un programa Java para encontrar el segundo elemento más grande en un vector.
                    segundoMasGrande();
                    break;
                case 4:
                    //4. Leer los datos correspondiente a dos vectores de 12 elementos numéricos,
                    // y mezclarlos en un tercero de la forma: 3 del vector A, 3 del B, otros 3 del A, otros 3 del B, etc.
                    intercalar();
                    break;

                case 5:
                    //5. Crear un programa que lea por teclado un arreglo de 10 números enteros.
                    // Luego desplace una posición hacia abajo cada uno de los elementos: el primero pasa a ser
                    // el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.
                    desplazar();

                    break;
                default:
                    break;
            }
            opt = opciones();
        }
    }



    public static int opciones() {
        String[] options = {"1", "2", "3", "4", "5", "6"};
        String st =  (String) JOptionPane.showInputDialog(null,
                "1.- Valor Max y Min" + "\n" +
                        "2.- Revertir Arreglo" + "\n" +
                        "3.- Segundo Elemento mas grande" + "\n" +
                        "4.- Intercalar Vectores" + "\n" +
                        "5.- Ultimo es el primero" + "\n" +
                        "6.- Salir" + "\n",
                "Ejercicios", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);


        if (st == null) {
            return 6;
        } else {
            return Integer.parseInt(st);

        }
    }

    public static int[] tomarArray() {
        String tamArray;
        int tamArr;
        tamArray = JOptionPane.showInputDialog(null, "Ingrese tamaño array");
        tamArr = Integer.parseInt(tamArray);
        int[] arr = new int[tamArr];
        for (int i = 0; i < arr.length; i++) {
            tamArray = JOptionPane.showInputDialog(null, "Dato " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(tamArray);

        }
        return arr;
    }
    public static void ejercicio1(){

        int[]vector = tomarArray();
        JOptionPane.showMessageDialog(null,
                "Valor Max: " + valMax(vector) + "\n" +
                        "Valor Min: " + valMin(vector) + "\n");
    }
    public static int valMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int s : arr) {
            if (s > max) {
                max = s;
            }
        }
        return max;

    }

    public static int valMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int s : arr) {
            if (s < min) {
                min = s;
            }
        }
        return min;
    }

    public static void revertir() {

        int[] arr = tomarArray();
        int[] revert = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revert[j] = arr[i];
            j++;
        }
        JOptionPane.showMessageDialog(null,
                "Revertir: " + Arrays.toString(revert) + "\n");
    }

//    public static void mostrarArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%d ", arr[i]);
//        }
//        System.out.printf("\n");
//    }

    public static void segundoMasGrande() {
        int [] arr = tomarArray();
        Arrays.sort(arr);

        JOptionPane.showMessageDialog(null,
                "Segundo mas Grande: " + arr[arr.length-2]  + "\n");

    }

    public static void  intercalar() {
        int[] arr1 = tomarArray();
        int[] arr2 =  tomarArray() ;
        int sumaTamArrays = arr1.length + arr2.length;
        int[] arr3 = new int[sumaTamArrays];
        System.out.println(sumaTamArrays);
        for (int i = 0; i < sumaTamArrays; i++) {
            int indiceArray1 = 0;
            int indiceArray2 = 0;
            int next_value_p = 3;
            int next_value_s = 3;
            for (int x = 0; x < arr3.length; x++) {
                if (indiceArray1 >= next_value_p && indiceArray2 >= next_value_s) {
                    next_value_p += 3;
                    next_value_s += 3;
                }
                if (indiceArray1 < next_value_p && indiceArray1 < arr1.length) {
                    arr3[x] = arr1[indiceArray1];
                    indiceArray1++;
                } else if (indiceArray2 < next_value_s && indiceArray2 < arr2.length) {
                    arr3[x] = arr2[indiceArray2];
                    indiceArray2++;
                }
            }
        }

        JOptionPane.showMessageDialog(null,
                "Intercalar " + Arrays.toString(arr3));
    }

    public static void desplazar() {
        int[] arr = tomarArray();
        int tamArray = arr.length;
        int[] arr2 = new int[tamArray];

        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                arr2[i] = arr[arr.length - 1];
            }
            arr2[i + 1] = arr[i];
        }
      JOptionPane.showMessageDialog(null,
                            "last first:  " + Arrays.toString(arr2));

    }

}
