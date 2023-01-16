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

public val MaterialDesignIcons.Water: ImageVector
    get() {
        if (_water != null) {
            return _water!!
        }
        _water = Builder(name = "Water", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 14.0f)
                curveTo(6.0f, 10.0f, 12.0f, 3.25f, 12.0f, 3.25f)
                curveTo(12.0f, 3.25f, 18.0f, 10.0f, 18.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _water!!
    }

private var _water: ImageVector? = null