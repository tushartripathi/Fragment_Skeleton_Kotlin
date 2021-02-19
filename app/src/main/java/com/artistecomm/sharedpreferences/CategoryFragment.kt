package com.artistecomm.sharedpreferences

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CategoryFragment : Fragment() {


    private lateinit var textLbl: TextView
    lateinit var listnerObj: OnCategoryInteractionListner

    override fun onAttach(context: Context)
    {
        super.onAttach(context)
        if(context is OnCategoryInteractionListner)
            listnerObj = context
        else
            throw RuntimeException("Context Actyivity must implemt OnCategorInteractionListner")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var view: View? = getView()
        if(view != null)
            textLbl = view.findViewById(R.id.fragmentText)
            textLbl.setText("Its working...")
            listnerObj.categoryIsTaped(1)
    }
    companion object Singleton{
        @JvmStatic
        fun newInstance():CategoryFragment {
            return CategoryFragment()
        }

    }

}