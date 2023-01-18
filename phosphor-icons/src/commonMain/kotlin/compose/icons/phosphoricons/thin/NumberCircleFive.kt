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

public val ThinGroup.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) {
            return _numberCircleFive!!
        }
        _numberCircleFive = Builder(name = "NumberCircleFive", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(115.2f, 88.0f)
                lineToRelative(-5.7f, 35.4f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 14.4f, -3.4f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 156.0f, 152.0f)
                arcToRelative(31.4f, 31.4f, 0.0f, false, true, -9.4f, 22.6f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -45.4f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                arcToRelative(24.3f, 24.3f, 0.0f, false, false, 34.1f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -17.0f, -41.0f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, false, -17.1f, 7.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -4.6f, 0.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.1f, -4.2f)
                lineToRelative(7.8f, -48.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.9f, -3.4f)
                lineTo(152.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null