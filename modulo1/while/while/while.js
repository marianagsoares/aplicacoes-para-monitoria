let opcao = "s"


while (opcao == "s") {
    numero = parseInt(prompt("Digite um número de 1 a 10"))
    if (numero > 1 && numero <= 10) {
        resposta = numero * numero
        alert(resposta)
    }
    else {
        alert("Digite um número válido")
    }
    opcao = prompt("Você deseja continuar?")
}