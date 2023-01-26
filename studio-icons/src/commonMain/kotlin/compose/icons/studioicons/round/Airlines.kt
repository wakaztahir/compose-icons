package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Airlines: ImageVector
    get() {
        if (_airlines != null) {
            return _airlines!!
        }
        _airlines = Builder(name = "Airlines", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.59f, 4.0f)
                horizontalLineToRelative(-5.01f)
                curveToRelative(-0.99f, 0.0f, -1.91f, 0.49f, -2.47f, 1.3f)
                lineTo(2.0f, 20.0f)
                horizontalLineToRelative(17.0f)
                lineToRelative(2.56f, -13.63f)
                curveTo(21.79f, 5.14f, 20.84f, 4.0f, 19.59f, 4.0f)
                close()
                moveTo(14.5f, 14.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveTo(17.0f, 12.88f, 15.88f, 14.0f, 14.5f, 14.0f)
                close()
            }
        }
        .build()
        return _airlines!!
    }

private var _airlines: ImageVector? = null
