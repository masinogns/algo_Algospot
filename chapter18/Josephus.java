import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 8. 15..
 *
 * 1번이 자살하는 것 부터 시작함
 */
public class Josephus {
    private int peopleNumber;
    private int removeIndex;
    private LinkedList<Integer> people;
    private ArrayList<Integer> josephusPermutation;
    private ArrayList josephusPermutationLastIndexOfTwo;

    public Josephus() {
        people = new LinkedList();

        josephusPermutation = new ArrayList();
        josephusPermutationLastIndexOfTwo = new ArrayList();
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public void setRemoveIndex(int removeIndex) {
        this.removeIndex = removeIndex;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public int getRemoveIndex() {
        return removeIndex;
    }

    public void setPeopleList(int peopleNumber) {
        for (int i = 0; i < peopleNumber; i ++){
            people.add(i, i+1);
        }
    }

    public void setJosephusPermutation(int removeIndex) {

        people.remove(0);

        int size = people.size();
        removeIndex -= 1;
        int minus = removeIndex;

        while (size > 0){
            // removeIndex += minus : 병사를 죽이고 removeIndex를 높여 원탁이 한 번 돌았는지 않았는지 판단하는 기준이 되게 함
            // removeIndex %= size : 원탁이 한 번 돌았다면 나머지 연산으로 다시 0에서부터 시작하게 한다
            removeIndex %= size;

            josephusPermutation.add(people.get(removeIndex));
            people.remove(removeIndex);
            if (people.size()==2)return;

            removeIndex += minus;
            size -= 1;
        }
    }

    public ArrayList getJosephusPermutationLastIndexOfTwo() {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(people.get(0));
        result.add(people.get(1));
        return result;
    }




}
