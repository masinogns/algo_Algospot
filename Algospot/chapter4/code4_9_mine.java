import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by masinogns on 2017. 8. 9..  패스패스
 *
 * 최대 연속 부분 구간 합 문제 풀기
 * for example {
 *     array = [-7, 4, -3, 6, 3, -8, 3, 4]
 *     최대 합을 갖는 부분 구간 = [4, -3, 6, 3]으로 10이다
 * }
 *
 * 1. 배열을 입력받는다
 * 2. 최대 합을 갖는 구간을 찾는다
 * {
 *     구간은 1부터 배열 사이즈만큼의 구간만을 갖을 수 있다
 *     구간 영역이 1일 때 첫 번째 for문은 array.length - ( 구간 - 1)까지 반복문을 돌린다
 *     int 구간 = 1   // 구간 영역의 크기
 *     int max = 0  //  구간 중 가장 큰 수 저장 (영역과 값을 함께 저장해야 하는 문제점 발생)
 *     for // 구간을 늘리고 (int 구간 = 1; 구간 < 배열 크기 - (구간 -1) )
 *        int pointer = 0;
 *        for // 구간만큼 요소들을 더하고 (int i = 0; i < 구간 + pointer)
 *          if max < sum ; max = sum // max보다 값이 크면 max에 sum을 넣
 *
 *          if(pointer > (크기 - (구간 - 1)))
 *          continue        // 주어진 배열 구간을 벗어난 경우
 *          else
 *          pointer += 구간  // 주어진 배열 구간을 벗어나지 못한 경우
 *
 *          그러면 알고리즘 수행 시간이 N^2
 * }
 * 3. 최대 합을 갖는 구간을 출력한다
 *
 *
 */
public class code4_9_mine {
    ArrayList<Integer> integerArrayList;
    ArrayList<Integer> findOutBiggestList;

    public code4_9_mine() {
        integerArrayList = new ArrayList<>();
        findOutBiggestList = new ArrayList<>();
    }

    public ArrayList<Integer> getFindOutBiggestList() {
        return findOutBiggestList;
    }

    public void setFindOutBiggestList(ArrayList<Integer> findOutBiggestList) {
        this.findOutBiggestList = findOutBiggestList;
    }

    public ArrayList<Integer> getIntegerArrayList() {
        return integerArrayList;
    }

    public void setIntegerArrayList(ArrayList<Integer> integerArrayList) {
        this.integerArrayList = integerArrayList;
    }

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        code4_9_mine application = new code4_9_mine();

        ArrayList<Integer> integerArrayList = new ArrayList<>(
                Arrays.asList(-7, 4, -3, 6, 3, -8, 3, 4)
        );

        application.setIntegerArrayList(integerArrayList);
        application.setFindOutBiggestList(
                application.findOutBiggestSum(
                        application.getIntegerArrayList()
                )
        );

        application.showArrayList(
                application.getFindOutBiggestList()
        );
    }

    private ArrayList<Integer> findOutBiggestSum(ArrayList<Integer> integerArrayList) {
        ArrayList<Integer> findOutBiggestList = new ArrayList<>();

        return findOutBiggestList;
    }

    private void showArrayList(ArrayList<Integer> findOutBiggestList) {

    }
}
