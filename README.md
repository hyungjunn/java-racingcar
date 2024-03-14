# 자동차 경주(우승자)

## Todo
 

---
## Done
- 자동차의 수를 입력받던 로직을 자동차의 (이름 + ,)를 입력받는 로직을 구현한다
- 차에 이름과 위치 정보를 가지는 객체를 구현한다.
- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.


---

## 리뷰 반영 사항
- [x] CarTest에서 중복을 제거하고 DisplayName을 통해 어떤걸 테스트하고 있는지 명시하기
- 랜덤 값 처리 로직
  - [x] int 를 반환하여 car 에서 판단하지않고 전략 자체에서 이동할지 말지를 판단하도록 처리
  - [x] 테스트에서 사용할 경우 랜덤하지 않아야하기 때문에 전략의 이름을 추상적으로 정의 
