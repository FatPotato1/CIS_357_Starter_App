package com.example.myapplication
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel: ViewModel() {


    private val _banana = MutableStateFlow("banana")
    val banana = _banana.asStateFlow()

    fun doStuff() {

        _banana.value = "bananaaaaaa"
    }
}
