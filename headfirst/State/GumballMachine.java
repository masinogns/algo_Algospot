package State;

/**
 * Created by masinogns on 2017. 8. 24..
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);

        this.count = count;
        if (count > 0){
            state = noQuarterState;
        }else {
            state = soldOutState;
        }
    }


    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    void setState(State state){
        this.state = state;
    }
    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0){
            count -= 1;
        }
    }

    int getCount() {
        return count;
    }

    public  State getState(){
        return state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    @Override
    public String toString() {
        return "남은 동전 갯수 :"+count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }


}
