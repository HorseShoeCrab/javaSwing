package lotto;

import java.util.Arrays;

public class Lotto {
	int[] lotto = new int[6]; // 로또는 6개의 숫자로 출력됨

	// 로또가 완성되면 값을 출력
	public int[] getLotto() {
		return lotto;
	}

	// 로또 추첨기
	public void setLotto() { // 랜덤 숫자 발생 <- 파라미터 삭제
		// 배열 요소 초기화
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0;
		}
		int randomNum = 0;

		for (int i = 0; i < lotto.length; i++) {
			randomNum = (int) ((Math.random() * 45) + 1);

			boolean exist = false; // 밑에 for 문을 제어하기 때문에 outer for 문에 밖에 초기화하면 안 된다.

			for (int j = 0; j < lotto.length; j++) {
				if (randomNum == lotto[j]) { // 중복 회피
					exist = true;
					break;
				}
			}
			if (exist) {
				i--; // 회전 수 감소 (6회 -> 5회)
				continue; // 회전 수를 줄인 후 다시 forloop 실행
			} else {
				lotto[i] = randomNum;
			}
		}
		// 6개의 숫자 중복없이 추출
		Arrays.sort(lotto); // 오름차수 정렬
	}

}
