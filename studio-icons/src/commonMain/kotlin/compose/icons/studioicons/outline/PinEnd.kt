package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PinEnd: ImageVector
    get() {
        if (_pinEnd != null) {
            return _pinEnd!!
        }
        _pinEnd = Builder(name = "PinEnd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(0.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(19.0f, 14.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveTo(20.66f, 14.0f, 19.0f, 14.0f)
                close()
                moveTo(14.66f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(5.66f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.24f)
                lineToRelative(2.95f, 2.95f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12.41f, 10.0f)
                horizontalLineToRelative(2.24f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _pinEnd!!
    }

private var _pinEnd: ImageVector? = null
