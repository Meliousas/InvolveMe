package me.involve.involveme


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
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

        listView.adapter = CustomListAdapter(applicationContext(), arrInitiative)
        return view
    }




}