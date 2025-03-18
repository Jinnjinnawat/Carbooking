package com.example.carbooking

import HomeFragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // กำหนด Fragment เริ่มต้นเป็น HomeFragment เสมอ
        loadFragment(HomeFragment())

        // ตั้งค่า Listener ให้กับ BottomNavigationView
        bottomNavigationView.setOnItemSelectedListener { item ->
            // ไม่ว่าเลือกเมนูไหน จะไปที่ HomeFragment เสมอ
            loadFragment(HomeFragment())
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .commit()
    }
}
