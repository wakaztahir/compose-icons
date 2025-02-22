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

public val SolidGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(352.0f, 49.7f)
                curveTo(483.8f, 63.4f, 589.7f, 161.0f, 605.9f, 285.9f)
                curveToRelative(2.0f, 15.6f, -17.3f, 24.4f, -27.8f, 12.7f)
                curveTo(564.1f, 283.0f, 536.8f, 272.0f, 512.0f, 272.0f)
                curveToRelative(-38.7f, 0.0f, -71.0f, 27.5f, -78.4f, 64.1f)
                curveToRelative(-1.7f, 8.7f, -8.7f, 15.9f, -17.6f, 15.9f)
                reflectiveCurveToRelative(-15.8f, -7.2f, -17.6f, -15.9f)
                curveTo(391.0f, 299.5f, 358.7f, 272.0f, 320.0f, 272.0f)
                reflectiveCurveToRelative(-71.0f, 27.5f, -78.4f, 64.1f)
                curveToRelative(-1.7f, 8.7f, -8.7f, 15.9f, -17.6f, 15.9f)
                reflectiveCurveToRelative(-15.8f, -7.2f, -17.6f, -15.9f)
                curveTo(199.0f, 299.5f, 166.7f, 272.0f, 128.0f, 272.0f)
                curveToRelative(-24.8f, 0.0f, -52.1f, 11.0f, -66.1f, 26.7f)
                curveToRelative(-10.5f, 11.7f, -29.8f, 2.9f, -27.8f, -12.7f)
                curveTo(50.3f, 161.0f, 156.2f, 63.4f, 288.0f, 49.7f)
                lineTo(288.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(320.0f, 304.0f)
                curveToRelative(12.3f, 0.0f, 23.5f, 4.6f, 32.0f, 12.2f)
                lineTo(352.0f, 430.6f)
                curveToRelative(0.0f, 45.0f, -36.5f, 81.4f, -81.4f, 81.4f)
                curveToRelative(-30.8f, 0.0f, -59.0f, -17.4f, -72.8f, -45.0f)
                lineToRelative(-2.3f, -4.7f)
                curveToRelative(-7.9f, -15.8f, -1.5f, -35.0f, 14.3f, -42.9f)
                reflectiveCurveToRelative(35.0f, -1.5f, 42.9f, 14.3f)
                lineToRelative(2.3f, 4.7f)
                curveToRelative(3.0f, 5.9f, 9.0f, 9.6f, 15.6f, 9.6f)
                curveToRelative(9.6f, 0.0f, 17.4f, -7.8f, 17.4f, -17.4f)
                lineTo(288.0f, 316.2f)
                curveToRelative(8.5f, -7.6f, 19.7f, -12.2f, 32.0f, -12.2f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
