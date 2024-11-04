package chapter5;

public class AbstractLesson {
    public static void main(String[] args) {
        // House h1 = new House();
    }
}

abstract class House {
    int houseNumber;
    public int getHouseNumber() {
        return houseNumber;
    }
    abstract int numberOfrooms();

    
}

class SmallHouse extends House{

    @Override
    int numberOfrooms() {
        return 2;    
    }}

    abstract class Car{
        abstract void start();
        abstract void stop();
        abstract void idle();

        
}
abstract class EV extends Car{
    abstract void getBatteryLevel();
    @Override
        void start() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'start'");
        }

        @Override
        void stop() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'stop'");
        }

        @Override
        void idle() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'idle'");
        }

}
class Sedan extends EV{

        
        @Override
        void getBatteryLevel() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getBatteryLevel'");
        }
        
    }