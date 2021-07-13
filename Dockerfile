FROM openjdk:16
ADD target/HowToMake.jar /Users/Tugcan/Desktop/HowToMake.jar
EXPOSE 7000
ENTRYPOINT ["java" , "-jar" , "/Users/Tugcan/Desktop/HowToMake.jar"]

