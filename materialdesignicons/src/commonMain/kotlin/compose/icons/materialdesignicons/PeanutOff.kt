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

public val MaterialDesignIcons.PeanutOff: ImageVector
    get() {
        if (_peanutOff != null) {
            return _peanutOff!!
        }
        _peanutOff = Builder(name = "PeanutOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9f, 10.12f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 13.08f, 2.12f)
                arcTo(5.74f, 5.74f, 0.0f, false, false, 12.0f, 2.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.68f, 4.5f)
                lineTo(16.38f, 13.18f)
                arcTo(4.35f, 4.35f, 0.0f, false, false, 16.04f, 12.77f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.9f, 10.12f)
                moveTo(13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 14.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 7.0f)
                moveTo(7.0f, 6.39f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(7.8f, 9.69f)
                curveTo(7.9f, 9.84f, 8.0f, 10.0f, 8.11f, 10.12f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 12.72f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 10.81f, 21.87f)
                arcTo(5.42f, 5.42f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 17.0f, 18.86f)
                lineTo(20.87f, 22.73f)
                lineTo(22.14f, 21.46f)
                moveTo(11.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 12.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 18.0f)
                moveTo(14.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 15.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 19.0f)
                moveTo(13.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.35f, 14.24f)
                lineTo(13.76f, 15.65f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 16.0f)
                close()
            }
        }
        .build()
        return _peanutOff!!
    }

private var _peanutOff: ImageVector? = null