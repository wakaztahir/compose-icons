package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) {
            return _chevronDown!!
        }
        _chevronDown = Builder(name = "ChevronDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.4f, 406.6f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(192.0f, -192.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                lineTo(256.0f, 338.7f)
                lineTo(86.6f, 169.4f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(192.0f, 192.0f)
                close()
            }
        }
        .build()
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
