/*
Author: Hasan Raza

 */

abstract class Vehicle {
    public abstract void run();
    public abstract void stop();
    public void fuel(int a) {
        System.out.println("fuel method with one parameter, int: "+a);
    }
    public void fuel(char c, int i) {
        System.out.println("fuel method with two parameters, char: "+c+" int: "+i);
    }
    public void fuel(float a, String s) {
        System.out.println("fuel method with two parameters, float: "+a+" String: "+s);
    }

    int speed;
    long distance;

    public Vehicle() {
        System.out.println("I m from vehicle class");
    }

    public Vehicle(int speed, long distance) {
        this.speed = speed;
        this.distance = distance;
        System.out.println("I m from vehicle class");
    }


}

class TwoWheeler extends Vehicle {
    public void run() {
        System.out.println("2W run");
    }

    public void stop() {
        System.out.println("2W stop");
    }

    public TwoWheeler() {
        super(50,65);
    }

    int speed;
    long distance;
    int nos_of_tyre = 2;

    public void display() {
        System.out.println("The 2W speed: " + speed + " The 2W distance: " + distance + " The 2W Nos of Types: " + nos_of_tyre +
                " The Vehicle Speed: " + super.speed + " The Vehicle distance: " + super.distance);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }
}

class ThreeWheeler extends Vehicle {
    public void run() {
        System.out.println("3W run");
    }

    public void stop() {
        System.out.println("3W stop");
    }

    public ThreeWheeler() {
        super(60,80);
    }

    int speed;
    long distance;
    int nos_of_tyre = 3;

    public void display() {
        System.out.println("The 3W speed: " + speed + " The 3W distance: " + distance + " The 3W Nos of Types: " + nos_of_tyre +
                " The Vehicle Speed: " + super.speed + " The Vehicle distance: " + super.distance);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }
}

class FourWheeler extends Vehicle {
    public void run() {
        System.out.println("4W run");
    }

    public void stop() {
        System.out.println("4W stop");
    }

    public FourWheeler() {
        super(70,100);
    }

    int speed;
    long distance;
    int nos_of_tyre = 4;

    public void display() {
        System.out.println("The 4W speed: " + speed + " The 4W distance: " + distance + " The 4W Nos of Types: " + nos_of_tyre +
                " The Vehicle Speed: " + super.speed + " The Vehicle distance: " + super.distance);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }
}

class EightWheeler extends Vehicle {
    public void run() {
        System.out.println("8W run");
    }

    public void stop() {
        System.out.println("8W stop");
    }

    public EightWheeler() {
        super(80,110);
    }

    int speed;
    long distance;
    int nos_of_tyre = 8;

    public void display() {
        System.out.println("The 8W speed: " + speed + " The 8W distance: " + distance + " The 8W Nos of Types: " + nos_of_tyre +
                " The Vehicle Speed: " + super.speed + " The Vehicle distance: " + super.distance);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }
}

public class VehicleAssignmentDriver {
    public static void main(String[] args) {
        Vehicle vehicle ;

        /*****************Two Wheeler Class ***********************************/
        TwoWheeler twoWheeler = new TwoWheeler();
        vehicle = twoWheeler;
        vehicle.run();
        twoWheeler.setSpeed(100);
        twoWheeler.setDistance(120);
        twoWheeler.display();
        vehicle.stop();
        System.out.println();

        /*****************Three Wheeler Class ***********************************/
        ThreeWheeler threeWheeler  = new ThreeWheeler();
        vehicle = threeWheeler;
        vehicle.run();
        threeWheeler.setSpeed(150);
        threeWheeler.setDistance(180);
        threeWheeler.display();
        vehicle.stop();

/*************Four Wheeler Class ***********************************/
        System.out.println();
        FourWheeler fourWheeler  = new FourWheeler();
        vehicle = fourWheeler;
        vehicle.run();
        fourWheeler.setSpeed(200);
        fourWheeler.setDistance(220);
        fourWheeler.display();
        vehicle.stop();


/*************Eight Wheeler Class ***********************************/
        System.out.println();
        EightWheeler eightWheeler  = new EightWheeler();
        vehicle = eightWheeler;

        vehicle.run();

        eightWheeler.setSpeed(65);
        eightWheeler.setDistance(70);
        eightWheeler.display();

        vehicle.stop();
        System.out.println();

/*************************Vehicle Fuel*********************************/
        vehicle.fuel(25);
        vehicle.fuel('L',30);
        vehicle.fuel(2.5f,"2.5Liter");
    }
}
