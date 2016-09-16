
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    System.out.println("Hello");

    Coche jaguar = new Coche("Jaguar","XF","3453WRD",4000,80000.0);
    Coche mercedes = new Coche("Mercedes","jgjhgj","3234RRD",8000,160000.0);
    Coche bmw = new Coche("BMW","dfsdas","7645DRE",5000,60000.0);


    List<Coche> cocheList = new ArrayList<>();

        cocheList.add(jaguar);
        cocheList.add(mercedes);
        cocheList.add(bmw);

        System.out.println("Muestro el Jaguar: "+cocheList.get(0));

        System.out.println("Muestro el Mercedes: "+cocheList.get(1));


    )
}
