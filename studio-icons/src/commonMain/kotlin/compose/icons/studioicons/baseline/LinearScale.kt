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

public val BaselineGroup.LinearScale: ImageVector
    get() {
        if (_linearScale != null) {
            return _linearScale!!
        }
        _linearScale = Builder(name = "LinearScale", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 9.5f)
                curveToRelative(-1.03f, 0.0f, -1.9f, 0.62f, -2.29f, 1.5f)
                horizontalLineToRelative(-2.92f)
                curveTo(13.9f, 10.12f, 13.03f, 9.5f, 12.0f, 9.5f)
                reflectiveCurveToRelative(-1.9f, 0.62f, -2.29f, 1.5f)
                horizontalLineTo(6.79f)
                curveTo(6.4f, 10.12f, 5.53f, 9.5f, 4.5f, 9.5f)
                curveTo(3.12f, 9.5f, 2.0f, 10.62f, 2.0f, 12.0f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.03f, 0.0f, 1.9f, -0.62f, 2.29f, -1.5f)
                horizontalLineToRelative(2.92f)
                curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f)
                reflectiveCurveToRelative(1.9f, -0.62f, 2.29f, -1.5f)
                horizontalLineToRelative(2.92f)
                curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(20.88f, 9.5f, 19.5f, 9.5f)
                close()
            }
        }
        .build()
        return _linearScale!!
    }

private var _linearScale: ImageVector? = null
