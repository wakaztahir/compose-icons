package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NotificationsPaused: ImageVector
    get() {
        if (_notificationsPaused != null) {
            return _notificationsPaused!!
        }
        _notificationsPaused = Builder(name = "NotificationsPaused", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f)
                lineTo(13.5f, 2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.18f)
                curveTo(7.63f, 5.36f, 6.0f, 7.93f, 6.0f, 11.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(14.5f, 9.8f)
                lineToRelative(-2.8f, 3.4f)
                horizontalLineToRelative(2.8f)
                lineTo(14.5f, 15.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.8f)
                lineToRelative(2.8f, -3.4f)
                lineTo(9.5f, 9.8f)
                lineTo(9.5f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.8f)
                close()
            }
        }
        .build()
        return _notificationsPaused!!
    }

private var _notificationsPaused: ImageVector? = null
