package com.asiae.retrofitjsonrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 서비스 호출
        val service: GetDataService = RetrofitClientInstance().getRetrofitInstance().create(GetDataService::class.java)
        // 콜백 정의
        val call: Call<List<RetroPhoto>> = service.getAllPhoto()

        call.enqueue(object: Callback<List<RetroPhoto>>{
            override fun onResponse(
                call: Call<List<RetroPhoto>>,
                response: Response<List<RetroPhoto>>
            ) {
                generateDataList(response.body()!!)
            }

            override fun onFailure(call: Call<List<RetroPhoto>>, t: Throwable) {
                Toast.makeText(applicationContext, "Something went wrong...please try later!", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun generateDataList(photoList: List<RetroPhoto>) {
        val recycler: RecyclerView = findViewById(R.id.customRecyclerView)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)
        recycler.layoutManager = layoutManager
        recycler.adapter = CustomAdapter(this, photoList)
    }
}



