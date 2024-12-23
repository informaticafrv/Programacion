/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.funciones;

/**
 *
 * @author franc
 */
public class CuentaNumeros {

    public static int digitos(int num) {
        boolean encontrado = false;
        int digitos = 0;

        while (!encontrado) {
            num = num / 10;
            digitos++;
            if (num == 0) {
                encontrado = true;
            }
        }
        return digitos;
    }
}
