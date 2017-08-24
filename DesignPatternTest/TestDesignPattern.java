import Adapters.Adapter;
import Adapters.AdapterImpl;
import _State.Light;
import _Strategys.Axe;
import _Strategys.GameCharater;
import _Strategys.Knife;
import _Strategys.Sword;
import TemplateMethods.AbstGameConnectionHelper;
import TemplateMethods.DefaultGameConnection;
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
    public void state(){
        Light light = new Light();

        light.off();
        light.off();
        light.off();

        light.on();
        light.on();
        light.on();

        light.off();
        light.on();
        light.off();
        light.on();
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

    @Test
    public void template(){
        AbstGameConnectionHelper helper = new DefaultGameConnection();

        String info = "info";
        helper.requestConnection(info);
    }

    @Test
    public void factorty(){
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        creator.create();
        item.use();
    }



}