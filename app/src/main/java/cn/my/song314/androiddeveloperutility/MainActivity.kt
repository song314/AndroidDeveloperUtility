package cn.my.song314.androiddeveloperutility

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cn.my.song314.androiddeveloperutility.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }

}
