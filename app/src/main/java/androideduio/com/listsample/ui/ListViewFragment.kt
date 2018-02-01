package androideduio.com.listsample.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

import androideduio.com.listsample.R
import androideduio.com.listsample.adapter.StudentListListViewAdapter
import androideduio.com.listsample.util.AppUtil

class ListViewFragment : Fragment(), AdapterView.OnItemClickListener{

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val masterView = inflater!!.inflate(R.layout.fragment_list_view, container, false)
        val listView = masterView.findViewById<ListView>(R.id.fragment_list_view_student)
        val studentListAdapter = StudentListListViewAdapter(AppUtil.getStudentList())
        listView.adapter = studentListAdapter
        listView.onItemClickListener = this

        return masterView
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(activity, "Item'a Tıklandı", Toast.LENGTH_LONG).show()
    }
}

