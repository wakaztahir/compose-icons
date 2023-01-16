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

public val MaterialDesignIcons.WallSconceRoundVariantOutline: ImageVector
    get() {
        if (_wallSconceRoundVariantOutline != null) {
            return _wallSconceRoundVariantOutline!!
        }
        _wallSconceRoundVariantOutline = Builder(name = "WallSconceRoundVariantOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                moveTo(4.91f, 7.5f)
                lineTo(3.5f, 8.91f)
                lineTo(5.27f, 10.68f)
                lineTo(6.68f, 9.27f)
                lineTo(4.91f, 7.5f)
                moveTo(19.09f, 7.5f)
                lineTo(17.32f, 9.27f)
                lineTo(18.73f, 10.68f)
                lineTo(20.5f, 8.91f)
                lineTo(19.09f, 7.5f)
                moveTo(17.66f, 14.0f)
                curveTo(17.19f, 15.33f, 16.26f, 16.5f, 15.0f, 17.19f)
                curveTo(14.08f, 17.72f, 13.04f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(9.92f, 17.72f, 9.0f, 17.19f)
                curveTo(7.74f, 16.5f, 6.81f, 15.33f, 6.34f, 14.0f)
                horizontalLineTo(17.66f)
                moveTo(20.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 14.86f, 5.5f, 17.5f, 8.0f, 18.93f)
                curveTo(9.25f, 19.65f, 10.63f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(14.75f, 19.65f, 16.0f, 18.93f)
                curveTo(18.5f, 17.5f, 20.0f, 14.86f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _wallSconceRoundVariantOutline!!
    }

private var _wallSconceRoundVariantOutline: ImageVector? = null