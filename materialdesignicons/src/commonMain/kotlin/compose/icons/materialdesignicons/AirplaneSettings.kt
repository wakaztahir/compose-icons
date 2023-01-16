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

public val MaterialDesignIcons.AirplaneSettings: ImageVector
    get() {
        if (_airplaneSettings != null) {
            return _airplaneSettings!!
        }
        _airplaneSettings = Builder(name = "AirplaneSettings", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.09f, 4.56f)
                lineTo(16.2f, 8.45f)
                lineTo(18.32f, 17.64f)
                lineTo(16.91f, 19.06f)
                lineTo(13.0f, 11.63f)
                lineTo(9.13f, 15.5f)
                lineTo(9.5f, 18.0f)
                lineTo(8.42f, 19.06f)
                lineTo(6.65f, 15.87f)
                lineTo(3.47f, 14.11f)
                lineTo(4.53f, 13.04f)
                lineTo(7.0f, 13.4f)
                lineTo(10.9f, 9.5f)
                lineTo(3.47f, 5.62f)
                lineTo(4.89f, 4.21f)
                lineTo(14.08f, 6.33f)
                lineTo(17.97f, 2.44f)
                curveTo(18.55f, 1.85f, 19.5f, 1.85f, 20.09f, 2.44f)
                curveTo(20.68f, 3.0f, 20.68f, 3.97f, 20.09f, 4.56f)
                moveTo(7.0f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                moveTo(11.0f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                moveTo(15.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _airplaneSettings!!
    }

private var _airplaneSettings: ImageVector? = null