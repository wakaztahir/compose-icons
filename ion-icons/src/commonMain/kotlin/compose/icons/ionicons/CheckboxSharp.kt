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

public val IonIcons.CheckboxSharp: ImageVector
    get() {
        if (_checkboxSharp != null) {
            return _checkboxSharp!!
        }
        _checkboxSharp = Builder(name = "CheckboxSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 48.0f)
                verticalLineTo(464.0f)
                horizontalLineTo(464.0f)
                verticalLineTo(48.0f)
                close()
                moveTo(218.0f, 360.38f)
                lineTo(137.4f, 270.81f)
                lineToRelative(23.79f, -21.41f)
                lineToRelative(56.0f, 62.22f)
                lineTo(350.0f, 153.46f)
                lineTo(374.54f, 174.0f)
                close()
            }
        }
        .build()
        return _checkboxSharp!!
    }

private var _checkboxSharp: ImageVector? = null