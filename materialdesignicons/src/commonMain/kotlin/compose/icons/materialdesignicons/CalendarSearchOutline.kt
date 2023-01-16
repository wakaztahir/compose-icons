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

public val MaterialDesignIcons.CalendarSearchOutline: ImageVector
    get() {
        if (_calendarSearchOutline != null) {
            return _calendarSearchOutline!!
        }
        _calendarSearchOutline = Builder(name = "CalendarSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3f, 18.9f)
                curveTo(19.7f, 18.2f, 20.0f, 17.4f, 20.0f, 16.5f)
                curveTo(20.0f, 14.0f, 18.0f, 12.0f, 15.5f, 12.0f)
                reflectiveCurveTo(11.0f, 14.0f, 11.0f, 16.5f)
                reflectiveCurveTo(13.0f, 21.0f, 15.5f, 21.0f)
                curveTo(16.4f, 21.0f, 17.2f, 20.8f, 17.9f, 20.3f)
                lineTo(21.0f, 23.4f)
                lineTo(22.4f, 22.0f)
                lineTo(19.3f, 18.9f)
                moveTo(15.5f, 19.0f)
                curveTo(14.1f, 19.0f, 13.0f, 17.9f, 13.0f, 16.5f)
                reflectiveCurveTo(14.1f, 14.0f, 15.5f, 14.0f)
                reflectiveCurveTo(18.0f, 15.1f, 18.0f, 16.5f)
                reflectiveCurveTo(16.9f, 19.0f, 15.5f, 19.0f)
                moveTo(5.0f, 19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                curveTo(19.8f, 11.5f, 20.5f, 12.2f, 21.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(10.8f)
                curveTo(10.2f, 20.4f, 9.8f, 19.8f, 9.5f, 19.0f)
                horizontalLineTo(5.0f)
                moveTo(19.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _calendarSearchOutline!!
    }

private var _calendarSearchOutline: ImageVector? = null