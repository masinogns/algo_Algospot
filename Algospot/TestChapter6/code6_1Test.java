import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 10..
 */
public class code6_1Test {
    @Test
    public void main() throws Exception {
        code6_1 application = new code6_1();

        int until = 10;

        assertEquals(55, application.iteratorSum(until));
        assertEquals(55, application.recursiveSum(until));
    }

}