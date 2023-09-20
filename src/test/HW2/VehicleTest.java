package HW2;

import org.example.HW2.Car;
import org.example.HW2.Motorcycle;
import org.example.HW2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    /**
     * Создание объекта машины
     */
    @BeforeEach
    public void setUp() {
        car = new Car("Lada", "Vesta", 2020);
        motorcycle = new Motorcycle("Honda", "CB400SF", 1992);
    }

    /**
     * - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
     */
    @Test
    public void testInstanceOfCar() {
        assertInstanceOf(Vehicle.class, car);
    }

    /**
     * - проверка того, что объект Car создается с 4-мя колесами
     */
    @Test
    public void testCarHaveFourWheels(){
        assertEquals(4, car.getNumWheels());
    }

    /**
     * - проверка того, объект Motorcycle создается с 2-мя колесами
     */
    @Test
    public void testMotorcycleHaveTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    /**
     * - проверка того, что объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
     */
    @Test
    public void testCarSpeed() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    /**
     * - проверка того, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
     */
    @Test
    public void testMotorcycleSpeed(){
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    /**
     *  - проверить, что в режиме парковки (сначала testDrive, потом park,
     *  т.е эмуляция движения транспорта) машина останавливается (speed = 0)
     */
    @Test
    public void testParkCar(){
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    /**
     *  - проверить, что в режиме парковки (сначала testDrive, потом park
     *  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
     */
    @Test
    public void testParkMotorcycle(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }


}