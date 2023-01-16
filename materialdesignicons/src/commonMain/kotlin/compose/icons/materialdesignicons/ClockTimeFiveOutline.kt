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

public val MaterialDesignIcons.ClockTimeFiveOutline: ImageVector
    get() {
        if (_clockTimeFiveOutline != null) {
            return _clockTimeFiveOutline!!
        }
        _clockTimeFiveOutline = Builder(name = "ClockTimeFiveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveTo(16.4f, 20.0f, 20.0f, 16.4f, 20.0f, 12.0f)
                reflectiveCurveTo(16.4f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(4.0f, 7.6f, 4.0f, 12.0f)
                reflectiveCurveTo(7.6f, 20.0f, 12.0f, 20.0f)
                moveTo(12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 22.0f, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                moveTo(15.3f, 16.2f)
                lineTo(14.0f, 17.0f)
                lineTo(11.0f, 11.8f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(11.4f)
                lineTo(15.3f, 16.2f)
                close()
            }
        }
        .build()
        return _clockTimeFiveOutline!!
    }

private var _clockTimeFiveOutline: ImageVector? = null