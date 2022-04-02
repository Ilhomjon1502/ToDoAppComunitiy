package uz.ilhomjon.todoappcomunitiy.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.ilhomjon.todoappcomunitiy.databinding.ItemRv1Binding
import uz.ilhomjon.todoappcomunitiy.databinding.ItemRv2Binding

class RvAdapter2(var list: List<String>) : RecyclerView.Adapter<RvAdapter2.MyViewHolder>() {

    inner class MyViewHolder(var itemRv: ItemRv2Binding): RecyclerView.ViewHolder(itemRv.root){
        fun onBind(name:String, position: Int){
            itemRv.tvItem2.text = name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemRv2Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size
}