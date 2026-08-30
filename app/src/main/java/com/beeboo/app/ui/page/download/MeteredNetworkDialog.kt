package com.beeboo.app.ui.page.download

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.SignalCellularConnectedNoInternet4Bar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.beeboo.app.R
import com.beeboo.app.ui.component.BottomButtonShape
import com.beeboo.app.ui.component.MiddleButtonShape
import com.beeboo.app.ui.component.BeeBooDialogButtonVariant
import com.beeboo.app.ui.component.BeeBooDialogVariant
import com.beeboo.app.ui.component.TopButtonShape

@Composable
@Preview
fun MeteredNetworkDialog(
    onDismissRequest: () -> Unit = {},
    onAllowOnceConfirm: () -> Unit = {},
    onAllowAlwaysConfirm: () -> Unit = {},
) {
    BeeBooDialogVariant(
        onDismissRequest = onDismissRequest,
        icon = {
            Icon(
                imageVector = Icons.Outlined.SignalCellularConnectedNoInternet4Bar,
                contentDescription = null,
            )
        },
        //        text = {
        //            Text(
        //                text = stringResource(id = R.string.download_disabled_with_cellular),
        //                modifier = Modifier.padding(horizontal = 24.dp)
        //            )
        //        },
        title = { Text(text = stringResource(id = R.string.download_with_cellular_request)) },
        buttons = {
            BeeBooDialogButtonVariant(
                text = stringResource(id = R.string.allow_always),
                shape = TopButtonShape,
            ) {
                onAllowAlwaysConfirm()
            }
            BeeBooDialogButtonVariant(
                text = stringResource(id = R.string.allow_once),
                shape = MiddleButtonShape,
            ) {
                onAllowOnceConfirm()
            }
            BeeBooDialogButtonVariant(
                text = stringResource(id = R.string.dont_allow),
                shape = BottomButtonShape,
            ) {
                onDismissRequest()
            }
        },
    )
}
