package com.blackbirds.shakil.kotlinswipetodelete

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.*
import com.blackbirds.shakil.kotlinswipetodelete.Adapter.CartListAdapter
import com.blackbirds.shakil.kotlinswipetodelete.Common.Common
import com.blackbirds.shakil.kotlinswipetodelete.Helper.RecyclerItemTouchHelper
import com.blackbirds.shakil.kotlinswipetodelete.Helper.RecyclerItemTouchHelperListener
import com.blackbirds.shakil.kotlinswipetodelete.Model.Item
import com.blackbirds.shakil.kotlinswipetodelete.Retrofit.IMenuRequest
import com.google.android.material.snackbar.Snackbar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MainActivity : AppCompatActivity(), RecyclerItemTouchHelperListener {

    var recyclerView: RecyclerView? = null
    var itemList: MutableList<Item> = ArrayList()
    var adapter: CartListAdapter? = null
    var rootLayout: CoordinatorLayout? = null
    var toolbar: Toolbar? = null

    var mService: IMenuRequest? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Black Birds"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        mService = Common.menuRequest

        recyclerView = findViewById(R.id.recycler_view)
        rootLayout = findViewById(R.id.rootLayout)

        adapter = CartListAdapter(this, itemList)

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView?.setLayoutManager(layoutManager)
        recyclerView?.setHasFixedSize(true)
        recyclerView?.setItemAnimator(DefaultItemAnimator())
        recyclerView?.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        recyclerView?.setAdapter(adapter)

        val itemTouchHelperCallback: ItemTouchHelper.SimpleCallback =
            RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT, this)
        ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView)

        // making http call and fetching menu json
        // making http call and fetching menu json
        prepareCart()

    }

    private fun prepareCart() {
        mService?.getMenuList()?.enqueue(object : Callback<MutableList<Item>> {
            override fun onResponse(call: Call<MutableList<Item>>, response: Response<MutableList<Item>>) {
                itemList.clear()
                itemList.addAll(response.body() as MutableList<Item>)
                adapter?.notifyDataSetChanged()
            }

            override fun onFailure(call: Call<MutableList<Item>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder?, direction: Int, position: Int) {
        if (viewHolder is CartListAdapter.MyViewHolder) {
            // get the removed item name to display it in snack bar
            val name: String = itemList.get(viewHolder.adapterPosition).name.toString()

            // backup of removed item for undo purpose

            // backup of removed item for undo purpose
            val deletedItem = itemList[viewHolder.getAdapterPosition()]
            val deletedIndex = viewHolder.adapterPosition

            // remove the item from recycler view
            adapter?.removeItem(deletedIndex)

            // showing snack bar with Undo option
            val snackbar = rootLayout?.let {
                Snackbar.make(it, "$name removed from cart!", Snackbar.LENGTH_LONG)
            }
            snackbar?.setAction("UNDO") { view: View? ->

                // undo is selected, restore the deleted item
                adapter?.restoreItem(deletedItem, deletedIndex)
            }
            snackbar?.setActionTextColor(Color.YELLOW)
            snackbar?.show()
        }
    }
}
