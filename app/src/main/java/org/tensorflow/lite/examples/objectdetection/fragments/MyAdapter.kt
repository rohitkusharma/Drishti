package org.tensorflow.lite.examples.objectdetection.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ExploreFragment()
            1 -> ReadFragment()
            2 -> FindFragment()
            3 -> ScanFragment()
            else -> ExploreFragment()
        }
    }
}
