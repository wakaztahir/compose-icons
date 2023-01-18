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

public val DuotoneGroup.SquareHalf: ImageVector
    get() {
        if (_squareHalf != null) {
            return _squareHalf!!
        }
        _squareHalf = Builder(name = "SquareHalf", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(212.0f, 52.0f)
                verticalLineTo(204.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(76.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 212.0f, 52.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 36.0f)
                horizontalLineTo(52.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 36.0f, 52.0f)
                verticalLineTo(204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(52.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 204.0f, 36.0f)
                close()
                moveTo(52.0f, 52.0f)
                horizontalLineToRelative(68.0f)
                verticalLineTo(204.0f)
                horizontalLineTo(52.0f)
                close()
                moveTo(204.0f, 204.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(52.0f)
                horizontalLineToRelative(68.0f)
                verticalLineTo(204.0f)
                close()
            }
        }
        .build()
        return _squareHalf!!
    }

private var _squareHalf: ImageVector? = null