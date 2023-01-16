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

public val MaterialDesignIcons.ArrowLeftBottomBold: ImageVector
    get() {
        if (_arrowLeftBottomBold != null) {
            return _arrowLeftBottomBold!!
        }
        _arrowLeftBottomBold = Builder(name = "ArrowLeftBottomBold", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.5f)
                curveTo(21.0f, 14.64f, 17.64f, 18.0f, 13.5f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                lineTo(4.0f, 16.0f)
                lineTo(11.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.5f)
                curveTo(15.43f, 14.0f, 17.0f, 12.43f, 17.0f, 10.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _arrowLeftBottomBold!!
    }

private var _arrowLeftBottomBold: ImageVector? = null