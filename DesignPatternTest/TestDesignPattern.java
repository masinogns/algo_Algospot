import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by masinogns on 2017. 8. 19..
 */
public class TestDesignPattern {

    @Test
    public void strategy(){
        GameCharater gameCharater = new GameCharater();

        gameCharater.setWeapon(new Knife());
        gameCharater.attack();
        gameCharater.setWeapon(new Sword());
        gameCharater.attack();
        gameCharater.setWeapon(new Axe());
        gameCharater.attack();

    }

    @Test
    public void adapter(){
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.twiceOf(88f));
        // How to use assertEquals Float
        assertEquals(200.0, adapter.twiceOf(100f), 0.0f);
        assertEquals(176.0, adapter.twiceOf(88f), 0.0f);

        System.out.println(adapter.halfOf(80f));
        assertEquals(40.0, adapter.halfOf(80f), 0.0f);
    }


}