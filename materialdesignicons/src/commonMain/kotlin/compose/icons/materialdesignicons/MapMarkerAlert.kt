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

public val MaterialDesignIcons.MapMarkerAlert: ImageVector
    get() {
        if (_mapMarkerAlert != null) {
            return _mapMarkerAlert!!
        }
        _mapMarkerAlert = Builder(name = "MapMarkerAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.9f, 2.0f, 19.0f, 5.1f, 19.0f, 9.0f)
                curveTo(19.0f, 14.2f, 12.0f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(5.0f, 14.2f, 5.0f, 9.0f)
                curveTo(5.0f, 5.1f, 8.1f, 2.0f, 12.0f, 2.0f)
                moveTo(11.0f, 6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _mapMarkerAlert!!
    }

private var _mapMarkerAlert: ImageVector? = null