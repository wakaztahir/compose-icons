package compose.icons.fluentuiicons.filled

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
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DocumentMultiple: ImageVector
    get() {
        if (_documentMultiple != null) {
            return _documentMultiple!!
        }
        _documentMultiple = Builder(name = "DocumentMultiple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(10.5039f)
                verticalLineTo(6.7475f)
                curveTo(10.5039f, 7.9902f, 11.5113f, 8.9975f, 12.7539f, 8.9975f)
                horizontalLineTo(17.5f)
                verticalLineTo(17.25f)
                curveTo(17.5f, 18.4926f, 16.4926f, 19.5f, 15.25f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 19.5f, 4.0f, 18.4926f, 4.0f, 17.25f)
                verticalLineTo(4.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0039f, 6.7475f)
                verticalLineTo(2.4673f)
                curveTo(12.0803f, 2.5261f, 12.1532f, 2.5901f, 12.2221f, 2.659f)
                lineTo(16.841f, 7.2779f)
                curveTo(16.9103f, 7.3472f, 16.9747f, 7.4206f, 17.0338f, 7.4975f)
                horizontalLineTo(12.7539f)
                curveTo(12.3397f, 7.4975f, 12.0039f, 7.1617f, 12.0039f, 6.7475f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7509f, 22.0f)
                curveTo(7.7712f, 22.0f, 6.9378f, 21.3739f, 6.6289f, 20.5f)
                horizontalLineTo(15.2509f)
                curveTo(17.0458f, 20.5f, 18.5009f, 19.0449f, 18.5009f, 17.25f)
                verticalLineTo(8.9369f)
                lineTo(19.3419f, 9.7779f)
                curveTo(19.7638f, 10.1998f, 20.0009f, 10.7721f, 20.0009f, 11.3689f)
                verticalLineTo(17.25f)
                curveTo(20.0009f, 19.8734f, 17.8742f, 22.0f, 15.2509f, 22.0f)
                horizontalLineTo(8.7509f)
                close()
            }
        }
        .build()
        return _documentMultiple!!
    }

private var _documentMultiple: ImageVector? = null