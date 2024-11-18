public class Main {
    public static void main(String[] args) {
        Avtomobil legkovyj = new LegkovyjAvtomobil("Toyota Camry", 1500, 220, 2.5, 4);
        Avtomobil vantazhnyj = new VantazhnyjAvtomobil("Scania R500", 8000, 120, 12.7, 20000);

        System.out.println(legkovyj);
        System.out.println(vantazhnyj);
    }
}
