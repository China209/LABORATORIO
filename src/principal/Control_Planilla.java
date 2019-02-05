/*
 * 
 * 
 * Fecha: 05/02/2019
 */
package principal;

import Clases.Llenado_Planilla;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Control_Planilla {

    public static Llenado_Planilla lp = new Llenado_Planilla();

    public static void main(String[] args) {
        int iOpcion;
        int iFila = 10;
        int iColumna = 6;
        int iDeptos[] = new int[5];
        String[][] sPlanilla = new String[iFila][iColumna];
        do {
            iOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Ingreso de Datos\n2.Mostrar Datos\n0.Salir", "MENÚ", JOptionPane.PLAIN_MESSAGE));
            menu(iOpcion, iFila, iColumna, sPlanilla, iDeptos);
        } while (iOpcion != 0);
        System.exit(0);

    }

    public static void menu(int iOpcion, int iFila, int iColumna, String[][] sPlanilla, int[] iDeptos) {
        switch (iOpcion) {
            case 1:
                lp.Llenado_Auto(sPlanilla, iFila, iColumna, iDeptos);
                break;
            case 2:
                System.out.print("NOMBRE\t\t" + "SUELDO BASE\t" + "DEDUCCIONES\t" + "PERCEPCIONES\t" + "SUELDO LIQUIDO\t" + "DEPTO." + "\n");

                for (int i = 0; i < iFila; i++) {
                    for (int j = 0; j < iColumna; j++) {
                        System.out.print(sPlanilla[i][j] + "\t" + "\t");
                    }
                    System.out.print("\t" + "\n");
                }
                System.out.println("Departamentos");
                for (int j = 0; j < 5; j++) {
                    System.out.print(iDeptos[j] + "\t" + "\t");
                }

                break;
            case 0:
                System.out.println("----------SALIENDO DEL PROGRAMA----------");
                break;
        }
    }

}
