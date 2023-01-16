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

public val MaterialDesignIcons.LightningBoltOutline: ImageVector
    get() {
        if (_lightningBoltOutline != null) {
            return _lightningBoltOutline!!
        }
        _lightningBoltOutline = Builder(name = "LightningBoltOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.47f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.76f)
                lineTo(13.0f, 14.53f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.24f)
                lineTo(11.0f, 9.47f)
                moveTo(13.0f, 1.0f)
                lineTo(6.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.0f)
                lineTo(18.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _lightningBoltOutline!!
    }

private var _lightningBoltOutline: ImageVector? = null