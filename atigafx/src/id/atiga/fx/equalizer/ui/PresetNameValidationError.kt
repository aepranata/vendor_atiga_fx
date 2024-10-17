/*
 * Copyright (C) 2024 Paranoid Android
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package id.atiga.fx.equalizer.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import id.atiga.fx.R

enum class PresetNameValidationError {
    NAME_EXISTS,
    NAME_TOO_LONG;

    @Composable
    fun toErrorMessage() =
        stringResource(
            id = when (this) {
                NAME_EXISTS -> R.string.dolby_geq_preset_name_exists
                NAME_TOO_LONG -> R.string.dolby_geq_preset_name_too_long
            }
        )
}