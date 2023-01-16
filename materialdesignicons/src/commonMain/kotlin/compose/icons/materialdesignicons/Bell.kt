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

public val MaterialDesignIcons.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                lineTo(5.0f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 7.9f, 7.03f, 5.17f, 10.0f, 4.29f)
                curveTo(10.0f, 4.19f, 10.0f, 4.1f, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 4.0f)
                curveTo(14.0f, 4.1f, 14.0f, 4.19f, 14.0f, 4.29f)
                curveTo(16.97f, 5.17f, 19.0f, 7.9f, 19.0f, 11.0f)
                verticalLineTo(17.0f)
                lineTo(21.0f, 19.0f)
                moveTo(14.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 23.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 21.0f)
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null