const veloMaxima = parseInt(prompt("Informe a velocidade máxima"))
const veloMotorista = parseInt(prompt("Digite a velocidade do condutor"))

//maxima 60
//motorista 72

const teste = veloMaxima + 10 

if(veloMotorista>veloMaxima && veloMotorista <= teste){
    alert("Você vai pagar 50 reais de multa") 
}
else if(veloMotorista>veloMaxima && veloMotorista >= veloMaxima + 11 &&veloMotorista <= veloMaxima + 30){
    alert("Você vai pagar 100 reais de multa")
}
else if(veloMotorista > veloMaxima && veloMotorista >= veloMaxima + 31){
    alert("Você vai pagar 200 reais de multa")
}
else{
    alert("VOCÊ NÃO RECEBEU QUALQUER MULTA")
}