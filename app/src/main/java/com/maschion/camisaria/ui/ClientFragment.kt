//package com.maschion.camisaria.ui
//
//import android.os.Bundle
//import android.view.View
//import androidx.fragment.app.Fragment
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.maschion.camisaria.R
//import com.maschion.camisaria.adapter.CustomAdapter
//
//class ClientFragment : Fragment(R.layout.client_fragment_recycler_view) {
//
//    private lateinit var recycler: RecyclerView
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        recycler = view.findViewById(R.id.recyclerview)
//        recycler.layoutManager = LinearLayoutManager(context)
//        setupViewModel()
//    }
//
//    private fun setupViewModel() {
//
//        recycler.adapter = CustomAdapter(it) { content ->
//            findNavController().navigate(
//                RepositoryFragmentDirections.repositoryFragmentToContentFragment(content)
//            )
//        }
//    }
//}
