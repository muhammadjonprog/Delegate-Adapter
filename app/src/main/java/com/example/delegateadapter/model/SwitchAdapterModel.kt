package com.example.delegateadapter.model

import com.example.delegateadapter.delegateadapter.DelegateAdapterItem

data class SwitchAdapterModel(
    val title: String, val isChecked: Boolean
) : DelegateAdapterItem {
    override fun id(): Any = this::class.java.name

    override fun content(): Any = title
}
