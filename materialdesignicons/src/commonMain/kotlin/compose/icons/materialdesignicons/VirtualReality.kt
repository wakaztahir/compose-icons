package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) {
            return _virtualReality!!
        }
        _virtualReality = Builder(name = "VirtualReality", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(6.0f, 9.0f)
                horizontalLineTo(7.5f)
                lineTo(8.5f, 12.43f)
                lineTo(9.5f, 9.0f)
                horizontalLineTo(11.0f)
                lineTo(9.25f, 15.0f)
                horizontalLineTo(7.75f)
                lineTo(6.0f, 9.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(16.5f)
                curveTo(17.35f, 9.0f, 18.0f, 9.65f, 18.0f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(18.0f, 12.1f, 17.6f, 12.65f, 17.1f, 12.9f)
                lineTo(18.0f, 15.0f)
                horizontalLineTo(16.5f)
                lineTo(15.65f, 13.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                moveTo(14.5f, 10.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null