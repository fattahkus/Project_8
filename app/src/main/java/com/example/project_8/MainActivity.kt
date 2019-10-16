package com.example.project_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Dr. Ir. H. Soekarno",     "Presiden ke-1", R.mipmap.soek))
        list.add(Model("H. M. Soeharto",     "Presiden ke-2", R.mipmap.soeh))
        list.add(Model("Prof. Dr. Ing. H. Bacharuddin Jusuf Habibie",       "Presiden ke-3", R.mipmap.hab))
        list.add(Model("Dr. K. H. Abdurrahman Wahid",        "Presiden ke-4", R.mipmap.abd))
        list.add(Model("Dr. Hj. Dyah Permata Megawati Setyawati Soekarnoputri",        "Presiden ke-5", R.mipmap.meg))
        list.add(Model("Prof. Dr. H. Susilo Bambang Yudhoyono",        "Presiden ke-6", R.mipmap.sby))
        list.add(Model("Ir. H. Joko Widodo",        "Presiden ke-7", R.mipmap.jok))

        listView.adapter = MyListAdapter(this,R.layout.row,list)
        listView.setOnItemClickListener{parent,view,position,id ->
            if (position==0){
                Toast.makeText(this@MainActivity,"Dr. Ir. H. Soekarno adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia yang terjadi pada tanggal 17 Agustus 1945", Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity,"Jenderal Besar TNI H. M. Soeharto, adalah Presiden kedua Indonesia yang menjabat dari tahun 1967 sampai 1998, menggantikan Soekarno", Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity,"Prof. Dr. Ing. H. Bacharuddin Jusuf Habibie, FREng adalah Presiden Republik Indonesia yang ketiga. Sebelumnya, B.J. Habibie menjabat sebagai Wakil Presiden Republik Indonesia ke-7, menggantikan Try Sutrisno. B. J. Habibie menggantikan Soeharto yang mengundurkan diri dari jabatan presiden pada tanggal 21 Mei 1998", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity,"Dr. K. H. Abdurrahman Wahid atau yang akrab disapa Gus Dur adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001. Ia menggantikan Presiden B.J. Habibie setelah dipilih oleh Majelis Permusyawaratan Rakyat hasil Pemilu 1999", Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity,"Dr. Hj. Dyah Permata Megawati Setyawati Soekarnoputri atau umumnya lebih dikenal sebagai Megawati Soekarnoputri atau biasa disapa dengan panggilan \"Mbak Mega\" adalah Presiden Indonesia yang kelima yang menjabat sejak 23 Juli 2001 sampai 20 Oktober 2004", Toast.LENGTH_SHORT).show()
            }
            if (position==5){
            Toast.makeText(this@MainActivity,"Jenderal TNI Prof. Dr. H. Susilo Bambang Yudhoyono, M.A., GCB., AC. adalah Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014.Ia adalah Presiden pertama di Indonesia yang dipilih melalui jalur pemilu. Ia, bersama Wakil Presiden Muhammad Jusuf Kalla, terpilih dalam Pemilu Presiden 2004", Toast.LENGTH_SHORT).show()
            }
            if (position==6){
            Toast.makeText(this@MainActivity,"Ir. H. Joko Widodo atau Jokowi adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dalam Pemilu Presiden 2014", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
