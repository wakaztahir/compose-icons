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

public val MaterialDesignIcons.ApplicationBracketsOutline: ImageVector
    get() {
        if (_applicationBracketsOutline != null) {
            return _applicationBracketsOutline!!
        }
        _applicationBracketsOutline = Builder(name = "ApplicationBracketsOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 8.5f)
                lineTo(11.0f, 10.0f)
                lineTo(8.0f, 13.0f)
                lineTo(11.0f, 16.0f)
                lineTo(9.5f, 17.5f)
                lineTo(5.0f, 13.0f)
                lineTo(9.5f, 8.5f)
                moveTo(14.5f, 17.5f)
                lineTo(13.0f, 16.0f)
                lineTo(16.0f, 13.0f)
                lineTo(13.0f, 10.0f)
                lineTo(14.5f, 8.5f)
                lineTo(19.0f, 13.0f)
                lineTo(14.5f, 17.5f)
                moveTo(21.0f, 2.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 22.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 2.0f)
                moveTo(21.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _applicationBracketsOutline!!
    }

private var _applicationBracketsOutline: ImageVector? = null