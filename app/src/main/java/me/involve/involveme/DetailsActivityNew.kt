package me.involve.involveme


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ScrollView
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.synthetic.main.activity_details.*
import me.involve.involveme.MainActivity.Companion.applicationContext
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Mela on 2018-12-21.
 */

class DetailsActivityNew : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val bundle = intent.extras

        title_idea.text = bundle.getString("name");
        details_logo.setImageResource(bundle.getInt("image"))
        full_desc_idea.text = bundle.getString("description")



}
}