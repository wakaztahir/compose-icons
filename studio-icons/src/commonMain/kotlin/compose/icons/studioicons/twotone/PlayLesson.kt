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

public val TwotoneGroup.PlayLesson: ImageVector
    get() {
        if (_playLesson != null) {
            return _playLesson!!
        }
        _playLesson = Builder(name = "PlayLesson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                verticalLineToRelative(7.0f)
                lineTo(9.5f, 9.5f)
                lineTo(7.0f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(6.29f)
                curveTo(11.1f, 19.37f, 11.0f, 18.7f, 11.0f, 18.0f)
                curveToRelative(0.0f, -3.53f, 2.61f, -6.43f, 6.0f, -6.92f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(2.5f, -1.5f)
                lineTo(12.0f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(7.08f)
                curveToRelative(0.33f, -0.05f, 0.66f, -0.08f, 1.0f, -0.08f)
                reflectiveCurveToRelative(0.67f, 0.03f, 1.0f, 0.08f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 2.0f, 3.0f, 2.9f, 3.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.26f)
                curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f)
                horizontalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(16.75f, 20.5f)
                verticalLineToRelative(-5.0f)
                lineToRelative(4.0f, 2.5f)
                lineTo(16.75f, 20.5f)
                close()
            }
        }
        .build()
        return _playLesson!!
    }

private var _playLesson: ImageVector? = null
