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

public val TwotoneGroup.SetMeal: ImageVector
    get() {
        if (_setMeal != null) {
            return _setMeal!!
        }
        _setMeal = Builder(name = "SetMeal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(20.0f, 6.0f)
                curveToRelative(-1.68f, 0.0f, -3.04f, 0.98f, -3.21f, 2.23f)
                curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f)
                curveToRelative(-4.67f, 0.0f, -6.75f, 3.0f, -6.75f, 3.0f)
                reflectiveCurveToRelative(2.08f, 3.0f, 6.75f, 3.0f)
                curveToRelative(3.81f, 0.0f, 5.9f, -2.0f, 6.54f, -2.73f)
                curveTo(16.96f, 10.02f, 18.32f, 11.0f, 20.0f, 11.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.05f, 17.56f)
                lineTo(3.08f, 18.5f)
                lineTo(3.0f, 17.0f)
                lineToRelative(17.98f, -0.94f)
                lineTo(21.05f, 17.56f)
                close()
                moveTo(21.0f, 19.48f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(19.48f)
                close()
                moveTo(23.0f, 13.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 2.0f, 1.0f, 2.9f, 1.0f, 4.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveTo(22.1f, 15.0f, 23.0f, 14.1f, 23.0f, 13.0f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(20.0f, 6.0f)
                curveToRelative(-1.68f, 0.0f, -3.04f, 0.98f, -3.21f, 2.23f)
                curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f)
                curveToRelative(-4.67f, 0.0f, -6.75f, 3.0f, -6.75f, 3.0f)
                reflectiveCurveToRelative(2.08f, 3.0f, 6.75f, 3.0f)
                curveToRelative(3.81f, 0.0f, 5.9f, -2.0f, 6.54f, -2.73f)
                curveTo(16.96f, 10.02f, 18.32f, 11.0f, 20.0f, 11.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _setMeal!!
    }

private var _setMeal: ImageVector? = null