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

public val MaterialDesignIcons.FormatColorText: ImageVector
    get() {
        if (_formatColorText != null) {
            return _formatColorText!!
        }
        _formatColorText = Builder(name = "FormatColorText", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.62f, 12.0f)
                lineTo(12.0f, 5.67f)
                lineTo(14.37f, 12.0f)
                moveTo(11.0f, 3.0f)
                lineTo(5.5f, 17.0f)
                horizontalLineTo(7.75f)
                lineTo(8.87f, 14.0f)
                horizontalLineTo(15.12f)
                lineTo(16.25f, 17.0f)
                horizontalLineTo(18.5f)
                lineTo(13.0f, 3.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _formatColorText!!
    }

private var _formatColorText: ImageVector? = null