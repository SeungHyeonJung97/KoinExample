package com.ashe.koinexample

import android.content.Context
import android.util.Log
import org.koin.dsl.module

interface Info{
    fun characterInfo()
}

class Ashe : Info{
    override fun characterInfo() {
        val name = "Ashe"
        val occupation = "Archer"

        Log.e("Ashe","$name, $occupation")
    }
}

class Garen : Info{
    override fun characterInfo() {
        var name = "Garen"
        val occupation = "Warrior"

        Log.e("Garen","$name, $occupation")
    }
}

class Character(private var info: Info){
    fun changeCharacter(newInfo: Info){
        this.info = newInfo
    }

    fun printInfo(){
        info.characterInfo()
    }
}

val myModule = module{
    single{ Ashe() }
    single{ Garen() }
    factory{ Character(get()) }
}