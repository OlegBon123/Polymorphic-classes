public class Avtomobil {
    protected String marka;
    protected double masa;
    protected double maxShvidkist;
    protected double obiemDyhuna;

    public Avtomobil(String marka, double masa, double maxShvidkist, double obiemDyhuna) {
        this.marka = marka;
        this.masa = masa;
        this.maxShvidkist = maxShvidkist;
        this.obiemDyhuna = obiemDyhuna;
    }

    @Override
    public String toString() {
        return "Марка: " + marka + ", Маса: " + masa + " кг, Максимальна швидкість: " + maxShvidkist + " км/г, Об'єм двигуна: " + obiemDyhuna + " л";
    }
}
