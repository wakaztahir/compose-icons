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

public val TwotoneGroup.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = Builder(name = "HeartBroken", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.23f, 5.42f)
                curveTo(8.69f, 5.15f, 8.09f, 5.0f, 7.5f, 5.0f)
                curveTo(5.54f, 5.0f, 4.0f, 6.54f, 4.0f, 8.5f)
                curveToRelative(0.0f, 2.5f, 2.45f, 4.84f, 6.24f, 8.23f)
                lineTo(10.77f, 12.0f)
                horizontalLineTo(7.35f)
                lineTo(9.23f, 5.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 5.0f)
                curveToRelative(-0.37f, 0.0f, -0.75f, 0.06f, -1.12f, 0.18f)
                lineTo(14.77f, 7.0f)
                horizontalLineToRelative(2.91f)
                lineToRelative(-2.56f, 8.53f)
                curveTo(17.98f, 12.93f, 20.0f, 10.71f, 20.0f, 8.5f)
                curveTo(20.0f, 6.54f, 18.46f, 5.0f, 16.5f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                curveToRelative(-0.96f, 0.0f, -1.9f, 0.25f, -2.73f, 0.69f)
                lineTo(12.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-3.0f, 10.0f)
                lineToRelative(1.0f, -9.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(1.54f, -5.39f)
                curveTo(10.47f, 3.61f, 9.01f, 3.0f, 7.5f, 3.0f)
                curveTo(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f)
                curveToRelative(0.0f, 4.13f, 4.16f, 7.18f, 10.0f, 12.5f)
                curveToRelative(5.47f, -4.94f, 10.0f, -8.26f, 10.0f, -12.5f)
                curveTo(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f)
                close()
                moveTo(10.24f, 16.73f)
                curveTo(6.45f, 13.34f, 4.0f, 11.0f, 4.0f, 8.5f)
                curveTo(4.0f, 6.54f, 5.54f, 5.0f, 7.5f, 5.0f)
                curveToRelative(0.59f, 0.0f, 1.19f, 0.15f, 1.73f, 0.42f)
                lineTo(7.35f, 12.0f)
                horizontalLineToRelative(3.42f)
                lineTo(10.24f, 16.73f)
                close()
                moveTo(15.13f, 15.53f)
                lineTo(17.69f, 7.0f)
                horizontalLineToRelative(-2.91f)
                lineToRelative(0.61f, -1.82f)
                curveTo(15.75f, 5.06f, 16.13f, 5.0f, 16.5f, 5.0f)
                curveTo(18.46f, 5.0f, 20.0f, 6.54f, 20.0f, 8.5f)
                curveTo(20.0f, 10.71f, 17.98f, 12.93f, 15.13f, 15.53f)
                close()
            }
        }
        .build()
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
