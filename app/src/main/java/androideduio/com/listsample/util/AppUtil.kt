package androideduio.com.listsample.util

import androideduio.com.listsample.model.StudentInfo

/**
 * Created by sinan on 31.01.2018.
 */
object AppUtil{
    fun getStudentList():ArrayList<StudentInfo>{
        val studentList = ArrayList<StudentInfo>()
        var studentInfo = StudentInfo(232131, 1, "Sinan", "Arel")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(325235, 2, "Mehmet", "Bogaziçi")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(734647, 3, "Ahmet", "Yıldız")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(984395, 4, "Tanju", "Altınbaş")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(984298, 5, "Ömer", "Özyeğin")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(234284, 6, "Servet", "İTÜ")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(209209, 7, "Cem", "Gelişim")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(325235, 8, "Mehmet", "Bogaziçi")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(734647, 9, "Ahmet", "Yıldız")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(984395, 10, "Tanju", "Altınbaş")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(984298, 11,"Ömer", "Özyeğin")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(234284, 12, "Servet", "İTÜ")
        studentList.add(studentInfo)
        studentInfo = StudentInfo(209209, 13, "Cem", "Gelişim")
        studentList.add(studentInfo)
        return studentList
    }
}