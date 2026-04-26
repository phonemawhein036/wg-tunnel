package com.zaneschepke.wireguardautotunnel.ui.screens.tunnels.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.zaneschepke.wireguardautotunnel.R
import com.zaneschepke.wireguardautotunnel.ui.common.sheet.CustomBottomSheet
import com.zaneschepke.wireguardautotunnel.ui.common.sheet.SheetOption

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TunnelImportSheet(
    onDismiss: () -> Unit,
    onUrlClick: () -> Unit,
) {
    CustomBottomSheet(
        buildList {
            add(
                SheetOption(
                    Icons.Outlined.Link,
                    stringResource(R.string.add_from_url),
                    onClick = {
                        onDismiss()
                        onUrlClick()
                    },
                )
            )
        }
    ) {
        onDismiss()
    }
}
