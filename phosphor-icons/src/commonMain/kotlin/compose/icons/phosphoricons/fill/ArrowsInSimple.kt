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

public val FillGroup.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) {
            return _arrowsInSimple!!
        }
        _arrowsInSimple = Builder(name = "ArrowsInSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.7f, 53.7f)
                lineTo(187.3f, 80.0f)
                lineToRelative(18.4f, 18.3f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 1.7f, 8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 112.0f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.9f, -7.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 8.8f, 1.7f)
                lineTo(176.0f, 68.7f)
                lineToRelative(26.3f, -26.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                close()
                moveTo(104.0f, 144.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.4f, 4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.7f, 8.8f)
                lineTo(68.7f, 176.0f)
                lineTo(42.3f, 202.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(80.0f, 187.3f)
                lineToRelative(18.3f, 18.4f)
                arcTo(8.3f, 8.3f, 0.0f, false, false, 104.0f, 208.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, -0.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 200.0f)
                verticalLineTo(152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 144.0f)
                close()
            }
        }
        .build()
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null