package com.example.yuya.ideaman_demo

import android.app.Dialog
import android.app.DialogFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AddListDialog: DialogFragment() {

    companion object {
        fun newInstance(): AddListDialog {
            val instance = AddListDialog()
            return instance
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        return dialog
    }

    override fun onCreateView(i: LayoutInflater, c: ViewGroup?, b: Bundle?): View? {
        val content: View = i.inflate(R.layout.add_list_dialog, c)
        return content
    }
}