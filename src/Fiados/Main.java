package Fiados;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;
class Main {

    public static void main(String[] args) {

        ArrayList<Integer> fiados = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        Boolean continua = true;
        System.out.println("Informe seu nome: ");
        String nameClient = scanner.nextLine();

        do {
            System.out.println("Informe o valor: ");
            int value = Integer.valueOf(scanner.nextLine());

            if (value > 0){
                fiados.add(value);
            }else{
                System.out.println("Valor inválido, informe valores positivos!");
            }


            System.out.println("Deseja continuar informando valores? - 1-Sim 2-Não");
            int response = Integer.valueOf(scanner.nextLine());
            if (response == 2){
                continua = false;
            }
        }while (continua);

        int sumTotal = sumFor(fiados);
        System.out.println(sumTotal);


    }


    public static int sumFor(ArrayList<Integer> fiados){
        int total =0;
        for (int cont=0; cont<fiados.size(); cont++) {
            total += fiados.get(cont);
        }
        return total;
    }
    public static int sumForEach(ArrayList<Integer> fiados){
        int total =0;
        for (int fiadosEach:fiados) {
            total += fiados.get(fiadosEach);
        }
        return total;
    }
    public static int sumWhile(ArrayList<Integer> fiados){
        int total = 0;
        int cont =0;
        while(cont < fiados.size()){
            total += fiados.get(cont);
        }
        return total;
    }



}