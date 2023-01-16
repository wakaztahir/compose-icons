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

public val MaterialDesignIcons.SwapHorizontalVariant: ImageVector
    get() {
        if (_swapHorizontalVariant != null) {
            return _swapHorizontalVariant!!
        }
        _swapHorizontalVariant = Builder(name = "SwapHorizontalVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(8.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 11.0f)
                horizontalLineTo(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                lineTo(20.0f, 18.0f)
                lineTo(16.0f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 13.0f)
                horizontalLineTo(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                lineTo(4.0f, 6.0f)
                close()
            }
        }
        .build()
        return _swapHorizontalVariant!!
    }

private var _swapHorizontalVariant: ImageVector? = null