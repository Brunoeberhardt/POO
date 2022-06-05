import javax.swing.JOptionPane;

class Ex1 {
    public static void main(String[] args) {
        float valorGasosa = Float.parseFloat(JOptionPane.showInputDialog(null,"Qual o preco da gasolina?"));
        float valorEtanois = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o preco do etanol?"));
        float resultadoDivisao = valorEtanois / valorGasosa;
        if(resultadoDivisao <= 0.7){
            JOptionPane.showMessageDialog(null, "Abasteca com etanol");
        }else {
            JOptionPane.showMessageDialog(null, "Abasteca com gasolina");
        }
    }
}