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

public val MaterialDesignIcons.WashingMachineOff: ImageVector
    get() {
        if (_washingMachineOff != null) {
            return _washingMachineOff!!
        }
        _washingMachineOff = Builder(name = "WashingMachineOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.0f, 5.89f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(18.58f, 22.0f, 19.1f, 21.75f, 19.46f, 21.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12.0f, 20.0f)
                curveTo(8.69f, 20.0f, 6.0f, 17.31f, 6.0f, 14.0f)
                curveTo(6.0f, 12.32f, 6.7f, 10.8f, 7.82f, 9.71f)
                lineTo(12.06f, 13.95f)
                lineTo(9.17f, 16.83f)
                curveTo(10.73f, 18.39f, 13.27f, 18.39f, 14.83f, 16.83f)
                curveTo(14.85f, 16.81f, 14.86f, 16.79f, 14.88f, 16.77f)
                lineTo(16.29f, 18.18f)
                curveTo(15.2f, 19.3f, 13.69f, 20.0f, 12.0f, 20.0f)
                moveTo(11.25f, 8.05f)
                curveTo(11.5f, 8.0f, 11.75f, 8.0f, 12.0f, 8.0f)
                curveTo(15.31f, 8.0f, 18.0f, 10.69f, 18.0f, 14.0f)
                curveTo(18.0f, 14.25f, 18.0f, 14.5f, 17.95f, 14.75f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.9f, 19.11f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(5.76f, 2.0f, 5.54f, 2.05f, 5.33f, 2.13f)
                lineTo(11.25f, 8.05f)
                moveTo(10.0f, 4.0f)
                curveTo(10.55f, 4.0f, 11.0f, 4.45f, 11.0f, 5.0f)
                reflectiveCurveTo(10.55f, 6.0f, 10.0f, 6.0f)
                reflectiveCurveTo(9.0f, 5.55f, 9.0f, 5.0f)
                reflectiveCurveTo(9.45f, 4.0f, 10.0f, 4.0f)
                close()
            }
        }
        .build()
        return _washingMachineOff!!
    }

private var _washingMachineOff: ImageVector? = null