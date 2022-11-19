package transport;

public class Bus extends Transport implements Competing{

    private int bestLapTime;
    private int maxSpeed;

    public Bus(String brand, String model, double engineVolume, int bestLapTime, int maxSpeed) {
        super(brand, model, engineVolume);
        this.bestLapTime = Math.max(bestLapTime, 0);
        this.maxSpeed = Math.max(maxSpeed, 0);
    }

    @Override
    public void startMoving() {
        System.out.println("Начинает движение");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Заканчивает движение");
    }

    @Override
    public void getPitStop() {
        System.out.println(getBrand() + " " + getModel() +
                " - приехала на пит-стоп, выполнили диагностику");
    }

    @Override
    public int getBestLapTime() {
        return bestLapTime;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void result() {
        System.out.println("Максимальная скорость: " + getMaxSpeed() +
                " км/ч; Лучшее время круга: " + getBestLapTime() +
                " мин");
    }

    @Override
    public String toString() {
        return "Автобус: " + getBrand() +
                " " + getModel() +
                "; объем двигателя: " + getEngineVolume() +
                " л.";
    }
}
