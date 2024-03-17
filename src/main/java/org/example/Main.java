package org.example;

public class Main {
    public static void main(String[] args) {
        /*Напишите код, с помощью которого можно разделить строку на части.
        Код должен работать для строк любого размера и любого содержания. Размер частей вы устанавливаете самостоятельно.*/

        stringToParts("Напишите код, с помощью которого можно разделить строку на части", 5);

    }

    public static void stringToParts(String string, int partSize) {
        int parts = string.length() / partSize;
        int x = 0;

        while (parts > x) {
            System.out.println("String " + (x + 1) + " : " + string.substring(x * partSize, (x + 1) * partSize ));
            x++;
        }

        if (string.length() % partSize != 0) {
            System.out.println("String " + (x +1) + " : " + string.substring(string.length() - string.length() % partSize ));
        }
    }
}