import programmers.LV2_12899.Solution;

public class TestMain {

    public static void main(String[] args) throws Exception {

        BaekJoon baekJoon = new BaekJoon();
        Programmers<String> programmersReturnString = new Programmers<>();
        Programmers<Integer> programmersReturnInt = new Programmers<>();

        /*
        * 스터디 1주차
        * */

        // 퇴사 (Silver 3)
        // https://www.acmicpc.net/problem/14501
        // baekJoon.setAnswer(new baekjoon.S3_14501.Main()).test();

        // 요세푸스 (Silver 4)
        // https://www.acmicpc.net/problem/1158
        // baekJoon.setAnswer(new baekjoon.S4_1158.Main()).test();

        // 암기왕 (Silver 4)
        // https://www.acmicpc.net/problem/2776
        // baekJoon.setAnswer(new baekjoon.S4_2776.Main()).test();

        // 좋은단어 (Silver 4)
        // https://www.acmicpc.net/problem/3986
        // baekJoon.setAnswer(new baekjoon.S4_3986.Main()).test();



        /*
         * 스터디 2주차
        * */

        // 달팽이 (Silver 3)
        // https://www.acmicpc.net/problem/1913
        // baekJoon.setAnswer(new baekjoon.S3_1913.Main()).test();

        // 스위치 껴고크기 (Silver 4)
        // https://www.acmicpc.net/problem/1244
        // baekJoon.setAnswer(new baekjoon.S4_1244.Main()).test();

        // 124나라의 숫자 (Level 2)
        // https://school.programmers.co.kr/learn/courses/30/lessons/12899
        // programmersReturnString.setAnswer(new programmers.LV2_12899.Solution()).test();



        /*
         * 스터디 3주차
         * */

        // 전력망을 둘로 나누기  (Level 2)
        // https://school.programmers.co.kr/learn/courses/30/lessons/86971
        // programmersReturnInt.setAnswer(new programmers.LV2_86971.Solution()).test();

        // [PCCP 기출문제] 3번 / 아날로그 시계  (Level 2)
        // https://school.programmers.co.kr/learn/courses/30/lessons/250135
        // programmersReturnInt.setAnswer(new programmers.LV2_250135.Solution()).test();

        // 표 편집  (Level 3)
        // https://school.programmers.co.kr/learn/courses/30/lessons/81303
        // programmersReturnString.setAnswer(new programmers.LV3_81303.Solution()).test();



        /*
         * 스터디 4주차
         * */

        // 소수 찾기 (Level 2)
        // https://school.programmers.co.kr/learn/courses/30/lessons/42839
        // programmersReturnInt.setAnswer(new programmers.LV2_42839.Solution()).test();

        // 어린왕자 (Silver 3)
        // https://www.acmicpc.net/problem/1004
        // baekJoon.setAnswer(new baekjoon.S3_2606.Main()).test();

        // 바이러스 (Level 3)
        // https://www.acmicpc.net/problem/2606
        // baekJoon.setAnswer(new baekjoon.S3_1004.Main()).test();



        /*
         * 스터디 5주차
         * */

        // 네트워크 연결 (Gold 4)
        // https://www.acmicpc.net/problem/1922
        baekJoon.setAnswer(new baekjoon.G4_1922.Main()).test();

        // 사칙연산 (Level 4)
        // https://school.programmers.co.kr/learn/courses/30/lessons/1843
        programmersReturnInt.setAnswer(new programmers.LV4_1843.Solution()).test();

        // 가장 큰 정사각형 찾기 (Level 2)
        // https://school.programmers.co.kr/learn/courses/30/lessons/12905
        programmersReturnInt.setAnswer(new programmers.LV2_12905.Solution()).test();
    }

}
