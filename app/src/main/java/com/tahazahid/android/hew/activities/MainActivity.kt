package com.tahazahid.android.hew.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment
import com.tahazahid.android.hew.R
import com.tahazahid.android.hew.databinding.ActivityMainBinding
import com.tahazahid.android.hew.utils.TinyDB
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var navController: NavController
    private lateinit var navGraph: NavGraph

    private lateinit var tinyDB: TinyDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tinyDB = TinyDB(this)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val inflater = navHostFragment.navController.navInflater
        navGraph = inflater.inflate(R.navigation.nav_graph)
        navController = navHostFragment.navController

//        if(tinyDB.getBoolean("isDashboardScreen")){
//            navController.navigate(R.id.dashBoardFragment, null)
//
//        }else{
//            navController.navigate(R.id.loginEmailFragment, null)
//        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}