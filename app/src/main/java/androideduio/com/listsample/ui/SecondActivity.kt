package androideduio.com.listsample.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import androideduio.com.listsample.R

class SecondActivity : AppCompatActivity() {

    private var fragmentTransaction: FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val recyclerViewFragment = RecyclerViewFragment()

        fragmentTransaction = supportFragmentManager!!.beginTransaction()
        fragmentTransaction!!.add(R.id.activity_second_fragment, recyclerViewFragment)
        fragmentTransaction!!.commit()
    }
}
