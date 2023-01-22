package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ToggleSharp: ImageVector
    get() {
        if (_toggleSharp != null) {
            return _toggleSharp!!
        }
        _toggleSharp = Builder(name = "ToggleSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 112.0f)
                lineTo(144.0f, 112.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, false, false, 0.0f, 288.0f)
                lineTo(368.0f, 400.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, false, false, 0.0f, -288.0f)
                close()
                moveTo(368.0f, 342.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, true, true, 86.0f, -86.0f)
                arcTo(85.88f, 85.88f, 0.0f, false, true, 368.0f, 342.0f)
                close()
            }
        }
        .build()
        return _toggleSharp!!
    }

private var _toggleSharp: ImageVector? = null