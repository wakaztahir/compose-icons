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

public val MaterialDesignIcons.StickerRemove: ImageVector
    get() {
        if (_stickerRemove != null) {
            return _stickerRemove!!
        }
        _stickerRemove = Builder(name = "StickerRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                horizontalLineTo(5.5f)
                curveTo(3.6f, 2.0f, 2.0f, 3.6f, 2.0f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(2.0f, 20.4f, 3.6f, 22.0f, 5.5f, 22.0f)
                horizontalLineTo(16.0f)
                lineTo(22.0f, 16.0f)
                verticalLineTo(5.5f)
                curveTo(22.0f, 3.6f, 20.4f, 2.0f, 18.5f, 2.0f)
                moveTo(12.0f, 13.4f)
                lineTo(9.9f, 15.5f)
                lineTo(8.5f, 14.1f)
                lineTo(10.6f, 12.0f)
                lineTo(8.5f, 9.9f)
                lineTo(9.9f, 8.5f)
                lineTo(12.0f, 10.6f)
                lineTo(14.1f, 8.5f)
                lineTo(15.5f, 9.9f)
                lineTo(13.4f, 12.0f)
                lineTo(15.5f, 14.1f)
                lineTo(14.1f, 15.5f)
                lineTo(12.0f, 13.4f)
                moveTo(15.0f, 20.0f)
                verticalLineTo(18.5f)
                curveTo(15.0f, 16.6f, 16.6f, 15.0f, 18.5f, 15.0f)
                horizontalLineTo(20.0f)
                lineTo(15.0f, 20.0f)
                close()
            }
        }
        .build()
        return _stickerRemove!!
    }

private var _stickerRemove: ImageVector? = null