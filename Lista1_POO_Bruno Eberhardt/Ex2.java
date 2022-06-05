import javax.swing.JOptionPane;

class Ex2 {
    public static void main(String[] args) {
        int valorSaque = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor deseja sacar?"));
        //int nota50 = 50;
        int qtdNotas50 = 0;
        int qtdNotas10 =0;
        int qtdNotas5 = 0;
        int qtdNotas1 = 0;
        while(valorSaque >= 50){
            valorSaque = valorSaque - 50;
            qtdNotas50 = qtdNotas50 + 1;
        }
        while(valorSaque >= 10){
            valorSaque = valorSaque - 10;
            qtdNotas10 = qtdNotas10 + 1;
        }
        while(valorSaque >= 5){
            valorSaque = valorSaque -5;
            qtdNotas5 = qtdNotas5 +1;
        }
        while(valorSaque >= 1){
            valorSaque = valorSaque -1;
            qtdNotas1 = qtdNotas1 + 1;
        }
        System.out.println("Quantidade notas de 50 reais: "+qtdNotas50+ "\nQuantidade notas de 10 reais: "+qtdNotas10+"\nQuantidade notas de 5 reais: "+qtdNotas5+"\nQuantidade notas de 1 real: "+qtdNotas1);
    }
}