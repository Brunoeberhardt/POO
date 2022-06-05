import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        int a = 1   ;
        int b = 0;
        int aux = 0;
        int numeroN = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual posicao da sequencia de fibonacci deseja ver:"));
        for(int i=0; i<30; i++){
            if(numeroN - 1 ==i){
                System.out.println(a);
            }
            aux = a;
            a = a + b;
            b = aux;
            
        }
    }
}
