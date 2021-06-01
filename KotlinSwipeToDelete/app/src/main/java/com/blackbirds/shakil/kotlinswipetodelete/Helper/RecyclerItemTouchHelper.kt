package com.blackbirds.shakil.kotlinswipetodelete.Helper

import android.graphics.Canvas
import android.view.View
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.blackbirds.shakil.kotlinswipetodelete.Adapter.CartListAdapter.MyViewHolder
import com.blackbirds.shakil.kotlinswipetodelete.R

class RecyclerItemTouchHelper(dragDirs: Int, swipeDirs: Int, private val listener: RecyclerItemTouchHelperListener?) :
        ItemTouchHelper.SimpleCallback(dragDirs, swipeDirs) {

    override fun onMove(recyclerView: RecyclerView,
                        viewHolder: RecyclerView.ViewHolder,
                        target: RecyclerView.ViewHolder): Boolean {
        return true
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        listener?.onSwiped(viewHolder, direction, viewHolder.adapterPosition)
    }

    override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
        val foregroundView =
                (viewHolder as MyViewHolder).itemView.findViewById<View>(R.id.view_foreground)
        getDefaultUIUtil().clearView(foregroundView)
    }

    override fun onSelectedChanged(viewHolder: RecyclerView.ViewHolder?, actionState: Int) {
        if (viewHolder != null) {
            val foregroundView =
                    (viewHolder as MyViewHolder).itemView.findViewById<View>(R.id.view_foreground)
            getDefaultUIUtil().onSelected(foregroundView)
        }
    }

    override fun convertToAbsoluteDirection(flags: Int, layoutDirection: Int): Int {
        return super.convertToAbsoluteDirection(flags, layoutDirection)
    }

    override fun onChildDraw(
            c: Canvas, recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder, dX: Float, dY: Float,
            actionState: Int, isCurrentlyActive: Boolean
    ) {
        val foregroundView =
                (viewHolder as MyViewHolder).itemView.findViewById<View>(R.id.view_foreground)
        getDefaultUIUtil().onDraw(
                c, recyclerView, foregroundView, dX, dY,
                actionState, isCurrentlyActive
        )
    }

    override fun onChildDrawOver(
            c: Canvas, recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder, dX: Float, dY: Float,
            actionState: Int, isCurrentlyActive: Boolean
    ) {
        val foregroundView =
                (viewHolder as MyViewHolder).itemView.findViewById<View>(R.id.view_foreground)
        getDefaultUIUtil().onDrawOver(
                c, recyclerView, foregroundView, dX, dY,
                actionState, isCurrentlyActive
        )
    }
}