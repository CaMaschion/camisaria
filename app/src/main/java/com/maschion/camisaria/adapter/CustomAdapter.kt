package com.maschion.camisaria.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.maschion.camisaria.R
import com.maschion.camisaria.data.model.ClientList

class CustomAdapter(
    private val clientList: List<ClientList>,
//    private val onClick: (ClientList) ->
//    Unit
) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.client_detail_view, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val clientInfo = clientList[position]

        // sets the text to the textview from our itemHolder class
       holder.clientText.text = clientInfo.name
       holder.dateServiceText.text = clientInfo.date.toString()
       holder.localServiceText.text = clientInfo.local

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return clientList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val clientText: TextView = itemView.findViewById(R.id.client_name)
        val dateServiceText: TextView = itemView.findViewById(R.id.date_service)
        val localServiceText: TextView = itemView.findViewById(R.id.local_service)

    }
}
