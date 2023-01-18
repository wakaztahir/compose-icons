package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.ArrowSquareUp: ImageVector
    get() {
        if (_arrowSquareUp != null) {
            return _arrowSquareUp!!
        }
        _arrowSquareUp = Builder(name = "ArrowSquareUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 40.0f)
                lineTo(208.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f)
                lineTo(216.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 216.0f)
                lineTo(48.0f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 208.0f)
                lineTo(40.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 48.0f)
                lineTo(208.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(99.7f, 127.6f)
                lineTo(120.0f, 107.3f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(107.3f)
                lineToRelative(20.3f, 20.3f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 5.6f, 2.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.7f, -2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.3f)
                lineToRelative(-33.9f, -34.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -11.4f, 0.0f)
                lineToRelative(-33.9f, 34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.3f, 11.3f)
                close()
            }
        }
        .build()
        return _arrowSquareUp!!
    }

private var _arrowSquareUp: ImageVector? = null