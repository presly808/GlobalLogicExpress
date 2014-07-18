package artcode.day6.interf;

/**
 * Created by admin on 18.07.2014.
 */ //must implements all abstract methods
class Person implements IStudentBehavior, IWorkerBehavior {

    @Override
    public void study(){
        System.out.println("Person is studying");
    }

    @Override
    public void work() {
        System.out.println("Person is working");
    }

}
