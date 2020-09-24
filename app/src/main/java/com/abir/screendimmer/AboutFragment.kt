/*
 * Copyright (c) 2016 Marien Raat <marienraat@riseup.net>
 * Copyright (c) 2017  Stephen Michel <s@smichel.me>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package com.abir.screendimmer

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

import com.abir.screendimmer.util.*

class AboutFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.about, rootKey)
        pref(R.string.pref_key_version)?.let { versionPref ->
            versionPref.summary = BuildConfig.VERSION_NAME
            versionPref.setOnPreferenceClickListener { _ ->
                activity?.let { showChangelog(it) }
                true
            }
        }
    }
    companion object : Logger()
}