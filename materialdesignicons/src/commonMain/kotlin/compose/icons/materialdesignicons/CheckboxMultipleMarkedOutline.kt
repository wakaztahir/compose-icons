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

public val MaterialDesignIcons.CheckboxMultipleMarkedOutline: ImageVector
    get() {
        if (_checkboxMultipleMarkedOutline != null) {
            return _checkboxMultipleMarkedOutline!!
        }
        _checkboxMultipleMarkedOutline = Builder(name = "CheckboxMultipleMarkedOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 18.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 18.0f, 6.0f, 17.1f, 6.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(6.0f, 2.89f, 6.89f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                moveTo(10.91f, 7.08f)
                lineTo(14.0f, 10.17f)
                lineTo(20.59f, 3.58f)
                lineTo(22.0f, 5.0f)
                lineTo(14.0f, 13.0f)
                lineTo(9.5f, 8.5f)
                lineTo(10.91f, 7.08f)
                moveTo(16.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _checkboxMultipleMarkedOutline!!
    }

private var _checkboxMultipleMarkedOutline: ImageVector? = null