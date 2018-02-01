package androideduio.com.listsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import androideduio.com.listsample.R


/**
 * Created by sinan on 01.02.2018.
 */

class StudentListViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val txtStudentNumber = view.findViewById<TextView>(R.id.adapter_studentlist_item_txtStudentNumber)
    val txtStudentName = view.findViewById<TextView>(R.id.adapter_studentlist_item_txtStudentName)
    val txtStudentSchool = view.findViewById<TextView>(R.id.adapter_studentlist_item_txtStudentSchool)
}
