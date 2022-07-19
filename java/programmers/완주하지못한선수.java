package programmers;

import java.util.Arrays;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);//두 배열을 정렬
        Arrays.sort(completion);

        int i=0;
        for (i = 0; i < completion.length; i++) // i 의 길이만큼 돌려서
        {
            if (!participant[i].equals(completion[i])) // 그 후 같지 않은 걸 리턴
            {
                return participant[i];
            }

        }
        return participant[i];
    }

    public static void main(String[] args) {
        완주하지못한선수 human = new 완주하지못한선수();
        String[] participant = {"John","Kim","Door"};
        String[] completion = {"John","Kim"};
        System.out.println("결과 : "+human.solution(participant,completion));
    }
}


//마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//completion의 길이는 participant의 길이보다 1 작습니다.
//참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//참가자 중에는 동명이인이 있을 수 있습니다.