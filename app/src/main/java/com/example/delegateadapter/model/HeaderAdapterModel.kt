package com.example.delegateadapter.model

import com.example.delegateadapter.delegateadapter.DelegateAdapterItem

data class HeaderAdapterModel(
    val header: String
) : DelegateAdapterItem {
    override fun id(): Any = this::class.java.name

    override fun content(): Any = header
}
