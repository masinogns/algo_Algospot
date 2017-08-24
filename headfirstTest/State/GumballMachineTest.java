package State;

import org.junit.Test;

/**
 * Created by masinogns on 2017. 8. 24..
 */
public class GumballMachineTest {
    @Test
    public void base(){
        BaseGumballMachine baseGumballMachine = new BaseGumballMachine(5);

        System.out.println(baseGumballMachine);
        baseGumballMachine.insertQuarter();
        baseGumballMachine.turnCrank();
        System.out.println(baseGumballMachine);


    }

    @Test
    public void test(){
        GumballMachine baseGumballMachine = new GumballMachine(3);

        System.out.println(baseGumballMachine);
        baseGumballMachine.insertQuarter();
        baseGumballMachine.turnCrank();
        baseGumballMachine.turnCrank();
        System.out.println(baseGumballMachine);


    }

}