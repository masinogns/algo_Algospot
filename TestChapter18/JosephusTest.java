import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 8. 15..
 */
public class JosephusTest {

    ArrayList<Integer> test1 = new ArrayList<>(Arrays.asList(3,5));
    ArrayList<Integer> test2 = new ArrayList<>(Arrays.asList(11, 26));

    @Test
    public void test1(){
        Josephus application = new Josephus();

        application.setPeopleNumber(6);
        application.setRemoveIndex(3);

        application.setPeopleList(application.getPeopleNumber());
        application.setJosephusPermutation(application.getRemoveIndex());

        assertEquals(test1, application.getJosephusPermutationLastIndexOfTwo());
    }

    @Test
    public void test2(){
        Josephus application = new Josephus();

        application.setPeopleNumber(40);
        application.setRemoveIndex(3);

        application.setPeopleList(application.getPeopleNumber());
        application.setJosephusPermutation(application.getRemoveIndex());

        assertEquals(test2, application.getJosephusPermutationLastIndexOfTwo());
    }



}