package androideduio.com.listsample.ui

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.View
import androideduio.com.listsample.R
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity(), View.OnClickListener {

    private var fragmentTransaction: FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val fragmentListView = ListViewFragment()

        fragmentTransaction = supportFragmentManager!!.beginTransaction()
        fragmentTransaction!!.add(R.id.activity_dashboard_StudentListFragment, fragmentListView)
        fragmentTransaction!!.commit()

        activity_dashboard_btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
}
