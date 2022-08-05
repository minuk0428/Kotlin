package com.example.gimal

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v:VideoView = findViewById(R.id.videoView)
        v.setVideoPath("android.resource://com.example.gimal/"+R.raw.busan)
        //미디어파일 재생
        v.start()
        //미디어 파일이 로드되었고 준비가 되었을 때 호출할 이벤트

        var btn1 : ImageButton = findViewById<ImageButton>(R.id.btn123)
        var Ibtn1 : ImageButton = findViewById<ImageButton>(R.id.Imgbtn1)
        var Ibtn2 : ImageButton = findViewById<ImageButton>(R.id.Imgbtn2)
        var btnhart1 : ImageButton = findViewById<ImageButton>(R.id.Imgbtnhart1)
        var btnhart2 : ImageButton = findViewById<ImageButton>(R.id.Imgbtnhart2)
        var download : ImageButton = findViewById<ImageButton>(R.id.down1)
        var share1: ImageButton = findViewById<ImageButton>(R.id.share)


        var i:Int=0
        btn1.setOnClickListener {
            i=(i+1)%4
            if(i==1){
            v.setVideoPath("android.resource://com.example.gimal/"+R.raw.gang)
            //미디어파일 재생
            v.start()
            //미디어 파일이 로드되었고 준비가 되었을 때 호출할 이벤트
        }
            if(i==2){
                v.setVideoPath("android.resource://com.example.gimal/"+R.raw.jeju)
                //미디어파일 재생
                v.start()
                //미디어 파일이 로드되었고 준비가 되었을 때 호출할 이벤트
            }
            if(i==3){
                v.setVideoPath("android.resource://com.example.gimal/"+R.raw.busan)
                //미디어파일 재생
                v.start()
                //미디어 파일이 로드되었고 준비가 되었을 때 호출할 이벤트
            }
            if(i==3)
            {
                i=0
            }
        }
        Ibtn1.setOnClickListener {
            if(i==0) {
                var net = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.visitbusan.net/index.do?menuCd=DOM_000000202002001000&uc_seq=1218&lang_cd=ko&pagingParms=4ca15f3a76a21f554a6e515f5344f50c4f734814d27260977c0eb574b1e0019a33f5a8e2dd587a9efb82cc91cf112987488312a3bc08c3054da8c190c930f6592e7894a7ed3cf4243291b2529527de050aa608ee54ad79feb8b43e0becf2aedf306446a26175f37928b2e64d297ab48f8acfae3743ce2794ef15d99eb793341329c53a76d24a81ef72a11ca917970aac34400ec0365d93e364d7a859d58178e212648c28901350cb20330ec09b4e8c7ee5e2b8287a2a6536a889e832bf7d31f847bff6a467836ed9d75537b39410af39627c2b313731ee41a64dc547815f320b6242d2505ff463a634757c4ad1fb5316c17e3c6c881b1202936a9591f574a9b458fe7ada378c8e24a939d38009efceb2f1d2f3d9fb0a84335999d70d74a175a02229fcd269f25ecae09cba47d7fa5b4ca79471889a1020e6226a199377b97ead69d777bcce27c101be7225c1ffeb0036367494277c22e6ec9cff0114e7cadf3a2d867367262d1b5f6a717ace24b4cae0734d3410c3de7cbbe8e8e2de4a08c9f7f2d71419b760deedc85bfd092d20cf83296e62049d974032c50fee7f8aa0e20719104acb04653baa264be502ef0f1cca19faf72dfd77b0bf1930b929eb2ee93dbea2f5bff2d9ad4661906d2630252c7a77755caae6cc44ce63bad15ddb06615ce3b6b3e2ad2ade8ddc56b9a8835779c8968497af73b9cee2d26904ec9ddb2852944561dc3a786f3e5c68c8e0e32ae35abb0978563b823f553103c0757fd7e769114895883f6c30f8d9107f51b43406263d9ba68fff184ad872b9b0efeefd8d3a2a809eb15b6818f12446d25d8cd7efecc9e73ea0fd749ff1"))
                startActivity(net)
            }

            if(i==1) {
                var net1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gn.go.kr/tour/sub02_01_01.do"))
                startActivity(net1)
            }

            if(i==2) {
                var net1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.visitjeju.net/kr/detail/view?contentsid=CONT_000000000500349&menuId=DOM_000001718001000000#p1"))
                startActivity(net1)
            }

            if(i==2) {
                var net1 = Intent(Intent.ACTION_VIEW, Uri.parse(" var net1 = Intent(Intent.ACTION_VIEW, Uri.parse(\"https://www.google.com\"))\n" +
                        "                startActivity(net1)"))
                startActivity(net1)
            }


        }
        Ibtn2.setOnClickListener {
            val intent = Intent(this, SubMainActivity::class.java)
            startActivity(intent)        }


        btnhart1.setOnClickListener{
            btnhart2.setVisibility(View.VISIBLE)
            Toast.makeText(applicationContext, "좋아요를 눌렀습니다 😍", Toast.LENGTH_SHORT).show()
        }
        btnhart2.setOnClickListener{
            btnhart2.setVisibility(View.INVISIBLE)
            Toast.makeText(applicationContext, "좋아요를 취소했습니다.😂", Toast.LENGTH_SHORT).show()
        }

        download.setOnClickListener{
            Toast.makeText(applicationContext, "다운로드 시작합니다.", Toast.LENGTH_SHORT).show()
        }
        share1.setOnClickListener{
            Toast.makeText(applicationContext, "공유합니다.", Toast.LENGTH_SHORT).show()
        }




        }

    }

