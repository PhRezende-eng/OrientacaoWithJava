package exercicio4;


import javax.swing.JOptionPane;


public class atividade4 {
    static int a0;
    static int n;
    static int r;
    static int pa[]; //referencia para um vetor de inteiros
    public static void main (String[] args) {
        //1o passso:ler os termos da PA
        //leitura usando componente gráfico

        String strA0 = JOptionPane.showInputDialog("Informe o primeiro termo: ");
        a0 = Integer.parseInt(strA0);

        String strN = JOptionPane.showInputDialog("Informe o primeiro termo: ");
        n = Integer.parseInt(strN);

        String strR = JOptionPane.showInputDialog("Informe o primeiro termo: ");
        r = Integer.parseInt(strR);

        pa = new int[n];
    }
}