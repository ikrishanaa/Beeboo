package com.beeboo.app.database.backup

import com.beeboo.app.database.objects.CommandTemplate
import com.beeboo.app.database.objects.DownloadedVideoInfo
import com.beeboo.app.database.objects.OptionShortcut
import kotlinx.serialization.Serializable

@Serializable
data class Backup(
    val templates: List<CommandTemplate>? = null,
    val shortcuts: List<OptionShortcut>? = null,
    val downloadHistory: List<DownloadedVideoInfo>? = null,
)
