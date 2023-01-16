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

public val MaterialDesignIcons.PercentCircle: ImageVector
    get() {
        if (_percentCircle != null) {
            return _percentCircle!!
        }
        _percentCircle = Builder(name = "PercentCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(8.83f, 7.05f)
                curveTo(9.81f, 7.05f, 10.6f, 7.84f, 10.6f, 8.83f)
                curveTo(10.6f, 9.81f, 9.81f, 10.6f, 8.83f, 10.6f)
                curveTo(7.84f, 10.6f, 7.05f, 9.81f, 7.05f, 8.83f)
                curveTo(7.05f, 7.84f, 7.84f, 7.05f, 8.83f, 7.05f)
                moveTo(15.22f, 17.0f)
                curveTo(14.24f, 17.0f, 13.45f, 16.2f, 13.45f, 15.22f)
                curveTo(13.45f, 14.24f, 14.24f, 13.45f, 15.22f, 13.45f)
                curveTo(16.2f, 13.45f, 17.0f, 14.24f, 17.0f, 15.22f)
                curveTo(17.0f, 16.2f, 16.2f, 17.0f, 15.22f, 17.0f)
                moveTo(8.5f, 17.03f)
                lineTo(7.0f, 15.53f)
                lineTo(15.53f, 7.0f)
                lineTo(17.03f, 8.5f)
                lineTo(8.5f, 17.03f)
                close()
            }
        }
        .build()
        return _percentCircle!!
    }

private var _percentCircle: ImageVector? = null