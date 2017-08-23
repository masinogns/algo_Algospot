import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 14..
 */
public class boggle6_3Test {
    public void test(){
        boggle6_3 application = new boggle6_3();

        ArrayList<String> board = new ArrayList<>(Arrays.asList(
                "URLPM",
                "XPRET",
                "GIAET",
                "XTNZY",
                "XOQRS"
        ));

        application.setInputBoggleBoard(board);
        application.setInputKnowWord("PRETTY");

        assertEquals(true, application.findOutBoggle(
                0,0, application.getInputKnowWord())
        );
    }


}