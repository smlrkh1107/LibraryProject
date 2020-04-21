package kun.hee.libraryproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }

    override fun setupEvents() {

    }

    override fun setValues() { //https로 시작하는 거 가져와보자
        Glide.with(mContext).load("https://www.futurekorea.co.kr/news/photo/201909/120628_121827_382.jpg").into(profileImg)

        //resourceId로 하면 R.ImageView. 딩가딩가 고

    }


}
