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

public val MaterialDesignIcons.Tilde: ImageVector
    get() {
        if (_tilde != null) {
            return _tilde!!
        }
        _tilde = Builder(name = "Tilde", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 15.0f, 2.0f, 9.0f, 8.0f, 9.0f)
                curveTo(12.0f, 9.0f, 12.5f, 12.5f, 15.5f, 12.5f)
                curveTo(19.5f, 12.5f, 19.5f, 9.0f, 19.5f, 9.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 9.0f, 22.0f, 15.0f, 16.0f, 15.0f)
                curveTo(12.0f, 15.0f, 10.5f, 11.5f, 8.5f, 11.5f)
                curveTo(4.5f, 11.5f, 4.5f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(2.0f)
            }
        }
        .build()
        return _tilde!!
    }

private var _tilde: ImageVector? = null