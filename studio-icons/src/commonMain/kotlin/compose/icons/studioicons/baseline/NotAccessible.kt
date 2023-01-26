package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.NotAccessible: ImageVector
    get() {
        if (_notAccessible != null) {
            return _notAccessible!!
        }
        _notAccessible = Builder(name = "NotAccessible", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.05f)
                lineToRelative(-3.42f, -3.42f)
                curveToRelative(0.32f, -0.34f, 0.74f, -0.57f, 1.23f, -0.61f)
                curveToRelative(0.48f, -0.04f, 0.84f, 0.07f, 1.2f, 0.26f)
                curveToRelative(0.19f, 0.1f, 0.39f, 0.22f, 0.63f, 0.46f)
                lineToRelative(1.29f, 1.43f)
                curveToRelative(0.98f, 1.08f, 2.53f, 1.85f, 4.07f, 1.83f)
                verticalLineToRelative(2.0f)
                curveTo(17.25f, 12.99f, 15.29f, 12.12f, 14.0f, 11.05f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveTo(10.9f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(10.0f, 12.83f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.17f)
                lineToRelative(5.61f, 5.61f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(10.0f, 20.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.31f, 0.84f, -2.41f, 2.0f, -2.83f)
                verticalLineTo(12.1f)
                curveToRelative(-2.28f, 0.46f, -4.0f, 2.48f, -4.0f, 4.9f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.42f, 0.0f, 4.44f, -1.72f, 4.9f, -4.0f)
                horizontalLineToRelative(-2.07f)
                curveTo(12.42f, 19.16f, 11.31f, 20.0f, 10.0f, 20.0f)
                close()
            }
        }
        .build()
        return _notAccessible!!
    }

private var _notAccessible: ImageVector? = null
