package uz.ilhomjon.todoappcomunitiy.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.ilhomjon.todoappcomunitiy.R
import uz.ilhomjon.todoappcomunitiy.databinding.ItemRv1Binding

class RvAdapter(var list: List<String>) : RecyclerView.Adapter<RvAdapter.MyViewHolder>() {

    inner class MyViewHolder(var itemRv:ItemRv1Binding):RecyclerView.ViewHolder(itemRv.root){
        fun onBind(name:String, position: Int){
            itemRv.tvItem.text = name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemRv1Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size
}