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
class StudentListListViewAdapter(private val studentList: ArrayList<StudentInfo>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View
        val viewHolder : ViewHolder

        if(convertView == null){
            view  = LayoutInflater.from(parent!!.context).inflate(R.layout.adapter_studentlist_item,null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val studentInfo = studentList[position]
        viewHolder.txtStudentNumber.text = studentInfo.studentNumber.toString()
        viewHolder.txtStudentName.text = studentInfo.studentName
        viewHolder.txtStudentSchool.text = studentInfo.studentSchool

        return view
    }

    override fun getItem(position: Int): StudentInfo = studentList[position]

    override fun getItemId(position: Int): Long = studentList[position].studentID

    override fun getCount(): Int = studentList.size

    class ViewHolder(item : View?){
        val txtStudentNumber = item!!.findViewById<TextView>(R.id.adapter_studentlist_item_txtStudentNumber)
        val txtStudentName = item!!.findViewById<TextView>(R.id.adapter_studentlist_item_txtStudentName)
        val txtStudentSchool = item!!.findViewById<TextView>(R.id.adapter_studentlist_item_txtStudentSchool)
    }
}