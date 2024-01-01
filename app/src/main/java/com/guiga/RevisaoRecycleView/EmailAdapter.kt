package com.guiga.RevisaoRecycleView

import android.graphics.Color
import android.graphics.Typeface.*
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guiga.RevisaoRecycleView.model.Email


class EmailAdapter (val emails : MutableList<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun getItemCount(): Int = emails.size

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(email: Email) {
            with(email){
                val hash = user.hashCode()
                itemView.findViewById<TextView>(R.id.tv_icon).text = user.first().toString()
                itemView.findViewById<TextView>(R.id.tv_icon).background = oval(Color.rgb(hash, hash / 2, 0))
                itemView.findViewById<TextView>(R.id.tv_user).text = user
                itemView.findViewById<TextView>(R.id.tv_subject).text = subject
                itemView.findViewById<TextView>(R.id.tv_preview).text = preview
                itemView.findViewById<TextView>(R.id.tv_date).text = date

                itemView.findViewById<TextView>(R.id.tv_user).setTypeface(DEFAULT, if(email.unread) BOLD else NORMAL)
                itemView.findViewById<TextView>(R.id.tv_subject).setTypeface(DEFAULT, if(email.unread) BOLD else NORMAL)
                itemView.findViewById<TextView>(R.id.tv_date).setTypeface(DEFAULT, if(email.unread) BOLD else NORMAL)

                itemView.findViewById<ImageView>(R.id.img_star).setImageResource(
                    if (stared) R.drawable.ic_star_black
                    else R.drawable.ic_star
                )
            }

        }
    }

    fun oval ( color: Int): Drawable {
        val shape = GradientDrawable()
        shape.shape = GradientDrawable.OVAL
        shape.setColor(color)
        return shape
    }
}