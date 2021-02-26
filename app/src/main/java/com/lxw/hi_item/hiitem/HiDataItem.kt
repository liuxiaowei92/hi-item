package com.lxw.hi_item.hiitem

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 *@authour
 *@function
 *@date 2021/2/25
 */
abstract class HiDataItem<DATA, VH :  RecyclerView.ViewHolder>(data: DATA) {
    private lateinit var adapter: HiAdapter
    var mData: DATA? = null

    init {
        this.mData = data
    }

    abstract fun onBindData(holder: VH, position: Int)

    /**
     * 返回该item的布局资源
     */
    open fun getItemLayoutRes(): Int {
        return -1
    }

    /**
     * 返回该item的视图view
     */
    open fun getItemView(parent: ViewGroup): View? {
        return null
    }

    fun setAdapter(adapter: HiAdapter) {
        this.adapter = adapter
    }


    /**
     * 刷新列表
     */
    fun refreshItem() {
        adapter.refreshItem(this)
    }

    /**
     * 移除列表
     */
    fun removeItem() {
        adapter.removeItem(this)
    }

    /**
     * 改item在列表上占据几列
     */
    open fun getSpanSize(): Int {
        return 0
    }
    /**
     * 该item被滑进屏幕
     */
    open fun onViewAttachedToWindow(holder: VH) {

    }
    /**
     * 该item被滑出屏幕
     */
    open fun onViewDetachedFromWindow(holder: VH) {

    }
}