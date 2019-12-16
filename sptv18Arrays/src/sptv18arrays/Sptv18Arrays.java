package sptv18arrays;
import java.util.Arrays;
import java.util.Random;
public class Sptv18Arrays {
    public static void main(String[] args) {
        int[] num = new int[20];
        Random rnd = new Random();
        
        for (int i=0; i<20; i++) {
            do {
                int rndnum = rnd.nextInt(100);
                if (rndnum %2 == 0) {
                    num[i] = rndnum;
                    break;
                } else {
                    continue;
                }
            } while (true);
        }
        int max = num[0];
        int min = num[0];
        int sum = 0;
        for(int i=0; i<20; i++) {
            System.out.printf("%-3d", num[i]);
            if(num[i] > max) {
                max = num[i];
            } 
            if (num[i] < min) {
                min = num[i];
            }
            sum += num[i];
        }
        sum = sum - min - max;
        double arif = (double)sum/(num.length-2);
        System.out.println();
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.printf("Среднее арифметическое число: %-5.2f%n", arif);
        
        Arrays.sort(num);
        
        System.out.println("Конец программы");
        
    }
}


// Создайте массив из 20 случайных четных целых чисел. 
// Вычислите среднее арифметическое элементов массива 
// без учета минимального и максимального элементов массива.