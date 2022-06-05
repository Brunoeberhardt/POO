import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];

        for(int i=0; i<vetor1.length; i++){
            for(int j=9; j>0; j--){// <--------------
            vetor1[i] =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero"));
            vetor2[j] = vetor1[i];
            System.out.println(vetor1[i]);
            System.out.println(vetor2[j]);//Fiz esse print pra ver se estava correto, de acordo com ele o vetor2 na posicao 9 é o mesmo valor do vetor1 na posicao 0.
            break;
            }

        }
        for(int i=0; i<vetor1.length; i++){
            System.out.println(vetor1[i]);
        }
        for(int j=0; j<vetor1.length; j++){
            System.out.println(vetor2[j]); //Porém quando eu dou print após o for todos os valores do vetor estão como 0. Isso é culpa daquele j--?
        }
    }
}
