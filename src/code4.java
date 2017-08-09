import java.util.ArrayList;
import java.util.Random;

/**
 * Created by masinogns on 2017. 8. 9..
 *
 * [주어진 배열에서 가장 많이 등장하는 숫자를 반환하기]
 * 만약 두 가지 이상 있을 경우 아무것이나 반환한다
 *
 * 1. 배열을 입력받는다
 * 2. 0~9를 index로 갖는 배열을 생성하고 0으로 초기화한다
 * 3. 입력받은 숫자를 index로 갖는 배열의 값을 +1한다
 * 4. 배열을 정렬한다
 * 5. 정렬한 배열 값의 맨 마지막 index를 반환한다
 *
 * @variable
 *
 * inputArray   : 주어진 배열
 * saveArray    : 등장하는 숫자의 횟수를 저장하는 배열
 */
public class code4 {
    ArrayList<Integer> inputArray;
    int[] saveArray;

    public code4() {
        saveArray = new int[10];
    }

    public static void main(String[] args) {
        run();
    }

    static void run() {
        code4 application = new code4();

        application.initInputArray(10);
        application.addIndexNumber(application.getInputArray());
        application.findBiggestNumber(application.getSaveArray());
    }

    private void findBiggestNumber(int[] save) {
        int max = 0;    // value가 max일 때의 index 저장할 곳

        // value의 값이 max인 index 찾기
        for (int i = 0; i < save.length; i++){
//            System.out.println(i+" : "+save[i]);

            if (save[max] < save[i]){
                max = i;
            }
        }

        System.out.println("It is biggest number : " + max);
    }

    private void addIndexNumber(ArrayList array) {
        // convert ArrayList to int[] using Iterator
        int[] inputArray = new int[array.size()];
        for (int i = 0; i < array.size(); i++){
            inputArray[i] = (int)array.get(i);
        }


        for (int i : inputArray){
            saveArray[i] += 1;
        }

        // saveArray 출력하는 곳
        System.out.println("");
        for (int i : saveArray){
            System.out.print(i+" ");
        }
    }

    private void initInputArray(int number) {
        inputArray = new ArrayList<>();
        Random randomGenerator = new Random();

        int random = 0;

        // number만큼의 random한 숫자 만들기
        for (int i = 0; i < number; i++){
            random = randomGenerator.nextInt(10);   // 0 ~ 9 사이의 int를 랜덤으로 생성한다
            inputArray.add(i, random);
        }

        for (int i : inputArray){
            System.out.print(i + " ");
        }

    }

    public ArrayList<Integer> getInputArray() {
        return inputArray;
    }

    public int[] getSaveArray() {
        return saveArray;
    }
}
