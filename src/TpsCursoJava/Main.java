package TpsCursoJava;

public class Main {
    /*
    1- Escriba un programa Java para encontrar el valor máximo y mínimo de un arreglo.
    2- Escribir un programa Java para revertir un arreglo de valores enteros
    3 - Escriba un programa Java para encontrar el segundo elemento más grande en un vector.
    4. Leer los datos correspondiente a dos vectores de 12 elementos numéricos, y mezclarlos en un tercero de la forma: 3 del vector A, 3 del B, otros 3 del A, otros 3 del B, etc.
    5. Crear un programa que lea por teclado un arreglo de 10 números enteros. Luego desplace una posición hacia abajo cada uno de los elementos: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.
     */

    //RECORDAR index!=length
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 10, 11, 12};
        System.out.println("valor maximo: " + valMax(arr));
        System.out.println("valor minimo: " + valMin(arr));

        mostrarArray(arr);
        revertir(arr);
        System.out.println("Segundo mas grande: " + segundoMasGrande(arr));
        intercalar(arr, arr2);
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

    public static void revertir(int[] arr) {

        int[] revert = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revert[j] = arr[i];
            j++;
        }

        mostrarArray(revert);
    }

    public static void mostrarArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);

        }
        System.out.printf("\n");
    }

    //    3 - Escriba un programa Java para encontrar el segundo elemento más grande en un vector.
    public static int segundoMasGrande(int[] arr) {
        int segundo = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else {
                segundo = arr[i];
            }
        }
        return segundo;
    }

    //    4. Leer los datos correspondiente a dos vectores de 12 elementos numéricos,
    //    y mezclarlos en un tercero de la forma: 3 del vector A, 3 del B, otros 3 del A, otros 3 del B, etc.
    public static void intercalar(int[] arr1, int[] arr2) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int[] arr2 = {7, 8, 9, 10, 11, 12};
        int sumaTamArrays = arr1.length + arr2.length;
        int[] arr3 = new int[sumaTamArrays];
        System.out.println(sumaTamArrays);
        int indice1 = 0;
        int indice2 = 0;
        for (int i = 0; i < sumaTamArrays; i++) {
            int in_parray = 0;
            int in_sarray = 0;
            int next_value_p = 3;
            int next_value_s = 3;

            for (int x = 0; x < arr3.length; x++) {

                if (in_parray >= next_value_p && in_sarray >= next_value_s) {
                    next_value_p += 3;
                    next_value_s += 3;
                }

                if (in_parray < next_value_p && in_parray < arr1.length) {
                    arr3[x] = arr1[in_parray];
                    in_parray = in_parray + 1;
                } else if (in_sarray < next_value_s && in_sarray < arr2.length) {
                    arr3[x] = arr2[in_sarray];
                    in_sarray = in_sarray + 1;
                }

            }


        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("%d ", arr3[i]);

        }
        System.out.printf("\n");
    }


}
