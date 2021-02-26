package com.lxw.hi_item

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.lxw.hi_item.hiitem.HiDataItem
import com.lxw.hi_item.hiitem.ItemData

/**
 *@authour
 *@function 自定义viewHolder版本
 *@date 2021/2/26
 */
class GirdDataItem(data: ItemData) : HiDataItem<ItemData, GirdDataItem.MyHolder>(data) {

    override fun onBindData(holder: MyHolder, position: Int) {
        holder.imageView!!.setImageResource(R.drawable.item_grid)
    }

    override fun getItemLayoutRes(): Int {
        return R.layout.layout_list_item_grid
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView? = null

        init {
            imageView = itemView.findViewById<ImageView>(R.id.item_image);
        }
    }




}