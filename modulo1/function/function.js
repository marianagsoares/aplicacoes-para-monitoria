function equacao2Grau(a, b,c){

    const delta = Math.pow(b, 2) -4*a*c

    x1 = (-b + Math.sqrt(delta)) / (2*a)
    x2 = (-b - Math.sqrt(delta)) / (2*a)
    return[x1, x2]
}
alert(equacao2Grau(2, 8, -24))