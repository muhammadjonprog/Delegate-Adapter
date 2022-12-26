package com.example.delegateadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.delegateadapter.R
import com.example.delegateadapter.delegateadapter.DelegateAdapter
import com.example.delegateadapter.delegateadapter.DelegateAdapterItem
import com.example.delegateadapter.model.HeaderAdapterModel

class HeaderAdapter :
    DelegateAdapter<HeaderAdapterModel, HeaderAdapter.HeaderViewHolder>(HeaderAdapterModel::class.java) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return HeaderViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_header, parent, false)
        )
    }

    override fun bindViewHolder(
        model: HeaderAdapterModel,
        viewHolder: HeaderViewHolder,
        payloads: List<DelegateAdapterItem.Payloadable>
    ) {
        viewHolder.bind(model)
    }

    inner class HeaderViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(model: HeaderAdapterModel) {
            view.findViewById<TextView>(R.id.textViewHeader).text = model.header
        }
    }
}