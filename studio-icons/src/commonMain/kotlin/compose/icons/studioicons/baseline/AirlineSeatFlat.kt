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

public val BaselineGroup.AirlineSeatFlat: ImageVector
    get() {
        if (_airlineSeatFlat != null) {
            return _airlineSeatFlat!!
        }
        _airlineSeatFlat = Builder(name = "AirlineSeatFlat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 13.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                close()
                moveTo(2.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 14.0f)
                close()
                moveTo(7.14f, 12.1f)
                curveToRelative(1.16f, -1.19f, 1.14f, -3.08f, -0.04f, -4.24f)
                curveToRelative(-1.19f, -1.16f, -3.08f, -1.14f, -4.24f, 0.04f)
                curveToRelative(-1.16f, 1.19f, -1.14f, 3.08f, 0.04f, 4.24f)
                curveToRelative(1.19f, 1.16f, 3.08f, 1.14f, 4.24f, -0.04f)
                close()
            }
        }
        .build()
        return _airlineSeatFlat!!
    }

private var _airlineSeatFlat: ImageVector? = null