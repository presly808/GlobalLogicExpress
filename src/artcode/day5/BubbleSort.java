package artcode.day5;

/**
 * Created by admin on 17.07.2014.
 */
public class BubbleSort {
    /*
    * input(args) -> method -> result
    * primitive - reference
    * byte, short, int, long, float, double, char, boolean
    * reference
    *
    * bubble
    * 5, 6, 23, 12 ,45 ,56, 22v
    * 64, 111, 23, 12, 45, 56, 22
    * 64 ,23, 111, 12 , 45, 56, 22
    * 64 ,23, 12, 111, 45, 56, 22
    * */
    public static void sort(int[] mas){
        for(int j = 0; j < mas.length; j++){
            for(int i = 0; i < mas.length - 1; i++){
                if(mas[i] > mas[i+1]){
                    mas[i] = mas[i] + mas[i+1];
                    mas[i+1] = mas[i] - mas[i+1];
                    mas[i] = mas[i] - mas[i+1];
                }
            }

        }
    }

}
