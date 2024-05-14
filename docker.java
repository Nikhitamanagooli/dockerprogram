From openjdk:17

RUN mkdir /app

Copy AddOddNumbers.java /app

WORKDIR /app

RUN javac AddOddNumbers.java

CMD ["java","AddOddNumbers"]