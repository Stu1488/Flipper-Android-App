package com.flipperdevices.faphub.installation.button.impl.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.flipperdevices.core.ui.theme.FlipperThemeInternal
import com.flipperdevices.core.ui.theme.LocalPallet
import com.flipperdevices.faphub.installation.button.impl.R

@Composable
fun ComposableFapInstallButton(
    textSize: TextUnit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    ComposableFlipperButton(
        modifier = modifier,
        text = stringResource(R.string.faphub_installation_install),
        color = LocalPallet.current.accent,
        fontSize = textSize,
        onClick = onClick
    )
}

@Composable
fun ComposableFapInstalledButton(
    textSize: TextUnit,
    modifier: Modifier = Modifier
) {
    ComposableFlipperButton(
        modifier = modifier,
        text = stringResource(R.string.faphub_installation_installed),
        color = LocalPallet.current.text20,
        fontSize = textSize
    )
}

@Composable
fun ComposableFapUpdateButton(
    textSize: TextUnit,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    ComposableFlipperButton(
        modifier = modifier,
        text = stringResource(R.string.faphub_installation_update),
        color = LocalPallet.current.updateProgressGreen,
        fontSize = textSize,
        onClick = onClick
    )
}

@Composable
fun ComposableFapInstallingButton(
    percent: Float,
    textSize: TextUnit,
    modifier: Modifier = Modifier
) {
    ComposableDynamicFlipperButton(
        modifier = modifier,
        percent = percent,
        color = LocalPallet.current.accent,
        fontSize = textSize
    )
}

@Composable
fun ComposableFapUpdatingButton(
    percent: Float,
    textSize: TextUnit,
    modifier: Modifier = Modifier
) {
    ComposableDynamicFlipperButton(
        modifier = modifier,
        percent = percent,
        color = LocalPallet.current.updateProgressGreen,
        fontSize = textSize
    )
}

@Composable
fun ComposableFapCancelingButton(
    textSize: TextUnit,
    modifier: Modifier = Modifier
) {
    ComposableFlipperButton(
        modifier = modifier,
        text = stringResource(R.string.faphub_installation_canceling),
        color = LocalPallet.current.updateProgressGreen,
        fontSize = textSize
    )
}

@Preview
@Composable
private fun ComposableFapInstallButtonPreview() {
    FlipperThemeInternal {
        Column {
            ComposableFapInstallButton(textSize = TextUnit.Unspecified, onClick = {})
            ComposableFapInstalledButton(textSize = TextUnit.Unspecified)
            ComposableFapUpdateButton(textSize = TextUnit.Unspecified, onClick = {})
            ComposableFapInstallingButton(percent = 0.5f, textSize = TextUnit.Unspecified)
            ComposableFapUpdatingButton(percent = 0.5f, textSize = TextUnit.Unspecified)
        }
    }
}
