const ano = parseInt(prompt("Digite um ano"))

if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 ==0){
    document.write("O ANO É BISSEXTO")
}
else if (ano % 4 == 0 && ano % 100 !=0){
    document.write("O ANO É BISSEXTO")
}
else{
    document.write("O ANO  NÃO É BISSEXTO")
}