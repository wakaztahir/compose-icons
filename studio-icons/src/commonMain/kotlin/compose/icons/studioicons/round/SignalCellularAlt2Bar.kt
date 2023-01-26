package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SignalCellularAlt2Bar: ImageVector
    get() {
        if (_signalCellularAlt2Bar != null) {
            return _signalCellularAlt2Bar!!
        }
        _signalCellularAlt2Bar = Builder(name = "SignalCellularAlt2Bar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 20.0f)
                curveTo(5.67f, 20.0f, 5.0f, 19.33f, 5.0f, 18.5f)
                verticalLineToRelative(-3.0f)
                curveTo(5.0f, 14.67f, 5.67f, 14.0f, 6.5f, 14.0f)
                reflectiveCurveTo(8.0f, 14.67f, 8.0f, 15.5f)
                verticalLineToRelative(3.0f)
                curveTo(8.0f, 19.33f, 7.33f, 20.0f, 6.5f, 20.0f)
                close()
                moveTo(12.5f, 20.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-8.0f)
                curveTo(11.0f, 9.67f, 11.67f, 9.0f, 12.5f, 9.0f)
                reflectiveCurveTo(14.0f, 9.67f, 14.0f, 10.5f)
                verticalLineToRelative(8.0f)
                curveTo(14.0f, 19.33f, 13.33f, 20.0f, 12.5f, 20.0f)
                close()
            }
        }
        .build()
        return _signalCellularAlt2Bar!!
    }

private var _signalCellularAlt2Bar: ImageVector? = null
