
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author damanno
 */
public class Problem015 {

    public static int routeNumberLatticePath(int x, int y) {

        long i = 0;
        int dimensions = 2;
        int total = x + y;

        int routeNumberAccepted = 0;
        int routeNumberNotAccepted = 0;
        String binarioMaximo = "";

        for (i = 0; i < total; i++) {
            binarioMaximo += "1";
        }

        long maxValue = new BigInteger(binarioMaximo, 2).longValue();

        BigInteger tamanho = new BigInteger(String.valueOf(i), 10);
        System.out.print(maxValue);

        for (i = 0; i < maxValue; i++) {

            BigInteger binario = new BigInteger(String.valueOf(i), 10);
            String number = binario.toString(2);
            Integer soma = 0;

            for (int size = 0; size < number.length(); size++) {
                soma += Integer.parseInt(String.valueOf(number.charAt(size)));
            }

            if (soma == x) {
                routeNumberAccepted++;
            } else {
                routeNumberNotAccepted++;
            }

        }

        System.out.println("rotas " + routeNumberAccepted);
        System.out.println("n rotas " + routeNumberNotAccepted);

        return routeNumberAccepted;
    }

    public static BigInteger routeNumberLatticePathCentralBinomialCoefficient(int x, int y) {

        BigInteger routeNumberAccepted = BigInteger.ZERO;

        List<BigInteger> listaA = new ArrayList<>();
        List<BigInteger> listaB = new ArrayList<>();

        listaA.add(BigInteger.ONE);
        //6 - 11

        for (int a = 0; a <= x; a++) {
            int b = 0;
            if (a == 0) {
                for (b = 0; b <= y; b++) {
                    listaA.add(BigInteger.ONE);
                    System.out.print(listaA.get(b) + " - ");
                }
                System.out.println("");
            } else {
                for (b = 0; b <= y; b++) {
                    if (b == 0) {
                        listaB.add(BigInteger.ONE);
                    } else {
                        listaB.add( listaB.get(b - 1).add(listaA.get(b)) );
                        routeNumberAccepted = listaB.get(b - 1).add(listaA.get(b));
                    }
                    System.out.print(listaB.get(b) + " - ");
                }
                System.out.println("");
                listaA.clear();
                listaA = new ArrayList<>(listaB);

                

                listaB.clear();
            }
        }

        System.out.println("");
        return routeNumberAccepted;
    }

}
