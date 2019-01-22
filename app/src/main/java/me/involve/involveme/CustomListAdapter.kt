package me.involve.involveme

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class CustomListAdapter(var context: Context, var initiative: ArrayList<Initiative>): BaseAdapter() {

    private class ViewHolder(row: View?){
        var txtName : TextView
        var image : ImageView

        init {
            this.txtName = row?.findViewById(R.id.desc_idea) as TextView
            this.image = row?.findViewById(R.id.logo_idea) as ImageView

            row.setOnClickListener{
                val intent = Intent(row.context, DetailsActivityNew::class.java)

                row.context.startActivity(intent)
            }
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

        viewHolder.image.setOnClickListener {

            val intent = Intent(context, DetailsActivityNew::class.java)
            intent.putExtra("name", initiative.name!!)
            intent.putExtra("description", initiative.description!!)
            intent.putExtra("image", initiative.logo!!)
            context!!.startActivity(intent)
        }

        viewHolder.txtName.setOnClickListener {

            val intent = Intent(context, DetailsActivityNew::class.java)
            intent.putExtra("name", initiative.name!!)
            intent.putExtra("description", initiative.description!!)
            intent.putExtra("image", initiative.logo!!)
            context!!.startActivity(intent)
        }
        viewHolder.image.setImageResource(initiative.logo!!)
        viewHolder.txtName.text = initiative.name!!


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