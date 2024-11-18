public class VantazhnyjAvtomobil extends Avtomobil {
    private double vantarzopidjomnist;

    public VantazhnyjAvtomobil(String marka, double masa, double maxShvidkist, double obiemDyhuna, double vantarzopidjomnist) {
        super(marka, masa, maxShvidkist, obiemDyhuna);
        this.vantarzopidjomnist = vantarzopidjomnist;
    }

    @Override
    public String toString() {
        return super.toString() + ", Вантажопідйомність: " + vantarzopidjomnist + " кг";
    }
}

