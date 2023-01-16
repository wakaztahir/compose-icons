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

public val MaterialDesignIcons.CalendarBadgeOutline: ImageVector
    get() {
        if (_calendarBadgeOutline != null) {
            return _calendarBadgeOutline!!
        }
        _calendarBadgeOutline = Builder(name = "CalendarBadgeOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 16.0f)
                curveTo(17.6f, 16.0f, 16.0f, 17.6f, 16.0f, 19.5f)
                reflectiveCurveTo(17.6f, 23.0f, 19.5f, 23.0f)
                reflectiveCurveTo(23.0f, 21.4f, 23.0f, 19.5f)
                reflectiveCurveTo(21.4f, 16.0f, 19.5f, 16.0f)
                moveTo(14.0f, 19.5f)
                curveTo(14.0f, 19.33f, 14.0f, 19.17f, 14.03f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.03f)
                curveTo(19.17f, 14.0f, 19.33f, 14.0f, 19.5f, 14.0f)
                curveTo(20.0f, 14.0f, 20.5f, 14.08f, 21.0f, 14.21f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(14.21f)
                curveTo(14.08f, 20.5f, 14.0f, 20.0f, 14.0f, 19.5f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _calendarBadgeOutline!!
    }

private var _calendarBadgeOutline: ImageVector? = null