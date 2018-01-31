package androideduio.com.listsample.ui

import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import androideduio.com.listsample.R

class DashboardActivity : AppCompatActivity() {

    private var fragmentTransaction: FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val fragmentListView = ListViewFragment()

        fragmentTransaction = supportFragmentManager!!.beginTransaction()
        fragmentTransaction!!.add(R.id.activity_dashboard_StudentListFragment, fragmentListView)
        fragmentTransaction!!.commit()
    }
}
