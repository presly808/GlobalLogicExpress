package artcode.day3.comp;

/**
 * Created by admin on 17.07.2014.
 */
public class Director {

    private Worker[] team = new Worker[10]; // null
    private int count; // 0

    public Director() {
        //super();
    }

    public Worker[] getTeam() {
        return team;
    }

    public void setTeam(Worker[] team) {
        this.team = team;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addWorker(Worker worker){
        team[count++] = worker;
    }

    public void doTeamWork(){
        for (int i = 0; i < count; i++) {
            team[i].work();
        }
    }

}
