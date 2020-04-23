# kafka 프로듀서 스터디 코드

카프카 서버에 토픽을 생성하고 
프로듀서를 통해 메세지를 보내보는 소스 코드


# 사전 준비
카프카를 사용하기 위해선 먼저 주키퍼를 실행해야한다.

![image](https://user-images.githubusercontent.com/18182656/80055711-51db4a00-855d-11ea-8d48-350ca203959d.png)

1. 명령어를 통해 주키퍼를 실행시켜 준 후 

![image](https://user-images.githubusercontent.com/18182656/80055746-67507400-855d-11ea-8cca-35ce497fc7b5.png)

2. 주키퍼 위에 카프카를 올려준다.

![image](https://user-images.githubusercontent.com/18182656/80055773-7df6cb00-855d-11ea-9f8c-895b3aa1db30.png)

3. 주키퍼 안에 메세지를 넣어볼 토픽을 생성한다
여기서는 test 로 토픽을 생성

# 테스트 결과

![image](https://user-images.githubusercontent.com/18182656/80055846-ada5d300-855d-11ea-9597-c2ad8dcae2fe.png)

컨트롤러를 통해 메세지를 전달해줬고,


![image](https://user-images.githubusercontent.com/18182656/80055885-cadaa180-855d-11ea-9616-fab9b87064a1.png)

컨슈머에서 메세지가 잘 도착 한 걸 확인 할 수 있었다.
