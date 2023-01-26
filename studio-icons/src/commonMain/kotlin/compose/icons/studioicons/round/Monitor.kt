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

public val RoundGroup.Monitor: ImageVector
    get() {
        if (_monitor != null) {
            return _monitor!!
        }
        _monitor = Builder(name = "Monitor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(-0.55f, 0.55f, -1.0f, 0.87f, -1.0f, 1.59f)
                verticalLineToRelative(0.0f)
                curveTo(6.0f, 20.37f, 6.63f, 21.0f, 7.41f, 21.0f)
                horizontalLineToRelative(9.17f)
                curveToRelative(0.78f, 0.0f, 1.41f, -0.63f, 1.41f, -1.41f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.72f, -0.44f, -1.03f, -1.0f, -1.59f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _monitor!!
    }

private var _monitor: ImageVector? = null