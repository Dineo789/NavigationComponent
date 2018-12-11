package com.architecture.android.navigationcomponent

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class WelcomeFragment : Fragment() {

    private lateinit var button: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Navigation by action
        view?.findViewById<Button>(R.id.nextButton)
            ?.setOnClickListener { Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_contentFragment) }
        return inflater.inflate(R.layout.fragment_welcome, container, false)


    }
}
