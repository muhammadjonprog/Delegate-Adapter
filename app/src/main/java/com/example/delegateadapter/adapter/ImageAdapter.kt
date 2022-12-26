package com.example.delegateadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.delegateadapter.R
import com.example.delegateadapter.delegateadapter.DelegateAdapter
import com.example.delegateadapter.delegateadapter.DelegateAdapterItem
import com.example.delegateadapter.model.ImageViewModel

class ImageAdapter :
    DelegateAdapter<ImageViewModel, ImageAdapter.ImageViewHolder>(ImageViewModel::class.java) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return ImageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.image_item, parent, false)
        )
    }

    override fun bindViewHolder(
        model: ImageViewModel,
        viewHolder: ImageViewHolder,
        payloads: List<DelegateAdapterItem.Payloadable>
    ) {
        viewHolder.bind(model)
    }

    inner class ImageViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(model: ImageViewModel) {
            view.findViewById<ImageView>(R.id.imageView).setImageResource(model.drawable)
        }
    }
}