package com.example.yuya.ideaman_demo

import android.app.Dialog
import android.app.DialogFragment
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.AutoCompleteTextView
import android.widget.ImageButton

class AddListDialog: DialogFragment() {

    private var listText: AutoCompleteTextView? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setContentView(R.layout.add_list_dialog)
        // 背景を透明にする
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        // ダイアログの大きさを変更
        dialog.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        // ソフトウェアキーボードを表示
        dialog.window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)

        return dialog
    }

    override fun onCreateView(i: LayoutInflater, c: ViewGroup?, b: Bundle?): View? {
        val content = i.inflate(R.layout.add_list_dialog, c)

        listText = content.findViewById<AutoCompleteTextView>(R.id.list_text)
        //listText!!.setText("")

        val btnCancel = content.findViewById<ImageButton>(R.id.btn_cancel)
        btnCancel.setOnClickListener{ dismiss() }

        val btnOk = content.findViewById<ImageButton>(R.id.btn_ok)
        btnOk!!.setOnClickListener {
            var content = listText!!.text.toString()
            Log.d("input content", content)
            ListContent.addContent(content)
            dismiss()
        }

        return content
    }

    companion object {
        fun newInstance(): AddListDialog {
            val instance = AddListDialog()
            return instance
        }
    }
}