
/**
 *
 * @author damanno
 */
public class Problem028 {

    static public int[][] spiral;

    public static void runSpiral(int x) {
        generateSpiral(x);
        printSpiral(spiral);
        sumDiagonalsSpiral(spiral);
    }
    
    public static void testSpiral() {
        generateSpiral(5);
        printSpiral(spiral);
        sumDiagonalsSpiral(spiral);
    }

    public static void generateSpiral(int x) {
        int y = x;
        spiral = new int[x][y];
        int startX = (x / 2) - (x % 2 == 0 ? 1 : 0);
        int startY = (y / 2) - (x % 2 == 0 ? 1 : 0);
        int total = x * y;
        int i = 1;
        int f = 1;
        spiral[startX][startY] = f;
        f++;
        i++;
        int specialNumber = 1;
        boolean isX = true;
        boolean isPositive = true;
        int currentX = startX;
        int currentY = startY;
        while (i <= x + y) {
            //x+1 //y+1 //x-2 //y-2 //x+3 //y+3 //x-4 //...
            int flag = specialNumber * (isPositive ? 1 : -1);
            while (flag != 0 && flag <= x && flag <= y) {
                if (!isX) {
                    if (isPositive) {
                        currentX++;
                        flag--;
                    } else {
                        currentX--;
                        flag++;
                    }
                } else {
                    if (isPositive) {
                        currentY++;
                        flag--;
                    } else {
                        currentY--;
                        flag++;
                    }
                }
                if (currentX >= 0 && currentY >= 0 && currentX < x && currentY < y) {
                    spiral[currentX][currentY] = f;
                }
                f++;
            }
            isX = !isX;
            if (isX) {
                isPositive = !isPositive;
                specialNumber++;
            }
            i++;
        }
    }

    public static void printSpiral(int[][] spiral) {
        for (int i = 0; i < spiral.length; i++) {
            for (int f = 0; f < spiral[i].length; f++) {
                System.out.print((spiral[i][f] < 10 ? "0" + spiral[i][f] : spiral[i][f]) + " ");
            }
            System.out.println();
        }
    }

    public static long sumDiagonalsSpiral(int[][] spiral) {
        long total = 0l;
        int x = spiral.length;
        int i = 0;
        int f = x-1;
        while (i<x) {
            total += spiral[i][i];
            total += spiral[i][f];
            i++;
            f--;
        }
        total--;
        System.out.println("total sum diagonals " + total);
        return total;
    }

}
