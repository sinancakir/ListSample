package androideduio.com.listsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androideduio.com.listsample.R
import androideduio.com.listsample.model.StudentInfo


/**
 * Created by sinan on 01.02.2018.
 */

class StudentListRecyclerViewAdapter(private val studentList: ArrayList<StudentInfo>) : RecyclerView.Adapter<StudentListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): StudentListViewHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.adapter_studentlist_item, parent, false)
        return StudentListViewHolder(view)
    }

    override fun getItemCount(): Int = studentList.size

    override fun onBindViewHolder(holder: StudentListViewHolder?, position: Int) {
        val item = studentList[position]
        holder!!.txtStudentNumber.text = item.studentNumber.toString()
        holder.txtStudentName.text = item.studentName
        holder.txtStudentSchool.text = item.studentSchool
    }
}
