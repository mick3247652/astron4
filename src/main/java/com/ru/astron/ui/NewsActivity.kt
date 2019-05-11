package com.ru.astron.ui

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.ru.astron.R
import com.ru.astron.databinding.ActivityNewsBinding
import com.ru.astron.models.ArticleNews
import com.ru.astron.models.ArticleViewModel
import kotlinx.android.synthetic.main.activity_phone_select.*

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding
    private lateinit var model: ArticleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        binding = DataBindingUtil.setContentView<ActivityNewsBinding>(this, R.layout.activity_news)
        model = ViewModelProviders.of(this).get(ArticleViewModel::class.java)

        binding.apply {
            recycler.adapter = model.articleAdapter
            recycler.layoutManager = LinearLayoutManager(this@NewsActivity)
        }
        model.articleAdapter.onItemClick = {v -> onItemClick(v)}
        setSupportActionBar(toolbar as Toolbar)
        ActionBarActivity.configureActionBar(supportActionBar)
        title = resources.getString(R.string.news_title)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun onItemClick(v: Int){
        val article = model.articleAdapter.getItem(v)
        if(!article.link.isEmpty()){
            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url", article.link)
            startActivity(intent)
        }
    }
}
