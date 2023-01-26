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

public val RoundGroup.Movie: ImageVector
    get() {
        if (_movie != null) {
            return _movie!!
        }
        _movie = Builder(name = "Movie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                lineToRelative(1.82f, 3.64f)
                curveToRelative(0.08f, 0.16f, -0.04f, 0.36f, -0.22f, 0.36f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-0.38f, 0.0f, -0.73f, -0.21f, -0.89f, -0.55f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(1.82f, 3.64f)
                curveToRelative(0.08f, 0.16f, -0.04f, 0.36f, -0.22f, 0.36f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-0.38f, 0.0f, -0.73f, -0.21f, -0.89f, -0.55f)
                lineTo(10.0f, 4.0f)
                horizontalLineTo(8.0f)
                lineToRelative(1.82f, 3.64f)
                curveToRelative(0.08f, 0.16f, -0.04f, 0.36f, -0.22f, 0.36f)
                horizontalLineTo(7.62f)
                curveToRelative(-0.38f, 0.0f, -0.73f, -0.21f, -0.9f, -0.55f)
                lineTo(5.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _movie!!
    }

private var _movie: ImageVector? = null
