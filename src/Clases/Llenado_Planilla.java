package Clases;

import javax.swing.JOptionPane;

public class Llenado_Planilla {

    public void Llenado_Auto(String[][] sPlanilla, int iFila, int iColumna, int[] iDeptos) {
        for (int i = 0; i < iFila; i++) {
            for (int j = 0; j < iColumna; j++) {
                if (j == 0) {
                    sPlanilla[i][j] = JOptionPane.showInputDialog(null, "Empleado #" + (i + 1), "Ingreso de Nombre Empleados", JOptionPane.PLAIN_MESSAGE);
                }
                if (j == 1 || j == 2 || j == 3) {
                    sPlanilla[i][j] = Integer.toString((int) (Math.random() * (5000 - 2000) + 2000));
                }
                if (j == 4) {
                    sPlanilla[i][j] = Integer.toString(Integer.parseInt(sPlanilla[i][1]) - Integer.parseInt(sPlanilla[i][2]) + Integer.parseInt(sPlanilla[i][3]));
                }
                if (j == 5) {
                    sPlanilla[i][j] = Integer.toString(1 + (int) (Math.random() * 5));
                    if (Integer.parseInt(sPlanilla[i][j]) == 1) {
                        iDeptos[0] += Integer.parseInt(sPlanilla[i][4]);
                    }
                    if (Integer.parseInt(sPlanilla[i][j]) == 2) {
                        iDeptos[1] += Integer.parseInt(sPlanilla[i][4]);
                    }
                    if (Integer.parseInt(sPlanilla[i][j]) == 3) {
                        iDeptos[2] += Integer.parseInt(sPlanilla[i][4]);
                    }
                    if (Integer.parseInt(sPlanilla[i][j]) == 4) {
                        iDeptos[3] += Integer.parseInt(sPlanilla[i][4]);
                    }
                    if (Integer.parseInt(sPlanilla[i][j]) == 5) {
                        iDeptos[4] += Integer.parseInt(sPlanilla[i][4]);
                    }
                }

            }
        }
    }
}
