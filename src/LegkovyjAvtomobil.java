public class LegkovyjAvtomobil extends Avtomobil {
    private int kilkistDverej;

    public LegkovyjAvtomobil(String marka, double masa, double maxShvidkist, double obiemDyhuna, int kilkistDverej) {
        super(marka, masa, maxShvidkist, obiemDyhuna);
        this.kilkistDverej = kilkistDverej;
    }

    @Override
    public String toString() {
        return super.toString() + ", Кількість дверей: " + kilkistDverej;
    }
}
