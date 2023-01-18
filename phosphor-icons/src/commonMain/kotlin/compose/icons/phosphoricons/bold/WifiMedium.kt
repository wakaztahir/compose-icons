package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) {
            return _wifiMedium!!
        }
        _wifiMedium = Builder(name = "WifiMedium", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.4f, 157.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.3f, 17.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.6f, 3.7f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -8.4f, -3.4f)
                arcToRelative(38.7f, 38.7f, 0.0f, false, false, -53.4f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -16.7f, -17.3f)
                arcToRelative(62.8f, 62.8f, 0.0f, false, true, 86.8f, 0.0f)
                close()
                moveTo(205.4f, 123.6f)
                arcToRelative(110.6f, 110.6f, 0.0f, false, false, -154.8f, 0.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -0.2f, 16.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.2f)
                arcToRelative(86.7f, 86.7f, 0.0f, false, true, 121.2f, 0.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.4f, 3.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 8.6f, -3.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 205.4f, 123.6f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 184.0f)
                close()
            }
        }
        .build()
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null