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

public val SharpGroup.TurnLeft: ImageVector
    get() {
        if (_turnLeft != null) {
            return _turnLeft!!
        }
        _turnLeft = Builder(name = "TurnLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.83f)
                lineToRelative(-1.59f, 1.58f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(0.0f, 6.17f)
                lineToRelative(10.0f, 0.0f)
                lineToRelative(0.0f, 8.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-10.0f, 0.0f)
                close()
            }
        }
        .build()
        return _turnLeft!!
    }

private var _turnLeft: ImageVector? = null