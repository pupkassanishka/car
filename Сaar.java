




 abstract class Car {
     public static void main(String[] args) {

     }//Извините, не разобрался как вывести абстрактный класс в консоль//
        Engine engine;
        Wheels wheels;
        int seats = 4;
        String category = "sedan";

        abstract void openLock(Key key);


    interface Engine {
        double volume = 1559;
        String fuelType = "АИ-95";
        String name = "G4EK";
    }


    interface Wheels {
        double radius = 15;
        String type = "Winter";
        String name = "Belshina";
    }


abstract class Key {}


    class Driver {
        int experience = 5;
        String drivingCategories = "A";
        Key[] keys;

        boolean hasKey(Key key) {
            for (Key k : keys) {
                if (k.equals(key)) {
                    return true;
                }
            }
            return false;}
        }
}






