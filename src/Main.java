import driver.CategoryB;
import driver.CategoryC;
import driver.CategoryD;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car audiQ3 = new Car("Audi", "Q3 1.4 TFSI", 2.0, 5, 178);
        CategoryB oleg = new CategoryB("Олег Петрович", "B", 4, audiQ3);
        System.out.println(audiQ3);
        System.out.println(oleg);
        audiQ3.startMoving();
        audiQ3.getPitStop();
        audiQ3.finishTheMove();
        audiQ3.result();

        Truck volvoFH16 = new Truck("Volvo", "FH16", 16.0, 14, 100);
        CategoryC ivan = new CategoryC("Иван Романович", "C", 6, volvoFH16);
        System.out.println(volvoFH16);
        System.out.println(ivan);
        volvoFH16.startMoving();
        volvoFH16.getPitStop();
        volvoFH16.finishTheMove();
        volvoFH16.result();

        Bus daewooBC212MA = new Bus("Daewoo", "BC212MA", 1.7, 10, 130);
        CategoryD semen = new CategoryD("Семен Дмитриевич", "D", 9, daewooBC212MA);
        System.out.println(daewooBC212MA);
        System.out.println(semen);
        daewooBC212MA.startMoving();
        daewooBC212MA.getPitStop();
        daewooBC212MA.finishTheMove();
        daewooBC212MA.result();
    }
}