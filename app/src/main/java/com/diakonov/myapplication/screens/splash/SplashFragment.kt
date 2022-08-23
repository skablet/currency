package com.diakonov.myapplication.screens.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.diakonov.myapplication.R
import com.diakonov.myapplication.databinding.FragmentCashBinding
import com.diakonov.myapplication.databinding.FragmentSplashBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val bindingSplash = FragmentSplashBinding.inflate(inflater)
        CoroutineScope(Dispatchers.Main).launch {
            delay(1500)
            Navigation.findNavController(view!!)
                .navigate(R.id.action_splashFragment_to_rootFragment)
        }

        return bindingSplash.root
    }
}
