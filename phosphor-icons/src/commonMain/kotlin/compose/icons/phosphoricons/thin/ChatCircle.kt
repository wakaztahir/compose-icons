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

public val ThinGroup.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) {
            return _chatCircle!!
        }
        _chatCircle = Builder(name = "ChatCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 228.0f)
                arcToRelative(99.6f, 99.6f, 0.0f, false, true, -49.5f, -13.1f)
                lineToRelative(-31.6f, 9.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.8f, -14.8f)
                lineToRelative(9.0f, -31.6f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 228.0f)
                close()
                moveTo(79.0f, 206.6f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 2.0f, 0.5f)
                arcTo(92.0f, 92.0f, 0.0f, true, false, 48.9f, 175.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.4f, 3.1f)
                lineToRelative(-9.5f, 33.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.9f, 4.9f)
                lineToRelative(33.2f, -9.5f)
                close()
            }
        }
        .build()
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null