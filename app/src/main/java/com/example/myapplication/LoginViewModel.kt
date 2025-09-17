package com.example.myapplication
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel: ViewModel() {
    private val _stuff = MutableStateFlow(20)
    val stuff = _stuff.asStateFlow()

    fun doStuff(c: Int) {
        _stuff.value -= c
    }
}