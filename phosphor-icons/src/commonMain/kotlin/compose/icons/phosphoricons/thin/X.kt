package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.X: ImageVector
    get() {
        if (_x != null) {
            return _x!!
        }
        _x = Builder(name = "X", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth =
                256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.8f, 197.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(128.0f, 133.7f)
                lineTo(58.8f, 202.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(122.3f, 128.0f)
                lineTo(53.2f, 58.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(128.0f, 122.3f)
                lineToRelative(69.2f, -69.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, 5.6f)
                lineTo(133.7f, 128.0f)
                close()
            }
        }
        .build()
        return _x!!
    }

private var _x: ImageVector? = null