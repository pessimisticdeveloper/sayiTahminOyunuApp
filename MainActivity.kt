package com.mucomarley.sayitahminoyunu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private var rasgeleSayi = 0

    private var sayac = 10


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rasgeleSayi = Random.nextInt(101)

        println("rasgele sayı: ${rasgeleSayi}")

        tahminYap.setOnClickListener{

            sayac = sayac - 1

            val tahmin = sayiGiriniz.text.toString().toInt()

            if (tahmin == rasgeleSayi){

                sonuc.text = "BAŞARDIN REİS :)"

            }
            if(tahmin > rasgeleSayi){

                sonuc.text = "Azalt"
                kalanHak.text = "kalan hak: ${sayac}"

            }
            if(tahmin < rasgeleSayi){

                sonuc.text = "Arttır"
                kalanHak.text = "kalan hak: ${sayac}"

            }
            if(sayac == 0){

                sonuc.text = "BAŞARAMADIN ABİ :("


            }

            sayiGiriniz.setText("")
        }

    }
}