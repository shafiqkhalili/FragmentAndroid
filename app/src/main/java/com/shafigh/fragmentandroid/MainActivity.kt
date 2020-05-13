package com.shafigh.fragmentandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun addPinkFragment(view: View) {
        val pinkFragment = PinkFragment()
        val transaktion = supportFragmentManager.beginTransaction()
        transaktion.add(R.id.container, pinkFragment, "pinkFragment")
        transaktion.commit()
    }

    fun removePinkFragment(view: View) {
        val pinkFragment = supportFragmentManager.findFragmentByTag("pinkFragment")
        if (pinkFragment != null) {
            val transaktion = supportFragmentManager.beginTransaction()
            transaktion.remove(pinkFragment)
            transaktion.commit()
        }else{
            Toast.makeText(this,"Fragment not found",Toast.LENGTH_SHORT)
                .show()
        }
    }
    fun addYellowFragment(view: View) {
        val pinkFragment = YellowFragment()
        val transaktion = supportFragmentManager.beginTransaction()
        transaktion.add(R.id.container, pinkFragment, "yellowFragment")
        transaktion.commit()
    }

    fun removeYellowFragment(view: View) {
        val yellowFragment = supportFragmentManager.findFragmentByTag("yellowFragment")
        if (yellowFragment != null) {
            val transaktion = supportFragmentManager.beginTransaction()
            transaktion.remove(yellowFragment)
            transaktion.commit()
        }else{
            Toast.makeText(this,"Fragment not found",Toast.LENGTH_SHORT)
                .show()
        }
    }
    fun replaceFragment(view:View): Unit {
        var fragment= PinkFragment()
        val transaktion = supportFragmentManager.beginTransaction()
        transaktion.replace(R.id.container, fragment,"pinkFragment")
        transaktion.commit()
    }
    fun changeText(view:View): Unit {
        val fragment = supportFragmentManager.findFragmentByTag("pinkFragment") as PinkFragment?
        fragment?.setText("Susan")
    }
}
