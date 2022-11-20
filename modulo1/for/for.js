let numero = parseInt(prompt("Digite um número para calcular a P.A"))
const razao = parseInt(prompt("Digite o valor da razão"))

for(cont=1;cont<=10;cont++){
    document.write(numero + " ")
    numero = numero + razao
}