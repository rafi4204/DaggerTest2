package com.example.daggertest2.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.daggertest2.viewModel.FirstViewModel
import com.example.daggertest2.R
import com.example.daggertest2.di.DaggerAppComponent
import com.example.daggertest2.di.module.DiselEngineModule
import com.example.daggertest2.model.Car
import com.example.daggertest2.model.Engine
import javax.inject.Inject


class FirstFragment : Fragment() {

    companion object {
        fun newInstance() = FirstFragment()
    }

    private lateinit var viewModel: FirstViewModel

   // lateinit var car: Car
   @Inject
    lateinit var engin: Engine
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FirstViewModel::class.java)

        val carComponent = DaggerAppComponent.builder().diselEngineModule(DiselEngineModule(100)).build()
        carComponent.inject(this)
        //car.drive()
        engin.enginType()
    }

}
