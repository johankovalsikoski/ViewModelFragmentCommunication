package br.com.getnet.superget.viewmodelfragmentcommunication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment(val pageViewModel: PageViewModel) : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textInputTextName.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) { }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) { }

            override fun onTextChanged(charSequence: CharSequence, p1: Int, p2: Int, p3: Int) {
                pageViewModel.setName(charSequence.toString())
            }

        })
    }

}