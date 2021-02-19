package com.artistecomm.sharedpreferences

import android.R.attr.fragment
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity(), OnCategoryInteractionListner
{

    lateinit var categoryFragment: CategoryFragment
    lateinit var frameLayout : FrameLayout
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryFragment = CategoryFragment.Singleton.newInstance()
        frameLayout = findViewById(R.id.fragment_Container)
        //Dyanmically inseting fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_Container, categoryFragment)
            .commitAllowingStateLoss()


    }

    override fun categoryIsTaped(num: Int) {
        Toast.makeText(this, "fragment working.." + num, Toast.LENGTH_SHORT).show()
    }
}