package com.maschion.camisaria.client.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.maschion.camisaria.client.model.ClientItem
import com.maschion.camisaria.databinding.RvClientViewBinding

class ClientAdapter(
    private val clientItem: List<ClientItem>,
    private val onClick: (ClientItem) ->
    Unit,
    private val onClickDelete: (ClientItem) ->
    Unit
) : RecyclerView.Adapter<ClientAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: RvClientViewBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        private val clientText: TextView = itemView.clientName
        private val dateServiceText: TextView = itemView.dateServiceText
        private val localServiceText: TextView = itemView.localService

        fun bind(clientItem: ClientItem, onClick: (ClientItem) -> Unit) {
            clientText.text = clientItem.name
            dateServiceText.text = clientItem.date.toString()
            localServiceText.text = clientItem.local
            itemView.rootView.setOnClickListener {
                onClick(clientItem)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RvClientViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(clientItem[position], onClick)

    }

    override fun getItemCount(): Int {
        return clientItem.size
    }

}
