package peaksoft;

import peaksoft.entity.Worker;
import peaksoft.service.ServiceWorkers;

public class App {

    public static void main( String[] args ) {


        Worker worker1 = new Worker("aza", "azamat",18);
        Worker worker2 = new Worker("beka", "azamat",23);
        Worker worker3 = new Worker("aza", "azamat",25);
        Worker worker4 = new Worker("beka", "azamat",24);
        Worker worker5 = new Worker("aza", "azamat",25);
        Worker worker6 = new Worker("aza", "azamat",26);

        ServiceWorkers.create(worker1);
        ServiceWorkers.create(worker2);
        ServiceWorkers.create(worker3);
        ServiceWorkers.create(worker5);
        ServiceWorkers.create(worker6);

        ServiceWorkers.getAll();
        System.out.println("1 -----------------------------------------------------------------------------------");

        ServiceWorkers.getAza();
        ServiceWorkers.getAll();
        System.out.println("2 ------------------------------------------------------------------------------------");

        ServiceWorkers.update();
        ServiceWorkers.getAll();
        System.out.println("3 ------------------------------------------------------------------------------------");

        ServiceWorkers.remove();
        ServiceWorkers.getAll();
        System.out.println("4 ------------------------------------------------------------------------------------");
    }
}
