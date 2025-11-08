# HCOM 202501 Codificacao Segura V2

Código de Exemplo para infusão de Codificação Segura V2 do programa HCOM

Java 24

Spring Boot

mvn clean spring-boot:run --skip-tests

windows

curl -X POST --location "http://localhost:8080/feriado1" --header "Content-Type:application/json" --data "{ \"nome\": \"Natal e ano novo\" }"

curl -X POST --location "http://localhost:8080/feriado2" --header "Content-Type:application/json" --data "{ \"nome\": \"Natal e ano novo\" }"