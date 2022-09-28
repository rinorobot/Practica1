package com.example.proyectofinal

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabsAdapter(fm: FragmentManager, var tabCount: Int): FragmentPagerAdapter(fm) {


    override fun getCount(): Int {
        return  tabCount
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> QuizFragment()
            1 -> NewsFragment()
            2 -> LoginFragment()
            else ->QuizFragment()
        }
    }
}