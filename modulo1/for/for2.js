let numero = parseInt(prompt("digite um número para calcular a P.G"))
const razao= parseInt(prompt("digite o valor da razão"))

for(c=1;c<=10;c++){
    document.write(numero + " ")
    numero = numero * razao
}