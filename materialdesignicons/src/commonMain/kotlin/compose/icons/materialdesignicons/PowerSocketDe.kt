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

public val MaterialDesignIcons.PowerSocketDe: ImageVector
    get() {
        if (_powerSocketDe != null) {
            return _powerSocketDe!!
        }
        _powerSocketDe = Builder(name = "PowerSocketDe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.22f, 2.0f)
                arcTo(2.22f, 2.22f, 0.0f, false, false, 2.0f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(2.0f, 21.0f, 3.0f, 22.0f, 4.22f, 22.0f)
                horizontalLineTo(19.78f)
                arcTo(2.22f, 2.22f, 0.0f, false, false, 22.0f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(22.0f, 3.0f, 21.0f, 2.0f, 19.78f, 2.0f)
                horizontalLineTo(4.22f)
                moveTo(11.0f, 4.07f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.07f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 13.0f, 19.93f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.93f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 11.0f, 4.07f)
                moveTo(7.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 12.0f)
                curveTo(6.0f, 12.83f, 6.66f, 13.5f, 7.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 10.5f)
                moveTo(16.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 10.5f)
                close()
            }
        }
        .build()
        return _powerSocketDe!!
    }

private var _powerSocketDe: ImageVector? = null