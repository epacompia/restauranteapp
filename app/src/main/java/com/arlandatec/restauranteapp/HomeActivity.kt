package com.arlandatec.restauranteapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.arlandatec.restauranteapp.adapter.PlatoAdaptador
import com.arlandatec.restauranteapp.databinding.ActivityHomeBinding
import com.arlandatec.restauranteapp.databinding.FragmentHomeBinding
import com.arlandatec.restauranteapp.model.Plato
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        drawerLayout = findViewById(R.id.drawerLayout)
        val toolbar : Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val navView = findViewById<NavigationView>(R.id.nav_view)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                //R.id.nav_home -> Toast.makeText(applicationContext,"Click en Home", Toast.LENGTH_SHORT).show()
                R.id.nav_home -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, HomeFragment()).commit()
                R.id.nav_categorias -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, CategoriaFragment()).commit()
                //R.id.nav_categorias -> Toast.makeText(applicationContext,"Click en Categorias", Toast.LENGTH_SHORT).show()
                R.id.nav_ejecutivo -> Toast.makeText(applicationContext,"Click en Menu Ejecutivo", Toast.LENGTH_SHORT).show()
                R.id.nav_pedidos -> Toast.makeText(applicationContext,"Click en Mis Pedidos", Toast.LENGTH_SHORT).show()
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }


        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()
            navView.setCheckedItem(R.id.nav_home)
        }

//ingresndo data fake en el listado



    }
    /*override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()
            R.id.nav_categorias -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, CategoriaFragment()).commit()
            *//*R.id.nav_share -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ShareFragment()).commit()
            R.id.nav_about -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, AboutFragment()).commit()
            R.id.nav_logout -> Toast.makeText(this, "Logout!", Toast.LENGTH_SHORT).show()*//*
        }
        drawerLayout.closeDrawer(0)
        return true
    }*/


//    override fun onBackPressed() {
//        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
//            drawerLayout.closeDrawer(GravityCompat.START)
//        } else {
//            onBackPressedDispatcher.onBackPressed()
//        }
//    }



}






        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.drawerLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout,R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext,"Click en Home", Toast.LENGTH_SHORT).show()
                R.id.nav_categorias -> Toast.makeText(applicationContext,"Click en Categorias", Toast.LENGTH_SHORT).show()
                R.id.nav_ejecutivo -> Toast.makeText(applicationContext,"Click en Menu Ejecutivo", Toast.LENGTH_SHORT).show()
                R.id.nav_pedidos -> Toast.makeText(applicationContext,"Click en Mis Pedidos", Toast.LENGTH_SHORT).show()
            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}*/