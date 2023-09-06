import javax.swing.JOptionPane;


public class Projeto {
    public static void main (String[] args){
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano"));
        if (((ano % 4 == 0)) && (ano %100 !=0) || (ano % 400 == 0))
         
        {

           JOptionPane.showMessageDialog(null,"é um ano bissexto");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "não é um ano bissexto");
        }

    }
}
