package com.example.databinding.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class LikeScreenViewModel: ViewModel() {

    val likes = MutableLiveData(0)

    val popularity = likes.map {
        when {
            it > 9 -> Popularity.STAR
            it > 4 -> Popularity.POPULAR
            else -> Popularity.NORMAL
        }
    }


}



enum class Popularity {
    NORMAL,
    POPULAR,
    STAR
}