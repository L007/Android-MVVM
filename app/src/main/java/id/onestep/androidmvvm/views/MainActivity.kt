package id.onestep.androidmvvm.views

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.onestep.androidmvvm.models.User
import id.onestep.androidmvvm.R
import id.onestep.androidmvvm.viewmodels.MainViewModel
import id.onestep.androidmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main) -> digantikan dengan binding

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel= ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.main=viewModel

        val user = User("eldianto","antoeldi@gmail.com","jalan slamet riyadi gg Damai no 8")
        viewModel.setData(user)

        //viewModel.testButton()


    }


}
