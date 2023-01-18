package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CloseCircleFill: ImageVector
    get() {
        if (_closeCircleFill != null) {
            return _closeCircleFill!!
        }
        _closeCircleFill = Builder(name = "CloseCircleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 10.586f)
                lineTo(9.172f, 7.757f)
                lineTo(7.757f, 9.172f)
                lineTo(10.586f, 12.0f)
                lineToRelative(-2.829f, 2.828f)
                lineToRelative(1.415f, 1.415f)
                lineTo(12.0f, 13.414f)
                lineToRelative(2.828f, 2.829f)
                lineToRelative(1.415f, -1.415f)
                lineTo(13.414f, 12.0f)
                lineToRelative(2.829f, -2.828f)
                lineToRelative(-1.415f, -1.415f)
                lineTo(12.0f, 10.586f)
                close()
            }
        }
        .build()
        return _closeCircleFill!!
    }

private var _closeCircleFill: ImageVector? = null