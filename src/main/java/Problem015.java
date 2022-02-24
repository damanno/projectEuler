
import com.sun.xml.internal.ws.util.StringUtils;
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

        List<String> combinacoes = new ArrayList<>();
        String binarioMaximo = "";

        for (i = 0; i < total; i++) {
            binarioMaximo += "1";
        }

        long maxValue = new BigInteger(binarioMaximo, 2).longValue();

        BigInteger tamanho = new BigInteger(String.valueOf(i), 10);

        for (i = 0; i < maxValue; i++) {

            BigInteger binario = new BigInteger(String.valueOf(i), 10);
            String number = binario.toString(2);
            Integer soma = 0;

            for (int size = 0; size < number.length(); size++) {
                soma += Integer.parseInt(String.valueOf(number.charAt(size)));
            }

            if (soma == x) {
                combinacoes.add(number);
            }

        }
        return combinacoes.size();
    }

}
