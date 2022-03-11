
/**
 *
 * @author damanno
 */
public class Problem028 {

    static public int[][] spiral;

    public static void testSpiral() {
        generateSpiral(5, 5);
        printSpiral(spiral);
    }
    
    public static void generateSpiral(int x, int y) {
        spiral = new int[x][y];
        int startX = (x / 2);
        int startY = (y / 2);
        int total = x * y;
        int i = 1;
        int f = 1;
        spiral[startX][startY] = f;
        i++;
        int specialNumber = 1;
        boolean isX = false;
        boolean isPositive = true;
        int currentX = startX;
        int currentY = startY;
        while (i <= x+y) {            
            System.out.println((isX?"X":"Y") + " - " + (isPositive ? "+" : "-") + specialNumber);
            //x+1 //y+1 //x-2 //y-2 //x+3 //y+3 //x-4 //...
            int flag = specialNumber;
            while (flag != 0) {
                if (isX) {
                    if (isPositive) { currentX++; flag--; } 
                    else { currentX--; flag++; }
                } else {
                    if (isPositive) { currentY++; flag--; } 
                    else { currentY--; flag++; } 
                }
                spiral[currentX][currentY] = f;
                f++;                
            }                        
            isX = !isX;
            if (isX) {
                isPositive = !isPositive;
                specialNumber++;
                }
            i++;
        }

        System.out.println(spiral);

    }

    public static void printSpiral(int[][] spiral) {
        for (int i = 0; i < spiral.length; i++) {
            for (int f = 0; f < spiral[i].length; f++) {
                System.out.print(spiral[i][f]);
            }
            System.out.println();
        }
    }

    public static void sumDiagonalsSpiral(int[][] spiral) {

    }

}
