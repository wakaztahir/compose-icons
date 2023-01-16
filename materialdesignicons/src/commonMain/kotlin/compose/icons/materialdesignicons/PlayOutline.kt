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

public val MaterialDesignIcons.PlayOutline: ImageVector
    get() {
        if (_playOutline != null) {
            return _playOutline!!
        }
        _playOutline = Builder(name = "PlayOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 8.64f)
                lineTo(13.77f, 12.0f)
                lineTo(8.5f, 15.36f)
                verticalLineTo(8.64f)
                moveTo(6.5f, 5.0f)
                verticalLineTo(19.0f)
                lineTo(17.5f, 12.0f)
            }
        }
        .build()
        return _playOutline!!
    }

private var _playOutline: ImageVector? = null