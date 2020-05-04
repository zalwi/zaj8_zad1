package logic;

import data.CustomObject;

import java.util.Scanner;

public class ObjectOperator {

    public static boolean addCustomObjectToArray(CustomObject[] customObjects, CustomObject newObject){
        // zwraca false kiedy tablica jest pełna
        for (int i=0; i<customObjects.length; i++) {
            if (customObjects[i] == null) {
                customObjects[i] = newObject;
                System.out.println("Dodano: " + newObject.getName() + " Wartość: " + newObject.getValue());
                if(i==(customObjects.length-1)) return false;
                else return true;
            }
            if(customObjects[i].equals(newObject)){
                System.out.println("Obiekt o tych właściwościach już istnieje w tablicy");
                return true;
            }
        }
        System.out.println("Tablica jest pełna");
        return false;
    }

    public static CustomObject getCustomObjectFromConsoleInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę: ");
        String name = scanner.nextLine();
        System.out.println("Podaj wartość: ");
        int value = scanner.nextInt();
        return (new CustomObject(name,value));
    }

    public static void showArrayOfCustomObjects(CustomObject[] customObjects){
        for (Object obj:customObjects){
            System.out.println(obj.toString());
        }
    }
}
