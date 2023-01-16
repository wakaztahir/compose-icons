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

public val MaterialDesignIcons.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.7f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.3f)
                lineTo(14.0f, 17.7f)
                moveTo(17.0f, 3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                moveTo(15.0f, 7.0f)
                lineTo(14.0f, 7.7f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.3f)
                lineTo(9.0f, 11.0f)
                verticalLineTo(12.0f)
                lineTo(15.0f, 8.1f)
                verticalLineTo(7.0f)
                moveTo(15.0f, 11.0f)
                lineTo(14.0f, 11.7f)
                verticalLineTo(9.7f)
                lineTo(10.0f, 12.4f)
                verticalLineTo(14.4f)
                lineTo(9.0f, 15.0f)
                verticalLineTo(16.0f)
                lineTo(15.0f, 12.1f)
                verticalLineTo(11.0f)
                moveTo(15.0f, 15.0f)
                lineTo(14.0f, 15.7f)
                verticalLineTo(13.7f)
                lineTo(10.0f, 16.4f)
                verticalLineTo(18.4f)
                lineTo(9.0f, 19.0f)
                verticalLineTo(20.0f)
                lineTo(15.0f, 16.1f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null