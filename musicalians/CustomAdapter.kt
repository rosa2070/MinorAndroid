package com.asiae.minorfinal

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
    inner class CustomViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtTitle : TextView = itemView.findViewById(R.id.title)
        var coverImage: ImageView = itemView.findViewById(R.id.coverImage)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.custom_row, parent, false)

        // RecyclerView에 표시될 각 항목의 레이아웃을 나타냄
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapter.CustomViewHolder, position: Int) {
        holder.txtTitle.setText(dataList[position].title)

        // Picasso 라이브러리를 이용하여 ImageView에 간단히 이미지 로딩
        // Picasso 빌더 초기화
        val builder = Picasso.Builder(context)
        // OkHttp3Downloader를 사용해 이미지 다운로드
        builder.downloader(OkHttp3Downloader(context))
        // 빌더를 빌드하고, 'thumbnailUrl'을 사용해 이미지 로드
        // 'thumbnailUrl'은 데이터 목록의 각 항목에서 가져온 이미지 URL
        builder.build().load(dataList[position].thumbnailUrl)
            // 이미지 로드 전 표시될 플레이스홀더 이미지 설정
            .placeholder((R.drawable.ic_launcher_background))
            //이미지 로드 중에 오류가 발생할 경우 표시될 오류 이미지를 설정
            .error(R.drawable.ic_launcher_background)
            // 최종적으로 로드된 이미지를 holder.coverImage에 표시
            // 'hoder.coverImage'는 RecyclerView의 각 항목에 대한 ImageView
            .into(holder.coverImage)
    }

    override fun getItemCount(): Int = dataList.size
}