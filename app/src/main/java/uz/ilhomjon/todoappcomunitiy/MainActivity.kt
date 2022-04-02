package uz.ilhomjon.todoappcomunitiy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import uz.ilhomjon.todoappcomunitiy.Adapter.RvAdapter
import uz.ilhomjon.todoappcomunitiy.Adapter.RvAdapter2
import uz.ilhomjon.todoappcomunitiy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var listData:ArrayList<String>
    lateinit var rvAdapter: RvAdapter
    lateinit var rvAdapter2: RvAdapter2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listData = ArrayList()
        listData.add("Buy a milk")
        listData.add("Buy a milk")
        listData.add("Buy a milk")
        listData.add("Buy a milk")
        listData.add("Buy a milk")
        listData.add("Buy a milk")
        listData.add("Buy a milk")
        listData.add("Buy a milk")
        listData.add("Buy a milk")


        rvAdapter = RvAdapter(listData)
        rvAdapter2 = RvAdapter2(listData)
        binding.rv.adapter = rvAdapter
        binding.rv2.adapter = rvAdapter2

//        binding.btnAdd.setOnClickListener {
//            val bottomSheetDialog = BottomSheetDialog(this)
//            bottomSheetDialog.setContentView(binding.root)
//            bottomSheetDialog.show()
//        }
    }
}