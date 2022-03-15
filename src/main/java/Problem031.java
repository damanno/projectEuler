/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author damanno
 */
public class Problem031 {

    public static int[] poundCoins = {1, 2, 5, 10, 20, 50, 100, 200};
    
    public static int totalCoinSum() {

        int total = 200;
        int[] coinBination = new int[total+1];
        int coin;
        
        coinBination[0] = 1;
        for (int i = 0 ; i< poundCoins.length-1; i++) {
            coin = poundCoins[i];
            for (int j = coin ; j<= total; j++) {
                coinBination[j] += coinBination[j-coin];
            }
        }

        return coinBination[200]++;
    }

    public static int coinSum() {
        return 1;
    }

}
