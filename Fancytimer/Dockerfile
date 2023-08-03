## Dockerfile

# 사용할 이미지 기반으로 컨테이너 실행하기 Java11을 설치해보자 
FROM openjdk:11

# 컨테이너 내부에 /app디렉토리를 생성하고, 해당 디렉토리를 현재 작업 디렉토리로 설정하기
WORKDIR /app

# 호스트 환경에 있는 FancyTimer.java 파일을 컨테이너 내부의 /app디렉토리로 복사
COPY FancyTimer.java .

# Java 코드를 컴파일하기
RUN javac FancyTimer.java

# 컨테이너 실행시 해당 명령어를 통해 이전에 생성된 class 파일을 실행
CMD ["java", "FancyTimer"]

