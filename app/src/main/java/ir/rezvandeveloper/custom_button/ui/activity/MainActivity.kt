package info.alirezaahmadi.taskapplearn.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.alirezaahmadi.taskapplearn.mvp.model.ModelMainActivity
import info.alirezaahmadi.taskapplearn.mvp.presenter.PresenterMainActivity
import info.alirezaahmadi.taskapplearn.mvp.view.ViewMainActivity

class MainActivity : AppCompatActivity() {

    private lateinit var presenter: PresenterMainActivity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = ViewMainActivity(this)
        setContentView(view.binding.root)

        presenter = PresenterMainActivity(view, ModelMainActivity(this))
        presenter.onCreate()

    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

}