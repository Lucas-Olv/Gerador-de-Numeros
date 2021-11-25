import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Questao03 {
    public static void main(String[] args) {

        /*OBS: Quando o algorítmo gerar um array vazio significa que o primeiro número gerado já era negativo, portanto ele o remove do array para garantir que apenas positivos fiquem presentes, resultando em um array vazio.
        */
        int x = 0;
        int checkInterval = 0;
        List<Integer> values = new ArrayList<>();
        List<Integer> interval = new ArrayList<>();
        Random generator = new Random();

        //Gera os índices do arrayList usado para armazenar a quantidade de números no intervalo.
        for (int i = 1; i <= 4; i++) {
            interval.add(0);
        }

        //Cria a lista de números aleatórios e para quando um número negativo é gerado.
        for (;;) {
            values.add(generator.nextInt(-5, 100));
            if (values.get(x) < 0) {
                values.remove(x);
                break;
            }else {
                x++;
            }
        }

        // Conta quantos números da lista gerada estão em cada intervalo definido.
        for (int i = 0; i < values.size(); i++) {
            if ((values.get(i) >= 0) && (values.get(i) <= 25)) {
                checkInterval = interval.get(0);
                checkInterval++;   
                interval.set(0, (checkInterval));

            } else if ((values.get(i) >= 26) && (values.get(i) <= 50)) {
                checkInterval = interval.get(1);
                checkInterval++;   
                interval.set(1, checkInterval); 

            } else if ((values.get(i) >= 51) && (values.get(i) <= 75)) {
                checkInterval = interval.get(2);
                checkInterval++;   
                interval.set(2, checkInterval);

            } else if ((values.get(i) >= 76) && (values.get(i) <= 100)) {
                checkInterval = interval.get(3);
                checkInterval++;   
                interval.set(3, checkInterval); 
            }
        }
        System.out.println("Os números gerados são: " + values.toString());
        System.out.println("A quantidade de números no intervalo 0 - 25 é " + interval.get(0));
        System.out.println("A quantidade de números no intervalo 26 - 50 é " + interval.get(1));
        System.out.println("A quantidade de números no intervalo 51 - 75 é " + interval.get(2));
        System.out.println("A quantidade de números no intervalo 76 - 100 é " + interval.get(3));       
    }
}
