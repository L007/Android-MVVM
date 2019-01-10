package id.onestep.androidmvvm.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.databinding.ObservableField
import id.onestep.androidmvvm.models.User

class MainViewModel(application: Application):AndroidViewModel(application){

    var nama:ObservableField<String> = ObservableField()
    var email:ObservableField<String> = ObservableField()
    var alamat:ObservableField<String> = ObservableField()

    fun setData(user:User){
        nama.set(user.nama)
        email.set(user.email)
        alamat.set(user.alamat)
    }


}