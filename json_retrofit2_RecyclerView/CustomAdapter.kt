package com.asiae.retrofitjsonrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso

class CustomAdapter(var context: Context, var dataList: List<RetroPhoto>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {
    // 뷰 홀더 생성
    inner class CustomViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
        var txtTitle: TextView = itemView.findViewById(R.id.title)
        var coverImage: ImageView = itemView.findViewById(R.id.coverImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.custom_row, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.txtTitle.setText(dataList[position].title)

        // Picasso 라이브러리를 이용해 ImageView에 간단히 이미지 로딩
        val builder = Picasso.Builder(context)
        builder.downloader(OkHttp3Downloader(context))
        builder.build().load(dataList[position].thumbnailUrl)
            .placeholder((R.drawable.ic_launcher_background))
            .error(R.drawable.ic_launcher_background)
            .into(holder.coverImage)

    }

    override fun getItemCount(): Int = dataList.size


}