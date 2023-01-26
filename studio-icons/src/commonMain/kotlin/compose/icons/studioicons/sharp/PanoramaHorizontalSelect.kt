package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PanoramaHorizontalSelect: ImageVector
    get() {
        if (_panoramaHorizontalSelect != null) {
            return _panoramaHorizontalSelect!!
        }
        _panoramaHorizontalSelect = Builder(name = "PanoramaHorizontalSelect", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                curveToRelative(-5.25f, 0.0f, -9.01f, -1.54f, -10.0f, -1.92f)
                lineTo(2.0f, 20.4f)
                curveToRelative(2.16f, -0.76f, 5.21f, -1.9f, 10.0f, -1.9f)
                curveToRelative(4.78f, 0.0f, 7.91f, 1.17f, 10.0f, 1.9f)
                lineTo(22.0f, 3.6f)
                curveTo(19.91f, 4.33f, 16.77f, 5.5f, 12.0f, 5.5f)
                close()
            }
        }
        .build()
        return _panoramaHorizontalSelect!!
    }

private var _panoramaHorizontalSelect: ImageVector? = null