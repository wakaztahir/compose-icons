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

public val RoundGroup.Carpenter: ImageVector
    get() {
        if (_carpenter != null) {
            return _carpenter!!
        }
        _carpenter = Builder(name = "Carpenter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.73f, 14.23f)
                lineTo(7.71f, 2.21f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(3.7f, 4.8f)
                curveTo(3.36f, 5.14f, 3.31f, 5.68f, 3.59f, 6.08f)
                lineToRelative(7.65f, 10.98f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineToRelative(4.24f, -4.24f)
                curveTo(20.51f, 16.28f, 20.51f, 15.01f, 19.73f, 14.23f)
                close()
                moveTo(14.07f, 19.88f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineTo(14.07f, 19.88f)
                close()
            }
        }
        .build()
        return _carpenter!!
    }

private var _carpenter: ImageVector? = null
