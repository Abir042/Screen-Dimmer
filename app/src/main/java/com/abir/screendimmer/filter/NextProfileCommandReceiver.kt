/*
 * Copyright (c) 2016 Marien Raat <marienraat@riseup.net>
 * Copyright (c) 2017  Stephen Michel <s@smichel.me>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package com.abir.screendimmer.filter

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

import com.abir.screendimmer.model.ProfilesModel
import com.abir.screendimmer.util.activeProfile
import com.abir.screendimmer.util.Logger

class NextProfileCommandReceiver : BroadcastReceiver() {

    companion object : Logger()

    override fun onReceive(context: Context, intent: Intent) {
        Log.i("Next profile requested")
        activeProfile = ProfilesModel.profileAfter(activeProfile)
    }
}
