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

public val MaterialDesignIcons.CeilingLightMultipleOutline: ImageVector
    get() {
        if (_ceilingLightMultipleOutline != null) {
            return _ceilingLightMultipleOutline!!
        }
        _ceilingLightMultipleOutline = Builder(name = "CeilingLightMultipleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.76f, 13.0f)
                lineTo(18.76f, 17.0f)
                horizontalLineTo(9.24f)
                lineTo(11.24f, 13.0f)
                horizontalLineTo(16.76f)
                moveTo(15.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                lineTo(6.0f, 19.0f)
                horizontalLineTo(22.0f)
                lineTo(18.0f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                moveTo(16.0f, 20.0f)
                curveTo(16.0f, 21.11f, 15.11f, 22.0f, 14.0f, 22.0f)
                reflectiveCurveTo(12.0f, 21.11f, 12.0f, 20.0f)
                horizontalLineTo(16.0f)
                moveTo(8.21f, 10.11f)
                lineTo(8.76f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                lineTo(2.0f, 15.0f)
                horizontalLineTo(5.76f)
                lineTo(8.21f, 10.11f)
                close()
            }
        }
        .build()
        return _ceilingLightMultipleOutline!!
    }

private var _ceilingLightMultipleOutline: ImageVector? = null