package S4A1;

import javax.swing.JOptionPane;

public class Exercicio28_20250408111842 {

    public static void main(String[] args) {
        int A[][] = new int[3][3];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha " + i + " e coluna " + j + ":"));
            }
        }

        // Exercício A
        int resp_a = 0;
        for (i = 0; i < 3; i++) {
            resp_a += A[i][0];
        }
        JOptionPane.showMessageDialog(null, "a) Soma dos elementos da primeira coluna: " + resp_a);

        // Exercício B
        int vetor_b[] = new int[3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                vetor_b[i] += A[j][i];
            }
        }
        JOptionPane.showMessageDialog(null, "b)\nColuna 0: " + vetor_b[0] + "\nColuna 1: " + vetor_b[1] + "\nColuna 2: " + vetor_b[2]);

        // Exercício C
        int produto_c = 1;
        for (j = 0; j < 3; j++) {
            produto_c *= A[0][j];
        }
        JOptionPane.showMessageDialog(null, "c) Produto dos elementos da primeira linha: " + produto_c);

        // Exercício D
        int soma_matriz = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                soma_matriz += A[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "d) Soma de todos os elementos: " + soma_matriz);

        // Exercício E
        int media_matriz = soma_matriz / 9;
        JOptionPane.showMessageDialog(null, "e) Média dos elementos da matriz: " + media_matriz);

        // Exercício F
        String maiores_media = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] > media_matriz) {
                    if (!maiores_media.equals("")) {
                        maiores_media += ", ";
                    }
                    maiores_media += A[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "f) Elementos maiores que a média:\n" + maiores_media);

        // Exercício G
        int maior = A[0][0];
        int lin_maior = 0, col_maior = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] > maior) {
                    maior = A[i][j];
                    lin_maior = i;
                    col_maior = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "g) Maior elemento da matriz: " + maior + "\nLinha: " + lin_maior + "\nColuna: " + col_maior);

        // Exercício H
        int menor = A[0][0];
        int lin_menor = 0, col_menor = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (A[i][j] < menor) {
                    menor = A[i][j];
                    lin_menor = i;
                    col_menor = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "h) Menor elemento da matriz: " + menor + "\nLinha: " + lin_menor + "\nColuna: " + col_menor);
    }
}
