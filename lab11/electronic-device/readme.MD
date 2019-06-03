# Exemplu proiect template pentru laboratoarele ISP

Dependentele proiectlui:
- Maven 3 
- Java 1.8 

Pentru a rula proiectul se va rula comanda mvn din radacina proiectului unde sa gaseste fisierul pom.xml.

Pentru rulare maven va utiliza clasa default specificata in fisierul pom.xml in proprietate 'mainClass':

    <mainClass>ro.utcluj.aut.isp.devices.Example</mainClass>

Pentru a specifica argumentele de rulare atunci cand se utilizeaza maven se va modifica elementul 'commandlineArgs' in fisierl pom.xml.

    <commandlineArgs>-jar ${project.build.directory}/${project.build.finalName}-${shadedClassifierName}.jar arg1 arg2</commandlineArgs>

## Rularea testelor

    mvn test

## Rularea programului 

    mvn compile exec:java 

## Rulare default

Pentru a executa un ciclu complet de compilare, testare si rulare sa executa comanda:

    mvn

Prin comanda 'mvn' maven for rula 'default maven goals' setate in proiect, si anume:

    <defaultGoal>clean compile package exec:java</defaultGoal> 

## Rulare alternativa utilizand mvn wrapper 

Alternativ, comenzile anterioare pot fi rulate utilizand mvn wrapper (https://github.com/takari/maven-wrapper) utilizand comanda mvnw in cazul in care maven nu este instalat. Exemplu:

    mvnw test 


