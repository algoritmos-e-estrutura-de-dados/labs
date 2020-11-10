package warmups;

public class Cedulas {

    public static void main(String args[]) {
        if (args.length > 0) {
            int valor = Integer.valueOf(args[0]);
            System.out.format("R$ %,8d%n", valor); // --> " 461,012"
            System.out.println("R$ " + valor);
            int nota_100 = (valor / 100);
            System.out.println(nota_100 + " nota(s) de R$ 100,00");
            int nota_50 = ((valor % 100) / 50);
            System.out.println(nota_50 + " nota(s) de R$ 50,00");
            int nota_20 = ((valor % 50) / 20);
            System.out.println(nota_20 + " nota(s) de R$ 20,00");
            int nota_10 = ((valor % 20) / 10);
            System.out.println(nota_10 + " nota(s) de R$ 10,00");
            int nota_5 = ((valor % 10) / 5);
            System.out.println(nota_5 + " nota(s) de R$ 5,00");
            int nota_2 = ((valor % 5) / 2);
            System.out.println(nota_2 + " nota(s) de R$ 2,00");
            int nota_1 = ((valor % 2) / 1);
            System.out.println(nota_1 + " nota(s) de R$ 1,00");
        } else {
            System.out.println("O programa precisa de 1 argumento!");
        }
    }

}
