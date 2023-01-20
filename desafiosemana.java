package exercicios.desafiomodulo;

import java.util.Scanner;

public class desafiosemana {
    public static void main(String[] args) {
        
        // DIGITE O DIA DA SEMANA - RETORNA NUMERO QUE O REPRESENTA

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do dia da semana: ");
        String dayname = scan.next();
        scan.close();

        int domingo = 1;
        int segunda = 2;
        int terca = 3;
        int quarta = 4;
        int quinta = 5;
        int sexta = 6;
        int sabado = 7;

        if(dayname.equals("domingo")){
            System.out.println("O numero equivalente ao dia é: " + domingo);
        }else if(dayname.equals("segunda")){
            System.out.println("O numero equivalente ao dia é: " + segunda);
        }else if(dayname.equals("terca")){
            System.out.println("O numero equivalente ao dia é: " + terca);
        }else if(dayname.equals("quarta")){
            System.out.println("O numero equivalente ao dia é: " + quarta);
        }else if(dayname.equals("quinta")){
            System.out.println("O numero equivalente ao dia é: " + quinta);
        }else if(dayname.equals("sexta")){
            System.out.println("O numero equivalente ao dia é: " + sexta);
        }else if(dayname.equals("sábado")){
            System.out.println("O numero equivalente ao dia é: " + sabado);
        }
    }
}
