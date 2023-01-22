package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(19.0f, 15.1046f, 18.1046f, 16.0f, 17.0f, 16.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 16.0f, 14.0f, 15.5523f, 14.0f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(14.0f, 10.4477f, 14.4477f, 10.0f, 15.0f, 10.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(9.0f)
                curveTo(17.5f, 5.9624f, 15.0376f, 3.5f, 12.0f, 3.5f)
                curveTo(8.9624f, 3.5f, 6.5f, 5.9624f, 6.5f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 10.0f, 10.0f, 10.4477f, 10.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(10.0f, 15.5523f, 9.5523f, 16.0f, 9.0f, 16.0f)
                horizontalLineTo(7.0f)
                curveTo(6.8273f, 16.0f, 6.6598f, 15.9781f, 6.5f, 15.937f)
                lineTo(6.5f, 16.25f)
                curveTo(6.5f, 17.4409f, 7.4252f, 18.4156f, 8.596f, 18.4948f)
                lineTo(8.75f, 18.5f)
                lineTo(9.8778f, 18.5008f)
                curveTo(10.1864f, 17.6265f, 11.02f, 17.0f, 12.0f, 17.0f)
                curveTo(13.2426f, 17.0f, 14.25f, 18.0074f, 14.25f, 19.25f)
                curveTo(14.25f, 20.4926f, 13.2426f, 21.5f, 12.0f, 21.5f)
                curveTo(11.0204f, 21.5f, 10.1871f, 20.874f, 9.8781f, 20.0003f)
                lineTo(8.75f, 20.0f)
                curveTo(6.7457f, 20.0f, 5.1087f, 18.4276f, 5.0052f, 16.4492f)
                lineTo(5.0f, 16.25f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null