
package jokenpo;

import java.util.Scanner;
import java.util.Random;


public class Jokenpo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("VAMOS JOGAR PEDRA, PAPEL E TESOURA");
        System.out.println("====================================");
        System.out.println("SUAS OPÇÔES");
        System.out.println("[ 0 ] Pedra\n"
                + "[ 1 ] Papel\n"
                + "[ 2 ] Tesoura");
        System.out.println("====================================");
        System.out.print("Qual sua jogada? ");
        int jogador = teclado.nextInt();
        System.out.println("====================================");
        
        //geração aleatória da opção do computador
        Random aleatorio = new Random();
        int computador = aleatorio.nextInt(3);
            
        switch (jogador) {
            // Switch caso o jogador jogue PEDRA..
            case 0:
                switch (computador) {
                    // Switch caso o COMPUTADOR jogue PEDRA..
                    case 0:
                        System.out.println("Jogador jogou PEDRA..");
                        System.out.println("====================================");
                        System.out.println("Computador jogou PEDRA..");
                        System.out.println("====================================");
                        System.out.println("EMPATOU..");
                        System.out.println("====================================");
                        break;
                    // Switch caso o COMPUTADOR jogue PAPEL..
                    case 1:
                        System.out.println("Jogador jogou PEDRA..");
                        System.out.println("====================================");
                        System.out.println("Computador jogou PAPEL..");
                        System.out.println("====================================");
                        System.out.println("Computador Vence..");
                        System.out.println("====================================");
                        break;
                    // Switch caso o COMPUTADOR jogue TESOURA..
                    default:
                        System.out.println("Jogador jogou PEDRA..");
                        System.out.println("====================================");
                        System.out.println("Computador jogou TESOURA..");
                        System.out.println("====================================");
                        System.out.println("Jogador venceu..");
                        System.out.println("====================================");
                        break;
                }
            break;
            // Switch caso o jogador jogue PAPEL..
            case 1:
                switch (computador) {
                    // Switch caso o COMPUTADOR jogue PEDRA..
                    case 0:
                        System.out.println("Jogador jogou PAPEL..");
                        System.out.println("====================================");
                        System.out.println("Computador jogou PEDRA..");
                        System.out.println("====================================");
                        System.out.println("Jogador VENCEU..");
                        System.out.println("====================================");
                        break;
                    // Switch caso o COMPUTADOR jogue PAPEL..
                    case 1:
                        System.out.println("Jogador jogou PAPEL..");
                        System.out.println("====================================");
                        System.out.println("Computador jogou PAPEL..");
                        System.out.println("====================================");
                        System.out.println("EMPATOU..");
                        System.out.println("====================================");
                        break;
                    // Switch caso o COMPUTADOR jogue TESOURA..
                    default:
                        System.out.println("Jogador jogou PAPEL..");
                        System.out.println("====================================");
                        System.out.println("Computador jogou TESOURA..");
                        System.out.println("====================================");
                        System.out.println("Computador venceu..");
                        System.out.println("====================================");
                        break;
                }
            break;
            // Switch caso o jogador jogue TESOURA..
            case 2:
                switch (computador) {
                    // Switch caso o COMPUTADOR jogue PEDRA..
                    case 0:
                        System.out.println("Jogador jogou TESOURA..");
                        System.out.println("====================================");
                        System.out.println("Computador jogou PEDRA..");
                        System.out.println("====================================");
                        System.out.println("Computador venceu..");
                        System.out.println("====================================");
                        break;
                    // Switch caso o COMPUTADOR jogue PAPEL..
                    case 1:
                        System.out.println("Jogador jogou TESOURA..");
                        System.out.println("====================================");
                        System.out.println("Computador jogou PAPEL..");
                        System.out.println("====================================");
                        System.out.println("Jogador venceu..");
                        System.out.println("====================================");
                        break;
                    // Switch caso o COMPUTADOR jogue TESOURA..
                    default:
                        System.out.println("Jogador jogou TESOURA..");
                        System.out.println("====================================");
                        System.out.println("Computador jogou TESOURA..");
                        System.out.println("====================================");
                        System.out.println("EMPATOU..");
                        System.out.println("====================================");
                        break;
                }
            break;
                 default:
                    break;
        }
    }
    
}
