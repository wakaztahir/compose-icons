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

public val MaterialDesignIcons.HomeLightbulbOutline: ImageVector
    get() {
        if (_homeLightbulbOutline != null) {
            return _homeLightbulbOutline!!
        }
        _homeLightbulbOutline = Builder(name = "HomeLightbulbOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                lineTo(12.0f, 3.0f)
                lineTo(22.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                moveTo(12.0f, 5.69f)
                lineTo(7.0f, 10.19f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.19f)
                lineTo(12.0f, 5.69f)
                moveTo(11.0f, 17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 15.0f)
                curveTo(10.72f, 15.0f, 10.5f, 14.78f, 10.5f, 14.5f)
                verticalLineTo(13.6f)
                curveTo(9.6f, 13.08f, 9.0f, 12.11f, 9.0f, 11.0f)
                curveTo(9.0f, 9.34f, 10.34f, 8.0f, 12.0f, 8.0f)
                curveTo(13.66f, 8.0f, 15.0f, 9.34f, 15.0f, 11.0f)
                curveTo(15.0f, 12.11f, 14.4f, 13.08f, 13.5f, 13.6f)
                verticalLineTo(14.5f)
                curveTo(13.5f, 14.78f, 13.28f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _homeLightbulbOutline!!
    }

private var _homeLightbulbOutline: ImageVector? = null