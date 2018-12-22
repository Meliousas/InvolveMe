package me.involve.involveme

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class CustomAdapter(var context: Context, var initiative: ArrayList<Initiative>): BaseAdapter() {

    private class ViewHolder(row: View?){
        var txtName : TextView
        var image : ImageView

        init {
            this.txtName = row?.findViewById(R.id.desc_idea) as TextView
            this.image = row?.findViewById(R.id.logo_idea) as ImageView
        }
    }

    override fun getView(p0: Int, convertView: View?, parent: ViewGroup?): View {

        var view: View?
        var viewHolder: ViewHolder

        if(convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.fragment_list, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var initiative: Initiative = getItem(p0) as Initiative
        viewHolder.txtName.text = initiative.name
        viewHolder.image.setImageResource(initiative.logo)

        return view as View
    }

    override fun getItem(p0: Int): Any {
        return initiative.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return initiative.count()
    }
}