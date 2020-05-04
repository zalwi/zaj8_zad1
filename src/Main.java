import data.CustomObject;
import logic.ObjectOperator;

public class Main {
    public static void main(String[] args) {
        CustomObject[] customObjects = new CustomObject[3];
        CustomObject tempValues;
        //Pobierz dane z konsoli do czasu wypełnienia tablicy
        do {
            tempValues = ObjectOperator.getCustomObjectFromConsoleInput();
        }while(ObjectOperator.addCustomObjectToArray(customObjects, tempValues));
        //Wyświetl zawartość tablicy
        ObjectOperator.showArrayOfCustomObjects(customObjects);
    }
}
