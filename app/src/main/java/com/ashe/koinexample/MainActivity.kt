package com.ashe.koinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myCharacter = Character(Ashe())

        myCharacter.printInfo()

        myCharacter.changeCharacter(Garen())

        myCharacter.printInfo()

        val myCharacter2 = Character2()
        myCharacter2.print()

    }

    class Ashe2 {
        val name = "Ashe"
        val occupation = "Archer"

        fun print(){
            Log.e("Ashe2", "$name, $occupation")
        }
    }

    class Garen2 {
        val name = "Garen"
        val occupation = "Warrior"

        fun print(){
            Log.e("Garen", "$name, $occupation")
        }
    }

    class Character2{
        val character = Ashe2()

        fun print(){
            character.print()
        }
    }
}