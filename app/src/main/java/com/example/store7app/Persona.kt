package com.example.store7app

class Persona constructor(nombre:String,apellido:String,cedula:String,telefono:String,correo:String,
                          contrasena:String){

    var nombre:String=nombre
    var apellido:String=apellido
    var cedula:String=cedula
    var telefono:String=telefono
    var correo:String=correo
    var contrasena:String=contrasena

    fun caminar(){
        println("la persona esta caminando")
    }
    fun imprimirDatos(){
        var texto = "$nombre \n $apellido \n $cedula \n $telefono \n $correo \n $contrasena"
        println(texto)
    }
}