package me.involve.involveme


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.RatingBar
import android.widget.ScrollView
import android.widget.Toast
import com.google.android.gms.maps.model.LatLng
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_details.*
import me.involve.involveme.MainActivity.Companion.applicationContext
import kotlinx.android.synthetic.main.activity_main.*


/**
 * Created by Mela on 2018-12-21.
 */

class DetailsActivityNew : AppCompatActivity() {

    lateinit var ratingBar: RatingBar
    lateinit var buttonSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val bundle = intent.extras

        title_idea.text = bundle.getString("name");
        details_logo.setImageResource(bundle.getInt("image"))
        full_desc_idea.text = bundle.getString("description")

        ratingBar = findViewById(R.id.rating_field)
        buttonSave = findViewById(R.id.save_button)

        buttonSave.setOnClickListener { saveRating() }
}
    private fun saveRating(){
        val name = title_idea.text.toString()
        val tagged = null
        val description = full_desc_idea.text.toString()
        val location = LatLng(20.00,20.0)
        val logo = intent.extras.getInt("image")
        val rating = ratingBar.numStars

        val ref = FirebaseDatabase.getInstance().getReference("initiatives")
        val id = ref.push().key

        val initiative = Initiative(id, name, tagged, description, location, logo, rating.toDouble())

        ref.child(id.orEmpty()).setValue(initiative)
    }
}