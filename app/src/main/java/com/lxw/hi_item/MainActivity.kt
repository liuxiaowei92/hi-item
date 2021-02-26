package com.lxw.hi_item

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lxw.hi_item.hiitem.HiAdapter
import com.lxw.hi_item.hiitem.HiDataItem
import com.lxw.hi_item.hiitem.ItemData
import org.devio.`as`.hi.hiitem.hiitem.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var hiAdapter = HiAdapter(this)
        val recycler_view = findViewById<RecyclerView>(R.id.recycler_view)
        recycler_view.layoutManager = GridLayoutManager(this, 2)
        recycler_view.adapter = hiAdapter;


        var dataSets : ArrayList<HiDataItem<*, out RecyclerView.ViewHolder>> = ArrayList()
        dataSets.add(TopTabDataItem(ItemData()))
        dataSets.add(TopBanner(ItemData()))
        dataSets.add(GirdDataItem(ItemData()))
        dataSets.add(ActivityDataItem(ItemData()))//活动区域
        dataSets.add(ItemTabDataItem(ItemData()))//商品tab栏

        for (i in 0..9) {
            if (i % 2 == 0) {
                //feeds流的视频类型
                dataSets.add(VideoDataItem(1, ItemData()))
            } else {
                //feeds流的图片类型
                dataSets.add(ImageDataItem(1, ItemData()))
            }
        }

        hiAdapter.addItems(dataSets, false)


    }
}