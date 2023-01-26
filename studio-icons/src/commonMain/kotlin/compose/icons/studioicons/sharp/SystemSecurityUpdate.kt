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

public val SharpGroup.SystemSecurityUpdate: ImageVector
    get() {
        if (_systemSecurityUpdate != null) {
            return _systemSecurityUpdate!!
        }
        _systemSecurityUpdate = Builder(name = "SystemSecurityUpdate", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 1.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(8.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _systemSecurityUpdate!!
    }

private var _systemSecurityUpdate: ImageVector? = null
