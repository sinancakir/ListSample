package androideduio.com.listsample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androideduio.com.listsample.R
import androideduio.com.listsample.model.StudentInfo

/**
 * Created by sinan on 31.01.2018.
 */
class StudentListAdapter(private val studentList: ArrayList<StudentInfo>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemView = convertView
                ?: LayoutInflater.from(parent!!.context).inflate(R.layout.adater_studentlist_item, parent, false)

        val txtStudentNumber = itemView!!.findViewById<TextView>(R.id.adapter_studentlist_item_txtStudentNumber)
        val txtStudentName = itemView.findViewById<TextView>(R.id.adapter_studentlist_item_txtStudentName)
        val txtStudentSchool = itemView.findViewById<TextView>(R.id.adapter_studentlist_item_txtStudentSchool)

        txtStudentNumber.text = studentList[position].studentNumber.toString()
        txtStudentName.text = studentList[position].studentName
        txtStudentSchool.text = studentList[position].studentSchool

        return itemView
    }

    override fun getItem(position: Int): StudentInfo = studentList[position]

    override fun getItemId(position: Int): Long = studentList[position].studentID

    override fun getCount(): Int = studentList.size
}