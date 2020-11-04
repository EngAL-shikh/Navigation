package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout


class MainActivity : AppCompatActivity() {
   lateinit var drawerLayout:DrawerLayout
   lateinit var actionbarDrawerToggle:ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
var toolbar: Toolbar =findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        drawerLayout=findViewById(R.id.drawer_layout)

        actionbarDrawerToggle=object  :ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.nav_open,
            R.string.nav_cose){

            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
                setTitle(R.string.nav_cose)
            }

            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
                setTitle(R.string.nav_open)
            }

        }
        actionbarDrawerToggle.isDrawerIndicatorEnabled=true
        drawerLayout.addDrawerListener(actionbarDrawerToggle)
        actionbarDrawerToggle.syncState()


//        val navgationView:NavigationView=findViewById(R.id.na)
//
//        )




    }
}
