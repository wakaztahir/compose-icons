package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) {
            return _fastForwardCircle!!
        }
        _fastForwardCircle = Builder(name = "FastForwardCircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(191.3f, 123.0f)
                lineTo(143.3f, 91.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.3f, 5.0f)
                verticalLineToRelative(26.1f)
                lineTo(87.3f, 91.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 78.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.2f, 5.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 6.1f, -0.3f)
                lineTo(134.0f, 133.9f)
                lineTo(134.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.2f, 5.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 6.1f, -0.3f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.0f)
                close()
                moveTo(90.0f, 148.8f)
                lineTo(90.0f, 107.2f)
                lineTo(121.2f, 128.0f)
                close()
                moveTo(146.0f, 148.8f)
                lineTo(146.0f, 107.2f)
                lineTo(177.2f, 128.0f)
                close()
            }
        }
        .build()
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null