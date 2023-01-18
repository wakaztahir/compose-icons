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

public val RemixIcons.AliensFill: ImageVector
    get() {
        if (_aliensFill != null) {
            return _aliensFill!!
        }
        _aliensFill = Builder(name = "AliensFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 8.5f, 8.5f)
                curveToRelative(0.0f, 6.5f, -5.5f, 12.0f, -8.5f, 12.0f)
                reflectiveCurveToRelative(-8.5f, -5.5f, -8.5f, -12.0f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.475f, 4.975f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.95f, -4.95f)
                arcTo(4.552f, 4.552f, 0.0f, false, false, 17.5f, 12.0f)
                close()
                moveTo(6.5f, 12.0f)
                curveToRelative(-0.16f, 0.0f, -0.319f, 0.008f, -0.475f, 0.025f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.95f, 4.95f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 6.5f, 12.0f)
                close()
            }
        }
        .build()
        return _aliensFill!!
    }

private var _aliensFill: ImageVector? = null