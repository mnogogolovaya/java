package zubarray;
import java.util.Random;
public class ZubArray {
    public static void main(String[] args) {
        Random random = new Random();
        
        int min = -30;
        int max = 30;
        
        int[][] year = new int[12][];
        year[0] = new int[30];
        year[1] = new int[28];
        year[2] = new int[31];
        year[3] = new int[30];
        year[4] = new int[31];
        year[5] = new int[30];
        year[6] = new int[31];
        year[7] = new int[31];
        year[8] = new int[30];
        year[9] = new int[31];
        year[10] = new int[30];
        year[11] = new int[31];
        
        for (int i = 0; i < year.length; i++) {
            for (int j = 0; j < year[i].length; j++) {
                year[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        
        for (int i = 0; i < year.length; i++) {
            for (int j = 0; j < year.length; j++) {
                System.out.printf("%-5d",year[i][j]);
            }
            System.out.println();
        }
    }
}
