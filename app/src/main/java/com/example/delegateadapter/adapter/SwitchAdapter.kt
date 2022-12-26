package com.example.delegateadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.delegateadapter.R
import com.example.delegateadapter.delegateadapter.DelegateAdapter
import com.example.delegateadapter.delegateadapter.DelegateAdapterItem
import com.example.delegateadapter.model.SwitchAdapterModel

class SwitchAdapter :
    DelegateAdapter<SwitchAdapterModel, SwitchAdapter.SwitchViewHolder>(SwitchAdapterModel::class.java) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return SwitchViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.switch_item, parent, false)
        )
    }

    override fun bindViewHolder(
        model: SwitchAdapterModel,
        viewHolder: SwitchViewHolder,
        payloads: List<DelegateAdapterItem.Payloadable>
    ) {
        viewHolder.bind(model)
    }

    inner class SwitchViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(model: SwitchAdapterModel) {
            view.findViewById<TextView>(R.id.textViewTitle).text = model.title
            //view.findViewById<SwitchCompat>(R.id.switchCompat).isChecked = model.isChecked
        }
    }
}