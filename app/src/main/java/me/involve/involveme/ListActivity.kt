package me.involve.involveme


import android.os.Bundle
import android.provider.ContactsContract
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

        val d: DataHolder = DataHolder()
        var arrInitiative: ArrayList<Initiative> =  d.getArrInitiatives()
//        var arrInitiative: ArrayList<Initiative> = ArrayList()
//        arrInitiative.add(Initiative("55","Renovate schoolyard",
//                Tag.architecture,
//                "It is crucial for success of our education - to have proper place to learn. I present to you...",
//                LatLng(20.0,40.0),
//                R.drawable.measuring , 0.3))
//
//        arrInitiative.add(Initiative("56","We need plants!",
//                Tag.nature,
//                "There is no color in our neighbourhood, we should buy some plants.",
//                LatLng(21.0,40.0),
//                R.drawable.flowers, 3.4))
//
//        arrInitiative.add(Initiative("2","Cleaning playground every monday",
//                Tag.nature,
//                "There is too much garbage in our neighbourhood. " +
//                        "There is too much garbage in our neighbourhood." +
//                        "There is too much garbage in our neighbourhood." +
//                        "There is too much garbage in our neighbourhood.",
//                LatLng(25.0,40.0),
//                R.drawable.garbage, 5.0))
//
//        arrInitiative.add(Initiative("59","New party event",
//                Tag.entertainment,
//                "New party eventNew party eventNew party eventNew party eventNew party eventNew party event" +
//                        "New party eventNew party eventNew party eventNew party eventNew party eventNew party event" +
//                        "New party eventNew party eventNew party eventNew party eventNew party eventNew party event" +
//                        "New party eventNew party eventNew party eventNew party eventNew party eventNew party event" +
//                        "New party eventNew party eventNew party eventNew party eventNew party eventNew party event",
//                LatLng(25.2,40.0),
//                R.drawable.karaoke, 5.0))
        listView.adapter = CustomListAdapter(applicationContext(), arrInitiative)
        return view
    }




}