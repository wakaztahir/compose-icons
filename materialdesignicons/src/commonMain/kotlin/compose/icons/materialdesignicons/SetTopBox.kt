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

public val MaterialDesignIcons.SetTopBox: ImageVector
    get() {
        if (_setTopBox != null) {
            return _setTopBox!!
        }
        _setTopBox = Builder(name = "SetTopBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 16.0f)
                horizontalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 15.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 14.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 10.0f)
                horizontalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 11.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 20.5f, 16.0f)
                horizontalLineTo(19.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 19.0f, 15.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.5f)
                moveTo(3.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                moveTo(6.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                moveTo(20.5f, 11.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.5f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.5f, 13.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.5f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.5f, 11.5f)
                close()
            }
        }
        .build()
        return _setTopBox!!
    }

private var _setTopBox: ImageVector? = null