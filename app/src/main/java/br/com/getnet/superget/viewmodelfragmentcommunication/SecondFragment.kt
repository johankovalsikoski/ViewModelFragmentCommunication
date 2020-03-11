package br.com.getnet.superget.viewmodelfragmentcommunication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment(val pageViewModel: PageViewModel) : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pageViewModel.name.observe(viewLifecycleOwner, object : Observer<String>{
            override fun onChanged(name: String?) {
                textViewName.text = name
            }
        })
    }

}