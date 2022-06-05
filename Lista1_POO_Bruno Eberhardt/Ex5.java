import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {
        int numero = 0;
        int menorNumero = 0;
        int maiorNumero = 0;
        int qtdNumeros = 0;
        float mediaNumeros = 0;
        int somaNumeros = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os numeros: \nPara parar digite: -1"));
            if(numero != -1){
                qtdNumeros += 1;
                somaNumeros += numero;
                if(numero < menorNumero){
                    menorNumero = numero;
                }
                if(numero > maiorNumero){
                    maiorNumero = numero;
                }
            }
        }while(numero != -1);
        mediaNumeros = (somaNumeros/qtdNumeros);
        System.out.println(menorNumero);
        System.out.println(maiorNumero);
        System.out.println(qtdNumeros);
        System.out.println(mediaNumeros);//Não entendi o motivo de media não mostrar numeros com virgula.
    }
}