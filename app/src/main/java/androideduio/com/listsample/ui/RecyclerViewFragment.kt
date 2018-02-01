package androideduio.com.listsample.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androideduio.com.listsample.R
import androideduio.com.listsample.adapter.StudentListRecyclerViewAdapter
import androideduio.com.listsample.util.AppUtil

class RecyclerViewFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater!!.inflate(R.layout.fragment_recycler_view, container, false)
        val recycler = view.findViewById<RecyclerView>(R.id.fragment_recycler_view_student)
        val layoutManager = LinearLayoutManager(activity)
        recycler.layoutManager = layoutManager
        val adapter = StudentListRecyclerViewAdapter(AppUtil.getStudentList())
        recycler.adapter = adapter
        return view
    }
}
