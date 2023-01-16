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

public val MaterialDesignIcons.DeskLamp: ImageVector
    get() {
        if (_deskLamp != null) {
            return _deskLamp!!
        }
        _deskLamp = Builder(name = "DeskLamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.85f, 2.0f)
                lineTo(9.18f, 4.5f)
                lineTo(10.32f, 5.25f)
                lineTo(7.14f, 10.0f)
                curveTo(7.1f, 10.0f, 7.05f, 10.0f, 7.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 12.0f)
                curveTo(5.0f, 12.94f, 5.66f, 13.75f, 6.58f, 13.95f)
                lineTo(10.62f, 20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                lineTo(8.53f, 13.28f)
                curveTo(8.83f, 12.92f, 9.0f, 12.47f, 9.0f, 12.0f)
                curveTo(9.0f, 11.7f, 8.93f, 11.4f, 8.8f, 11.13f)
                lineTo(12.0f, 6.37f)
                curveTo(11.78f, 8.05f, 12.75f, 9.89f, 14.45f, 11.0f)
                lineTo(18.89f, 4.37f)
                curveTo(17.2f, 3.24f, 15.12f, 3.04f, 13.65f, 3.87f)
                lineTo(10.85f, 2.0f)
                moveTo(18.33f, 7.0f)
                lineTo(16.67f, 9.5f)
                curveTo(17.35f, 9.95f, 18.29f, 9.77f, 18.75f, 9.08f)
                curveTo(19.21f, 8.39f, 19.0f, 7.46f, 18.33f, 7.0f)
                close()
            }
        }
        .build()
        return _deskLamp!!
    }

private var _deskLamp: ImageVector? = null