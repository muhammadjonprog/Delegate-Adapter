package com.example.delegateadapter.vm

import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.delegateadapter.R
import com.example.delegateadapter.delegateadapter.DelegateAdapterItem
import com.example.delegateadapter.model.HeaderAdapterModel
import com.example.delegateadapter.model.ImageViewModel
import com.example.delegateadapter.model.SwitchAdapterModel

class MainViewModel : ViewModel() {

    private val _listItems = MutableLiveData<List<DelegateAdapterItem>>()
    val listItems: LiveData<List<DelegateAdapterItem>>
        get() = _listItems

    init {
        initList()
    }

    private fun initList() {
        val headerItem = HeaderAdapterModel("Settings")
        val switchItem = SwitchAdapterModel("Dark mode", false)
        val imageItem = ImageViewModel(R.drawable.ic_launcher_background)
        _listItems.value = listOf(
            headerItem, switchItem, switchItem, imageItem, switchItem, switchItem, imageItem
        )
    }
}