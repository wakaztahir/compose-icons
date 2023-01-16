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

public val MaterialDesignIcons.Shark: ImageVector
    get() {
        if (_shark != null) {
            return _shark!!
        }
        _shark = Builder(name = "Shark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.56f, 9.09f)
                curveTo(14.66f, 7.18f, 12.54f, 6.0f, 11.0f, 6.0f)
                curveTo(11.47f, 7.4f, 11.28f, 8.57f, 10.95f, 9.43f)
                curveTo(8.45f, 10.0f, 6.0f, 11.0f, 6.0f, 11.0f)
                reflectiveCurveTo(3.0f, 7.0f, 1.0f, 7.0f)
                lineTo(3.0f, 13.0f)
                lineTo(2.0f, 17.0f)
                curveTo(4.0f, 17.0f, 6.0f, 14.0f, 6.0f, 14.0f)
                reflectiveCurveTo(11.0f, 16.0f, 14.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(14.65f, 18.0f, 15.91f, 17.17f, 16.73f, 15.77f)
                curveTo(17.97f, 15.56f, 19.0f, 15.21f, 19.87f, 14.81f)
                curveTo(19.72f, 14.63f, 19.53f, 14.44f, 19.28f, 14.3f)
                curveTo(18.63f, 13.91f, 17.82f, 13.67f, 17.0f, 13.5f)
                curveTo(17.82f, 13.34f, 18.67f, 13.22f, 19.59f, 13.35f)
                curveTo(20.05f, 13.41f, 20.54f, 13.54f, 21.0f, 13.86f)
                curveTo(21.1f, 13.92f, 21.17f, 14.0f, 21.24f, 14.05f)
                curveTo(22.4f, 13.26f, 23.0f, 12.44f, 23.0f, 12.0f)
                curveTo(23.0f, 11.13f, 19.19f, 9.5f, 15.56f, 9.09f)
                moveTo(18.0f, 12.0f)
                curveTo(17.45f, 12.0f, 17.0f, 11.55f, 17.0f, 11.0f)
                curveTo(17.0f, 10.76f, 17.1f, 10.55f, 17.23f, 10.38f)
                curveTo(17.84f, 10.5f, 18.43f, 10.67f, 18.97f, 10.84f)
                curveTo(19.0f, 10.89f, 19.0f, 10.94f, 19.0f, 11.0f)
                curveTo(19.0f, 11.55f, 18.55f, 12.0f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _shark!!
    }

private var _shark: ImageVector? = null