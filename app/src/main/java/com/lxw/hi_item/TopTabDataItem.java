package com.lxw.hi_item;

import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.lxw.hi_item.hiitem.HiDataItem;
import com.lxw.hi_item.hiitem.ItemData;

import org.jetbrains.annotations.NotNull;

/**
 * @authour
 * @function
 * @date 2021/2/26
 */
public class TopTabDataItem extends HiDataItem<ItemData, RecyclerView.ViewHolder> {
    public TopTabDataItem(ItemData itemData) {
        super(itemData);
    }

    @Override
    public void onBindData(@NotNull RecyclerView.ViewHolder holder, int position) {
        ImageView imageView = holder.itemView.findViewById(R.id.item_image);
        imageView.setImageResource(R.drawable.item_top_tab);
    }

    @Override
    public int getItemLayoutRes() {
        return R.layout.layout_list_item_top_tab;
    }
}
