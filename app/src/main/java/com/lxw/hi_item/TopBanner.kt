package com.lxw.hi_item

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.lxw.hi_item.hiitem.HiDataItem
import com.lxw.hi_item.hiitem.ItemData

/**
 *@authour
 *@function
 *@date 2021/2/26
 */
class TopBanner(data: ItemData) : HiDataItem<ItemData, RecyclerView.ViewHolder>(data) {

    override fun onBindData(holder: RecyclerView.ViewHolder, position: Int) {
        val imageView: ImageView = holder.itemView.findViewById<ImageView>(R.id.item_image);
        imageView.setImageResource(R.drawable.item_banner)
    }

    override fun getItemLayoutRes(): Int {
        return R.layout.layout_list_item_banner
    }

}