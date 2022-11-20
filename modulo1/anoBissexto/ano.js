anoInformado = parseInt(prompt(`Digite o ano`))

if((anoInformado % 4 == 0) && (anoInformado % 100 == 0) && (anoInformado % 400 ==0)){ 
    document.write(`${anoInformado} é bissexto`)

}
else if((anoInformado % 4 ==0) && (anoInformado % 100>0 && anoInformado % 100<=99)){ 
    
    document.write(`${anoInformado} é bissexto`)
}
else{
    document.write(`${anoInformado} NÃO é bissexto`)
}