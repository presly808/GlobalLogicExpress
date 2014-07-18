package artcode.day6.interf;

/**
 * Created by admin on 18.07.2014.
 */
class Main {
    public static void main(String[] args) {

        IStudentBehavior student = new Person();
        IWorkerBehavior worker = new Person();
        worker.work();
        student.study();
    }
}
