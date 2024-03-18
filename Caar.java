abstract class Car {
    public static void main(String[] args) {
        PetrolEngine Engine;
        WinterWheels Wheels;
        int seats;
        String category;

    }//Извините, не разобрался как вывести абстрактный класс в консоль//


    int seats = 4;

    class Sedan extends Car {
        @Override
        void openLock(Key key) {
            if (Driver.hasKey(key)) {
                System.out.println("Car is unlocked");
            } else {
                System.out.println("Invalid key");
            }
        }
    }

    abstract void openLock(Key key);


    public interface Engine {
        class PetrolEngine implements Engine {
            double volume = 1559;
            String fuelType = "АИ-95";
            String name = "G4EK";
        }
    }


    public interface Wheels {
        class WinterWheels implements Wheels {


            double radius = 15;
            String type = "Winter";
            String name = "Belshina";
        }
    }


    abstract class Key {
    }


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
            return false;
        }

        class Sedan extends Car {
            @Override
            void openLock(Key key) {
                if (driver.hasKey(key)) {
                    System.out.println("Car is unlocked");
                } else {
                    System.out.println("Invalid key");
                }
            }
        }

       public abstract void startEngine();


        public void stopEngine() {
            System.out.println("Двигатель остановлен");
        }


        public abstract void drive();


        public abstract void acceptPassengers();


        public abstract void refuel();
    }


    interface Startable {
        void startEngine();
    }


    interface Drivable {
        void drive();
    }


    interface Acceptable {
        void acceptPassengers();
    }


    interface Refuelable {
        void refuel();
    }


    class sedan  extends Car implements Startable, Drivable, Acceptable, Refuelable {
        @Override
        public void startEngine() {
            System.out.println("Двигатель легкового автомобиля запущен");
        }

        @Override
        public void drive() {
            System.out.println("Легковой автомобиль движется по дороге");
        }

        @Override
        public void acceptPassengers() {
            System.out.println("Приняты пассажиры в легковой автомобиль");
        }

        @Override
        public void refuel() {
            System.out.println("Легковой автомобиль заправлен");
        }
    }
}
