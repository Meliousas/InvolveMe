package me.involve.involveme


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.google.android.gms.maps.model.LatLng
import me.involve.involveme.MainActivity.Companion.applicationContext

/**
 * Created by Mela on 2018-12-21.
 */

class ListActivity : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
       super.onCreateView(inflater, container, savedInstanceState)

        var view = inflater.inflate(R.layout.fragment_list, container, false)
        var listView = view.findViewById<ListView>(R.id.list_item)
        var arrInitiative: ArrayList<Initiative> = ArrayList()
        arrInitiative.add(Initiative("Renovate schoolyard",
                Tag.architecture,
                "It is crucial for success of our education - to have proper place to learn. I present to you...",
                LatLng(20.0,40.0),
                R.drawable.measuring))

        arrInitiative.add(Initiative("We need plants!",
                Tag.nature,
                "There is no color in our neighbourhood, we should buy some plants!",
                LatLng(21.0,40.0),
                R.drawable.flowers))

        listView.adapter = CustomAdapter(applicationContext(), arrInitiative)
        return view
    }


}