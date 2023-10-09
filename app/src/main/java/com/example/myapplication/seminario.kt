package com.example.myapplication


fun main (){}
//Ejercicio 5. Crea una función que cuenta
// cuántas veces aparece una letra en un texto.

fun ej5 (a : Char , texto: String) : Int{

    var contador =0;
    for (letra in texto){

        if( letra ==a){

            contador++;
        }
    }
    return  contador
}

//Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en un texto.
fun contarCaracter ( texto : String , cadena :String) : Int {

    val contador: Int=0;
    val can :String="hol";

    val cadenaTexto=listOf<String>();

    for (i in 0  until texto.length){

        if(can.equals(cadena)){
            contador++;
        }
    }
 return contador
}














//Ejercicio 7. Crea una función que pone en mayúscula
// la primera letra de cada palabra de un texto

fun mayus (texto: String ) : String {

    val texto:String=" hola mundo";

    val texto_cambio :String;
    // poner cada palabra la priemra letra en mayus
    texto_cambio= texto.split("").toString().get(0).uppercase();

 return texto_cambio
}

//jercicio 8. Crea una función que sume los dígitos de un número.
// Ejemplo: sumaDigitos(245) = 2 + 4 + 5 = 11

fun ej8 (numero :Int) :Int {

    val numero: Int=222;

    var suma :Int=0;
     var resultado :Int=0;
    var auxiliar :Int =0;
    var resto: Int=0;
    if(numero/100 !=0){
        resultado=numero/100;
        auxiliar=resultado;
        suma= resultado;
    }
    if(auxiliar/10!=0){

        resultado=auxiliar/10;
        resto=resultado;
        suma +=resultado + resto;

    }
    if(numero>10) {


    }


    return suma;

}
//Ejercicio 9. Crea una función que calcule el máximo
// común divisor de dos números naturales

fun ej9 (num1 :Int , num2: Int) :Int {
        if(num1/num2!=0 ){

            //ejeplo 22 y 18

            for ( i in num1 until num2){

                if(num1 / i = 0 and num2 / i=0){
                    var mcd=i;

                }
            }
        }

    return mcd
}

//Ejercicio 10. Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci.
//En matemática, la sucesión de Fibonacci se trata de una serie infinita de números naturales que empieza con un 0 y un 1 y continúa añadiendo números que son la suma de los dos anteriores:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597…

fun ej10(numero : Int) :Int{

    var suma:Int=0;
    var numero=0;
    var contador :Int =0;
    for (i in numero until numero){
        suma=numero+contador;

        numero=contador;
        contador++;


    }
return suma;
}

//Ejercicio 11. Crea una función que determine si dos números son primos relativos.
//Se dice que dos números son relativamente primos si su factor común más grande ( FCG ) es 1. Ejemplo 1: Los factores de 20 son
// 1, 2, 4, 5, 10 y 20. Los factores de 33 son 1, 3, 11, y 33.

fun ej11 (num1 : Int, num2: Int ) :Boolean{
    var primo=true;
    for (i in num1 until num2){

        if(num1/i == 0 and num2/i==0 and i!=1){

             primo=true;
        } else {
            primo =false;
        }
    }
    return primo
}