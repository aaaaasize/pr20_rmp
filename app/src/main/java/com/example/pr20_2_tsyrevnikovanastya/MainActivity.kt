package com.example.pr20_2_tsyrevnikovanastya

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.pr20_2_tsyrevnikovanastya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }

    fun stan(view: View){

        var snackbar = Snackbar.make(view,"Prologistic.com.ua - программирование на Java | Android", Snackbar.LENGTH_LONG).show()
    }

    fun snack(view: View){

        var snackbar = Snackbar.make(view,"Вы изменили что-то", Snackbar.LENGTH_LONG)
        snackbar.setAction("Вернуть как было?", View.OnClickListener {
            Toast.makeText(this, "Всё вернулось на свои места!",Toast.LENGTH_LONG).show()
        }).show()
    }

    fun not_stan(view: View){

        var snackbar = Snackbar.make(view,"Повторите ещё раз!", Snackbar.LENGTH_LONG)
        snackbar.setAction("ПОВТОРИТЬ", View.OnClickListener {
            Toast.makeText(this, "Всё вернулось на свои места!",Toast.LENGTH_LONG).show()
        }).show()
    }
    fun mail(view: View){

        var snackbar = Snackbar.make(view,"Вы нажали на FloatingActionButton", Snackbar.LENGTH_LONG).show()
    }
}