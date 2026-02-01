import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int[] arry = new int[3];
        arry[0] = 1;
        arry[1] = 2;
        arry[2] = 3;
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
        System.out.println(" ");

        float[] arryFloat = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < arryFloat.length; i++) {
            System.out.println(arryFloat[i]);
        }
        System.out.println(" ");

        Random rand = new Random();
        int arryRnd[] = new int[20];
        for (int i = 0; i < arryRnd.length; i++) {
            arryRnd[i] = rand.nextInt(30);
            System.out.println(arryRnd[i]);
        }
        System.out.println(" ");

        System.out.println("Задача 2.");
        for (int i = 0; i < arry.length; i++) {
            if (i == arry.length - 1){
                System.out.print(arry[i] + " ");
                break;
            }else {
                System.out.print(arry[i] + ", ");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < arryFloat.length; i++) {
            if (i == arryFloat.length - 1){
                System.out.print(arryFloat[i] + " ");
                break;
            }else {
                System.out.print(arryFloat[i] + ", ");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < arryRnd.length; i++) {
            if (i == arryRnd.length - 1){
                System.out.print(arryRnd[i] + " ");
                break;
            }else {
                System.out.print(arryRnd[i] + ", ");
            }
        }
        System.out.println(" ");

        System.out.println("Задача 3.");
        for (int i = arry.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(arry[i] + " ");
                break;
            }else {
                System.out.print(arry[i] + ", ");
            }
        }
        System.out.println(" ");

        for (int i = arryFloat.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(arryFloat[i] + " ");
                break;
            }else {
                System.out.print(arryFloat[i] + ", ");
            }
        }
        System.out.println(" ");

        for (int i = arryRnd.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(arryRnd[i] + " ");
                break;
            }else {
                System.out.print(arryRnd[i] + ", ");
            }
        }
        System.out.println(" ");

        System.out.println("Задача 4.");
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] % 2 != 0){
                arry[i]++;
            }
        }
        System.out.println(Arrays.toString(arry));
    }
}