package artcode.day3.comp;

/**
 * Created by admin on 17.07.2014.
 */
public class TestPol {

    public static void main(String[] args) {
        Director director = new Director();
        Tester tester = new Tester("Victor", 25, 1200);
        Coder coder = new Coder("Bogdan", 27, 2000, "Middle", 3);
        Worker worker = new Worker("Luda", 43, 400);
        Worker worker1 = new Tester("Olex", 22, 1200);


        director.addWorker(tester);
        director.addWorker(coder);
        director.addWorker(worker);
        director.addWorker(worker1);

        director.doTeamWork();




    }
}
