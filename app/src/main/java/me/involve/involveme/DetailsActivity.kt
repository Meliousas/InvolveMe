//package me.involve.involveme
//
//
//import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
//import android.widget.ScrollView
//import com.google.android.gms.maps.model.LatLng
//import me.involve.involveme.MainActivity.Companion.applicationContext
//import kotlinx.android.synthetic.main.activity_main.*
//
///**
// * Created by Mela on 2018-12-21.
// */
//
//class DetailsActivity : AppCompatActivity() {
//
//    override fun onCreate( savedInstanceState: Bundle?){
//       super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_details)
//
//        var detailsView = findViewById<ScrollView>(R.id.details_item)
//        var initiative: Initiative
//
//        initiative = (Initiative("Renovate schoolyard",
//                Tag.architecture,
//                "It is crucial for success of our education - to have proper place to learn. I present to you...",
//                LatLng(20.0,40.0),
//                R.drawable.measuring , 0.3))
//
//          detailsView.adapter = CustomDetailsAdapter(applicationContext(), initiative)
//    }
//
//
//}