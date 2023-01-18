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

public val ThinGroup.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) {
            return _pencilSimple!!
        }
        _pencilSimple = Builder(name = "PencilSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.2f, 79.5f)
                lineTo(176.5f, 34.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-120.0f, 120.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -3.5f, 8.5f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(92.7f, 220.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.5f, -3.5f)
                lineToRelative(120.0f, -120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 221.2f, 79.5f)
                close()
                moveTo(95.5f, 210.8f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -2.8f, 1.2f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 163.3f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 1.2f, -2.8f)
                lineTo(136.0f, 69.7f)
                lineTo(186.3f, 120.0f)
                close()
                moveTo(215.5f, 90.8f)
                lineTo(192.0f, 114.3f)
                lineTo(141.7f, 64.0f)
                lineToRelative(23.5f, -23.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(44.7f, 44.7f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 215.5f, 90.8f)
                close()
            }
        }
        .build()
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null