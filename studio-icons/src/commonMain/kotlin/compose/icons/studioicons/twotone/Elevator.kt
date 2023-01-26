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

public val TwotoneGroup.Elevator: ImageVector
    get() {
        if (_elevator != null) {
            return _elevator!!
        }
        _elevator = Builder(name = "Elevator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(10.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(8.5f, 8.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveTo(9.19f, 6.0f, 8.5f, 6.0f)
                reflectiveCurveTo(7.25f, 6.56f, 7.25f, 7.25f)
                reflectiveCurveTo(7.81f, 8.5f, 8.5f, 8.5f)
                close()
                moveTo(18.0f, 11.0f)
                lineToRelative(-2.5f, -4.0f)
                lineTo(13.0f, 11.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(13.0f, 13.0f)
                lineToRelative(2.5f, 4.0f)
                lineToRelative(2.5f, -4.0f)
                horizontalLineTo(13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                lineTo(19.0f, 3.0f)
                close()
                moveTo(10.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(8.5f, 8.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveTo(9.19f, 6.0f, 8.5f, 6.0f)
                reflectiveCurveTo(7.25f, 6.56f, 7.25f, 7.25f)
                reflectiveCurveTo(7.81f, 8.5f, 8.5f, 8.5f)
                close()
                moveTo(18.0f, 11.0f)
                lineToRelative(-2.5f, -4.0f)
                lineTo(13.0f, 11.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(13.0f, 13.0f)
                lineToRelative(2.5f, 4.0f)
                lineToRelative(2.5f, -4.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _elevator!!
    }

private var _elevator: ImageVector? = null
