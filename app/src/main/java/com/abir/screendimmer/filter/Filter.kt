/*
 * Copyright (c) 2016  Marien Raat <marienraat@riseup.net>
 * Copyright (c) 2017  Stephen Michel <s@smichel.me>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package com.abir.screendimmer.filter

import com.abir.screendimmer.model.Profile

interface Filter {
    fun onCreate()
    fun onDestroy()
    var profile: Profile
}
