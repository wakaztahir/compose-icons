package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.MonitorHeart: ImageVector
    get() {
        if (_monitorHeart != null) {
            return _monitorHeart!!
        }
        _monitorHeart = Builder(name = "MonitorHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.89f, 7.55f)
                curveToRelative(-0.34f, -0.68f, -1.45f, -0.68f, -1.79f, 0.0f)
                lineTo(10.0f, 13.76f)
                lineToRelative(-1.11f, -2.21f)
                curveTo(8.72f, 11.21f, 8.38f, 11.0f, 8.0f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.38f)
                lineToRelative(1.72f, 3.45f)
                curveTo(9.28f, 16.79f, 9.62f, 17.0f, 10.0f, 17.0f)
                reflectiveCurveToRelative(0.72f, -0.21f, 0.89f, -0.55f)
                lineTo(14.0f, 10.24f)
                lineToRelative(1.11f, 2.21f)
                curveTo(15.28f, 12.79f, 15.62f, 13.0f, 16.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.38f)
                lineTo(14.89f, 7.55f)
                close()
            }
        }
        .build()
        return _monitorHeart!!
    }

private var _monitorHeart: ImageVector? = null