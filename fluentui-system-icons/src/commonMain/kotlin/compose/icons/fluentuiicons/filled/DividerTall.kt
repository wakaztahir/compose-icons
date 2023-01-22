package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DividerTall: ImageVector
    get() {
        if (_dividerTall != null) {
            return _dividerTall!!
        }
        _dividerTall = Builder(name = "DividerTall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(11.0f, 21.5523f, 11.4477f, 22.0f, 12.0f, 22.0f)
                curveTo(12.5523f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(13.0f, 2.4477f, 12.5523f, 2.0f, 12.0f, 2.0f)
                curveTo(11.4477f, 2.0f, 11.0f, 2.4477f, 11.0f, 3.0f)
                close()
            }
        }
        .build()
        return _dividerTall!!
    }

private var _dividerTall: ImageVector? = null