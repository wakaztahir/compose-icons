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

public val SolidGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.3f, 5.4f)
                curveToRelative(7.8f, -7.3f, 19.9f, -7.2f, 27.7f, 0.1f)
                curveToRelative(27.6f, 25.9f, 53.5f, 53.8f, 77.7f, 84.0f)
                curveToRelative(11.0f, -14.4f, 23.5f, -30.1f, 37.0f, -42.9f)
                curveToRelative(7.9f, -7.4f, 20.1f, -7.4f, 28.0f, 0.1f)
                curveToRelative(34.6f, 33.0f, 63.9f, 76.6f, 84.5f, 118.0f)
                curveToRelative(20.3f, 40.8f, 33.8f, 82.5f, 33.8f, 111.9f)
                curveTo(448.0f, 404.2f, 348.2f, 512.0f, 224.0f, 512.0f)
                curveTo(98.4f, 512.0f, 0.0f, 404.1f, 0.0f, 276.5f)
                curveToRelative(0.0f, -38.4f, 17.8f, -85.3f, 45.4f, -131.7f)
                curveTo(73.3f, 97.7f, 112.7f, 48.6f, 159.3f, 5.4f)
                close()
                moveTo(225.7f, 416.0f)
                curveToRelative(25.3f, 0.0f, 47.7f, -7.0f, 68.8f, -21.0f)
                curveToRelative(42.1f, -29.4f, 53.4f, -88.2f, 28.1f, -134.4f)
                curveToRelative(-2.8f, -5.6f, -5.6f, -11.2f, -9.8f, -16.8f)
                lineToRelative(-50.6f, 58.8f)
                reflectiveCurveToRelative(-81.4f, -103.6f, -87.1f, -110.6f)
                curveTo(133.1f, 243.8f, 112.0f, 273.2f, 112.0f, 306.8f)
                curveTo(112.0f, 375.4f, 162.6f, 416.0f, 225.7f, 416.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
