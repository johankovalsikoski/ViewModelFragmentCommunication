package br.com.getnet.superget.viewmodelfragmentcommunication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PageViewModel : ViewModel() {

    private var _name = MutableLiveData<String>()
    val name: LiveData<String>
        get() = _name

    fun setName(name: String) {
        _name.value = name
    }
}