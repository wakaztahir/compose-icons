package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.HourglassSimpleHigh: ImageVector
    get() {
        if (_hourglassSimpleHigh != null) {
            return _hourglassSimpleHigh!!
        }
        _hourglassSimpleHigh = Builder(name = "HourglassSimpleHigh", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(139.3f, 128.0f)
                lineToRelative(50.4f, -50.3f)
                horizontalLineToRelative(0.0f)
                lineTo(208.0f, 59.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 196.7f, 32.0f)
                lineTo(59.3f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 59.3f)
                lineTo(116.7f, 128.0f)
                lineTo(48.0f, 196.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 59.3f, 224.0f)
                lineTo(196.7f, 224.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 196.7f)
                close()
                moveTo(196.7f, 48.0f)
                lineTo(180.7f, 64.0f)
                lineTo(75.3f, 64.0f)
                lineToRelative(-16.0f, -16.0f)
                close()
                moveTo(59.3f, 208.0f)
                lineTo(128.0f, 139.3f)
                lineTo(196.7f, 208.0f)
                close()
            }
        }
        .build()
        return _hourglassSimpleHigh!!
    }

private var _hourglassSimpleHigh: ImageVector? = null