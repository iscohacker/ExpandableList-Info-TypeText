package uz.iskandarbek.expandable13.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import uz.iskandarbek.expandable13.databinding.ChildItemBinding
import uz.iskandarbek.expandable13.databinding.GroupItemBinding

class ExpandableAdapter (
    var titleList: ArrayList<String>,
    var map: HashMap<String, ArrayList<String>>,var expandAction: ExpandAction
) : BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return titleList.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        val groupName = titleList[groupPosition]
        return map[groupName]?.size!!
    }

    override fun getGroup(groupPosition: Int): Any {
        return titleList[groupPosition]
    }

    override fun getChild(groupPosition: Int, p1: Int): Any {
        val groupName = titleList[groupPosition]
        return map[groupName]!!
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
//        Agar bu funksiya true qaytarsa, demak har bir elementning IDsi o'zgarmaydi
//        va har safar getGroupId() va getChildId() funksiyalari chaqirilganda bir xil
//        qiymat qaytaradi. Bu, masalan, foydalanuvchi interfeysining ishlashini yaxshilash
//        uchun qo'llanilishi mumkin, chunki Android tizimi IDlar o'zgarmasligini bilsa,
//        ma'lumotlar bilan ishlashni optimallashtirishi mumkin.
//        Agar false qaytarsa, demak IDlar o'zgarishi mumkin va har
//        safar getGroupId() va getChildId() chaqirilganda turli qiymatlar qaytarilishi mumkin.
        return true
    }

    override fun getGroupView(
        groupPosition: Int,
        childPosition: Boolean,
        p2: View?,
        p3: ViewGroup?
    ): View {
        val groupItemBinding = GroupItemBinding.inflate(LayoutInflater.from(p3?.context), p3, false)
        groupItemBinding.groupName.text = titleList[groupPosition]
        return groupItemBinding.root
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        p2: Boolean,
        p3: View?,
        p4: ViewGroup?
    ): View {
        val childItemBinding = ChildItemBinding.inflate(LayoutInflater.from(p4?.context), p4, false)
        childItemBinding.childName.text = map[titleList[groupPosition]]?.get(childPosition)
        childItemBinding.root.setOnClickListener {
            expandAction.childClick(map[titleList[groupPosition]]?.get(childPosition)!!)
        }
        return childItemBinding.root
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
//         ExpandableListView ichidagi bolalar elementlari (child items) tanlanishi mumkin yoki
//                 mumkin emasligini aniqlaydi.
//        Agar bu funksiya true qiymatini qaytarsa, foydalanuvchi bolalar
//        elementlarini bosishi va tanlashi mumkin bo'ladi. Agar false qaytarsa,
//        bolalar elementlari tanlanmaydi va ularga hech qanday interaktivlik qo'llanilmaydi.
//
        return true
    }

    interface ExpandAction {
        fun childClick(name: String)
    }
}