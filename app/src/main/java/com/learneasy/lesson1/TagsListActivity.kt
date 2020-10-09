package com.learneasy.lesson1

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_tags_list.*


class TagsListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tags_list)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        toolbar.setNavigationOnClickListener{
            finish()
        }
        val username = intent.getStringExtra(Constants.USERNAME)
        usernameTV.text = username
        createList()

    }
    fun createList(){
        val linearLayoutManager = LinearLayoutManager(applicationContext)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        tagsRV.layoutManager = linearLayoutManager
        val tags = ArrayList<String>()
        tags.add("tag1")
        tags.add("tag2")
        val adapter = TagsAdapter(tags, object : MyOnClickListener{
            override fun onClicked(tag: String) {
                Log.d("TagsListActivity", "tag = " + tag)
            }

        })
        tagsRV.adapter = adapter
    }
}