package com.example.delegateadapter.model

import androidx.annotation.DrawableRes
import com.example.delegateadapter.delegateadapter.DelegateAdapterItem

data class ImageViewModel(
    @DrawableRes val drawable: Int
) : DelegateAdapterItem {
    override fun id(): Any = this::class.java.name

    override fun content(): Any {
        TODO("Not yet implemented")
    }
}