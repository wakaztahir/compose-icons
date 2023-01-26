package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.HourglassTop: ImageVector
    get() {
        if (_hourglassTop != null) {
            return _hourglassTop!!
        }
        _hourglassTop = Builder(name = "HourglassTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 7.5f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.0f, -3.5f)
                lineToRelative(-8.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 7.5f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.0f, -3.5f)
                lineToRelative(-8.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-3.99f, 4.01f)
                lineTo(6.0f, 22.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(-0.01f, -5.99f)
                lineTo(14.0f, 12.0f)
                lineToRelative(4.0f, -3.99f)
                verticalLineTo(2.0f)
                close()
                moveTo(16.0f, 16.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4.0f, -4.0f)
                lineTo(16.0f, 16.5f)
                close()
                moveTo(16.0f, 7.5f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _hourglassTop!!
    }

private var _hourglassTop: ImageVector? = null
