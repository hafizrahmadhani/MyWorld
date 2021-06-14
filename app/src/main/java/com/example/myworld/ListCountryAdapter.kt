package com.example.myworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_country.view.*

class ListCountryAdapter (private val listCountry: ArrayList<DataModel>) : RecyclerView.Adapter<ListCountryAdapter.ViewHolder>() {
    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: DataModel) {
            with(itemView) {
                Glide.with(itemView.context)
                        .load(item.imgFlag)
                        .apply(RequestOptions().override(70, 70))
                        .into(img_item_country)
                id_name_country.text = item.title_received
                id_detail_country.text = item.capital_received

                itemView.setOnClickListener{onItemClickCallback?.onItemClicked(item)}
            }

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_country, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listCountry[position])
    }

    override fun getItemCount(): Int = listCountry.size

    interface OnItemClickCallback{
        fun onItemClicked(data: DataModel)
    }
}