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

public val MaterialDesignIcons.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineTo(4.0f)
                lineTo(20.0f, 12.0f)
                lineTo(12.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null