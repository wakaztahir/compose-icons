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

public val MaterialDesignIcons.PrinterPosWrench: ImageVector
    get() {
        if (_printerPosWrench != null) {
            return _printerPosWrench!!
        }
        _printerPosWrench = Builder(name = "PrinterPosWrench", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 17.13f, 11.39f, 18.16f, 12.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 10.9f, 4.89f, 10.0f, 6.0f, 10.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 10.0f, 20.0f, 10.9f, 20.0f, 12.0f)
                verticalLineTo(13.03f)
                curveTo(19.09f, 11.8f, 17.64f, 11.0f, 16.0f, 11.0f)
                curveTo(13.24f, 11.0f, 11.0f, 13.24f, 11.0f, 16.0f)
                moveTo(10.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                moveTo(22.87f, 21.19f)
                lineTo(18.76f, 17.08f)
                curveTo(19.17f, 16.04f, 18.94f, 14.82f, 18.08f, 13.97f)
                curveTo(17.18f, 13.06f, 15.83f, 12.88f, 14.74f, 13.38f)
                lineTo(16.68f, 15.32f)
                lineTo(15.33f, 16.68f)
                lineTo(13.34f, 14.73f)
                curveTo(12.8f, 15.82f, 13.05f, 17.17f, 13.93f, 18.08f)
                curveTo(14.79f, 18.94f, 16.0f, 19.16f, 17.05f, 18.76f)
                lineTo(21.16f, 22.86f)
                curveTo(21.34f, 23.05f, 21.61f, 23.05f, 21.79f, 22.86f)
                lineTo(22.83f, 21.83f)
                curveTo(23.05f, 21.65f, 23.05f, 21.33f, 22.87f, 21.19f)
                close()
            }
        }
        .build()
        return _printerPosWrench!!
    }

private var _printerPosWrench: ImageVector? = null