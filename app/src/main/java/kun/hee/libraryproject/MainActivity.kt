package kun.hee.libraryproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setupEvents() {

    }

    override fun setValues() { //http로 시작하는 거 가져와보자
        Glide.with(mContext).load("https://lh3.googleusercontent.com/proxy/nqdykTCq0qPvX7kSoNkvbPUb2QAjhBcQcYkPSByDvZV8ivoKXgfT8uAIvsiJpukSN5lAdIk6jRWNZcoP-TgW9SyeKrPO5m2OwfPcwIUHMzeKtXlnCw").into(profileImg)

        //resourceId로 하면 R.ImageView. 딩가딩가 고

    }


}
