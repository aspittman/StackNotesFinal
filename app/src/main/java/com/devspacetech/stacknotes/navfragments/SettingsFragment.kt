package com.devspacetech.stacknotes.navfragments

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.devspacetech.stacknotes.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}