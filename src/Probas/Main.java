package Probas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");

        Coche jaguar = new Coche("Jaguar","XF","3453WRD",4000,80000.0);
        Coche mercedes = new Coche("Mercedes","jgjhgj","3234RRD",8000,160000.0);
        Coche bmw = new Coche("BMW","dfsdas","7645DRE",5000,60000.0);

        List<Coche> cocheList = new ArrayList<>();

        cocheList.add(jaguar);
        cocheList.add(mercedes);
        cocheList.add(bmw);

        System.out.println("Muestro el Jaguar: "+cocheList.get(0));

        System.out.println("Muestro el Mercedes: "+cocheList.get(1));

        Map<String, Coche> cocheMap = new HashMap<>();

        cocheMap.put("3453WRD",jaguar);

        cocheMap.put("7645DRE",bmw);

        cocheMap.put("7645DRE",mercedes);

        System.out.println("Muestro el Jaguar a partir de su matricula: "+cocheMap.get("3234RRD"));

        System.out.println("Muestro las Keys del HashMap: "+cocheMap.keySet());

        System.out.println("Muestro los valores del HashMap: "+cocheMap.value());





    }
}