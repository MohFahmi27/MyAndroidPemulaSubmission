package com.mfahmi.myandroidpemulasubmission.LokasiHorror

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mfahmi.myandroidpemulasubmission.R

class LokasiHorrorAdapter(private val listLokasiHorror: ArrayList<LokasiHorror>):
    RecyclerView.Adapter<LokasiHorrorAdapter.LokasiViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LokasiViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.main_view_holder_layout, parent, false)
        return LokasiViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: LokasiViewHolder, position: Int) {
        holder.tvName.text = listLokasiHorror[position].name
        holder.tvDetail.text = "${listLokasiHorror[position].detail.substring(0, 30)}..."
        holder.tvlokasi.text = listLokasiHorror[position].lokasi
        Glide.with(holder.itemView.context)
                .load(listLokasiHorror[position].img)
                .into(holder.imgLokasi)
    }

    override fun getItemCount() = listLokasiHorror.size

    inner class LokasiViewHolder(itemview: View): RecyclerView.ViewHolder(itemview) {
        val tvName = itemView.findViewById(R.id.tv_nama) as TextView
        val tvDetail = itemView.findViewById(R.id.tv_detail) as TextView
        val imgLokasi = itemview.findViewById(R.id.img_lokasi) as ImageView
        val tvlokasi = itemView.findViewById(R.id.tv_lokasi) as TextView
    }
}