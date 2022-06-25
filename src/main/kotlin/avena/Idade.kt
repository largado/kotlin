package avena

fun main(){
    val variavelArray = IntArray(4)
    variavelArray[0]=2345
    variavelArray[1]=225424
    variavelArray[2]=23
    variavelArray[3]=2


    var maiorIdade = 0

    for(idade in variavelArray){
        if(idade > maiorIdade) {
            maiorIdade = idade
        }

    }
    print(maiorIdade)
}